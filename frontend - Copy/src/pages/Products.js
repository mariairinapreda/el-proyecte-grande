import {BASE_PATH, CART_PRODUCTS, CART_PRODUCTS_NUMBER, SEARCH_TEXT, USER, USER_PATH} from "../atoms/STORE";
import {useAtom} from "jotai";
import {useEffect, useState} from "react";
import axios from "axios";
import Navigation from "../components/navigation/Navigation";
import ProductsContainer from "../wrappers/products-container/ProductsContainer";
import Card from "../wrappers/card/Card";
import Details from "../wrappers/card/details/Details";
import Detail from "../wrappers/card/details/Detail";


const defaultFilter = {
    searchText: SEARCH_TEXT,
    minPrice: 0,
    maxPrice: 0,
    producers: [],
    categories: []
}

const Products = () => {
    const [user] = useAtom(USER);
    const [, setCartItems] = useAtom(CART_PRODUCTS);
    const [, setCartItemsCount] = useAtom(CART_PRODUCTS_NUMBER);
    const [products, setProducts] = useState([]);
    const [atomSearchText, setSearchText] = useAtom(SEARCH_TEXT);
    const [simpleFilter, setSimpleFilter] = useState({
        searchText: atomSearchText,
        minPrice: 0,
        maxPrice: 0,
        producers: [],
        categories: []
    })
    const [availableFilter, setAvailableFilter] = useState({
        minPrice: 0,
        maxPrice: 0,
        producers: [],
        categories: []
    })
    const url = `${USER_PATH}/cart-item`;
    let {minPrice, maxPrice, producers, categories} =  availableFilter;
    useEffect(() => {
        if (simpleFilter.searchText === ""){
            axios
                .get(`${BASE_PATH}/products`)
                .then((r) => {
                    r.data.forEach(p => {

                        if (minPrice > p.price || minPrice === 0){
                            minPrice= p.price
                        }
                        if (maxPrice < p.price || maxPrice === 0){
                            maxPrice= p.price
                        }
                        if (producers.indexOf(p.producer.name)===-1){
                            producers.push(p.producer.name);
                        }
                        if (categories.indexOf(p.category.name)===-1){
                            categories.push(p.category.name);
                        }

                    })
                    setAvailableFilter({minPrice: minPrice, maxPrice: maxPrice, producers: producers, categories: categories});
                    let filterMinPrice = simpleFilter.minPrice;
                    let filterMaxPrice = simpleFilter.maxPrice;
                    if (minPrice > filterMinPrice) filterMinPrice = minPrice;
                    if (maxPrice < filterMaxPrice || filterMaxPrice === 0) filterMaxPrice = maxPrice;
                    setSimpleFilter({...simpleFilter, minPrice: filterMinPrice, maxPrice: filterMaxPrice})
                    setProducts(r.data)
                });
        }
        else if (simpleFilter === defaultFilter){
            axios
                .get(`${BASE_PATH}/products/search/${simpleFilter.searchText}`)
                .then((r) => setProducts(r.data));
        }
        else
        {axios
            .post(`${BASE_PATH}/products/search`, simpleFilter)
            .then((r) => setProducts(r.data));
        }
    }, [simpleFilter]);

    const addToCart = (e) => {
        e.preventDefault();
        let data = {
            product: { id: parseInt(e.target.id) },
            client: { id: parseInt(user.id) },
            quantity: 1,
        };
        console.log(data);
        axios
            .post(url, data, {
                headers: {
                    authorization: user.token,
                },
            })
            .then((r) => {
                if (r.status === 200) {
                    axios
                        .get(`${url}/${user.id}`, {
                            headers: {
                                authorization: user.token,
                            },
                        })
                        .then((r) => {
                            setCartItems(r.data);
                            let count = 0;
                            for (let item of r.data) {
                                count += item.quantity;
                            }
                            setCartItemsCount(count);
                        });
                } else console.log(r.data);
            });
    };

    return (
        <>
            <Navigation />
            <h1 style={{ marginTop: 100, textAlign: "center" }}>{"toate produsele"}</h1>

            <ProductsContainer>
                {products.map((p) => (
                    <Card
                        key={`product_${p.id}`}
                        imageUrl={p.imageNames[0]}
                        title={p.name}
                        onAdd={addToCart}
                        price={p.price}
                        productId={p.id}
                        details={
                            <Details
                                details={
                                    <>
                                        {p.specs.map((spec, index) => (
                                            <Detail
                                                key={`spec_${spec.id}_${index}`}
                                                name={spec.categorySpec.name}
                                                value={
                                                    spec.categorySpec.type === "text"
                                                        ? spec.stringValue
                                                        : spec.numberValue
                                                }
                                            />
                                        ))}
                                    </>
                                }
                            />
                        }
                    />
                ))}
            </ProductsContainer>
        </>
    );
};

export default Products;

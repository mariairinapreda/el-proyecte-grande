import { useParams } from "react-router-dom";
import Navigation from "../../components/navigation/Navigation";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import { useEffect, useState } from "react";
import Card from "../../wrappers/card/Card";
import axios from "axios";
import {
  BASE_PATH,
  CART_PRODUCTS,
  CART_PRODUCTS_NUMBER,
  USER,
  USER_PATH,
} from "../../atoms/STORE";
import Details from "../../wrappers/card/details/Details";
import Detail from "../../wrappers/card/details/Detail";
import { useAtom } from "jotai";

const CategoryProducts = () => {
  const [user] = useAtom(USER);
  const [, setCartItems] = useAtom(CART_PRODUCTS);
  const [, setCartItemsCount] = useAtom(CART_PRODUCTS_NUMBER);
  const { categoryName } = useParams();
  const [products, setProducts] = useState([]);
  const url = `${USER_PATH}/cart-item`;
  console.log(categoryName);
  useEffect(() => {
    axios
      .get(`${BASE_PATH}/products/category/${categoryName}`)
      .then((r) => setProducts(r.data));
  }, [categoryName]);

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
      <h1 style={{ marginTop: 100, textAlign: "center" }}>{categoryName}</h1>
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

export default CategoryProducts;

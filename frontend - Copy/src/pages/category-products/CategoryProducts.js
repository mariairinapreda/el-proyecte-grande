import { useParams } from "react-router-dom";
import Navigation from "../../components/navigation/Navigation";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import { useEffect, useState } from "react";
import Card from "../../wrappers/card/Card";
import axios from "axios";
import { BASE_PATH } from "../../atoms/STORE";

const CategoryProducts = () => {
  const { categoryName } = useParams();
  const [products, setProducts] = useState([]);
  console.log(categoryName);
  useEffect(() => {
    axios
      .get(`${BASE_PATH}/products/category/${categoryName}`)
      .then((r) => setProducts(r.data));
  }, [categoryName]);
  return (
    <>
      <Navigation />
      <h1 style={{ marginTop: 100 }}>{categoryName}</h1>
      <ProductsContainer>
        {products.map((p) => (
          <Card key={`product_${p.id}`} />
        ))}
      </ProductsContainer>
    </>
  );
};

export default CategoryProducts;

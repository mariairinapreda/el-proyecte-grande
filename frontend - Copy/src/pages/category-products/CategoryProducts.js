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
      .get(`${BASE_PATH}/products/${categoryName}`)
      .then((r) => setProducts(r.data));
  }, [categoryName]);
  return (
    <>
      <Navigation />
      <ProductsContainer>
        <h1>{categoryName}</h1>
        {products.map((p) => (
          <Card />
        ))}
      </ProductsContainer>
    </>
  );
};

export default CategoryProducts;

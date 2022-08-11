import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import "../scss/first_page.scss";
import ProductsContainer from "../wrappers/products-container/ProductsContainer";
import LandingPageCard from "../wrappers/landing-page-card/LandingPageCard";

const LandingPage = () => {
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8888/categories", { method: "GET" })
      .then((response) => response.json())
      .then((re) => setCategories(re));
  }, []);
  if (categories != null) {
    console.log({ categories });
  }

  return (
    <>
      <ProductsContainer key={"categories"}>
        {categories.map((category,index) => (
          <LandingPageCard
              key={`Category_${index}`}
              url={category.url}
              imageUrl={category.imageUrl}
              name={category.name}
          />
        ))}
      </ProductsContainer>
    </>
  );
};

export default LandingPage;

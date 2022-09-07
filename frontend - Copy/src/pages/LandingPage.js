import { useEffect, useState } from "react";
import "../scss/first_page.scss";
import ProductsContainer from "../wrappers/products-container/ProductsContainer";
import LandingPageCard from "../wrappers/landing-page-card/LandingPageCard";
import Navigation from "../components/navigation/Navigation";

const LandingPage = ({ user }) => {
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
      <Navigation actualUser={user} />
      <ProductsContainer key={"categories"}>
        {categories.map((category, index) => (
          <LandingPageCard
            key={`Category_${index}`}
            url={`/categorii/${category.name}`}
            imageUrl={category.imageUrl}
            name={category.name}
          />
        ))}
      </ProductsContainer>
    </>
  );
};

export default LandingPage;

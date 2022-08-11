import { useEffect, useState } from "react";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import Card from "../../wrappers/card/Card";
import CoolerDetails from "../../wrappers/card/details/cooler-details/CoolerDetails";
import Navigation from "../../components/navigation/Navigation";

const CoolerPage = ({ user }) => {
  const [coolers, setCooler] = useState([
    {
      price: 299.9,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      model: "X9000",
      producer: {
        name: "Aquirys",
      },
      supplier: {
        name: "Bright Xchange",
      },
      description: "bestial",
      dimensions: "12x30x25",
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/coolere.jpg",
    },
  ]);

  useEffect(() => {
    fetch("http://localhost:8888/cooler", { method: "GET" })
      .then((response) => response.json())
      .then((re) => setCooler(re));
  }, []);

  return (
    <>
      <Navigation actualUser={user} />
      <ProductsContainer key={"coolers"}>
        {coolers.map((e, index) => (
          <Card
            key={`cooler_${index}`}
            title={`Cooler ${e.producer.name} ${e.model}`}
            price={e.price}
            currency={e.currency.currency}
            imageUrl={e.imageUrl}
            details={
              <CoolerDetails
                description={e.description}
                dimensions={e.dimensions}
              />
            }
          />
        ))}
      </ProductsContainer>
    </>
  );
};

export default CoolerPage;

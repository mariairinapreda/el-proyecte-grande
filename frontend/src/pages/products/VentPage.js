import { useEffect, useState } from "react";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import Card from "../../wrappers/card/Card";
import VentDetails from "../../wrappers/card/details/vent-details/VentDetails";

const VentPage = () => {
  const [vents, setVents] = useState([
    {
      price: 135,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      rotationSpeed: 1200,
      ventsNumber: 3,
      description: "super bun",
      dimensions: "12x36",
      ventProducer: {
        name: "",
      },
      ventDimensions: "12x12",
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/ventilatoare.jpg",
    },
  ]);

  useEffect(() => {
    fetch("http://localhost:8888/vent", { method: "GET" })
      .then((response) => response.json())
      .then((re) => setVents(re));
  }, []);

  return (
    <ProductsContainer>
      {vents.map((e, index) => (
        <Card
          key={`vent_${e.ventProducer.name}_${index}`}
          title={`Ventilator ${e.ventProducer.name}`}
          imageUrl={e.imageUrl}
          price={e.price}
          currency={e.currency.currency}
          details={
            <VentDetails
              rotationSpeed={e.rotationSpeed}
              ventsNumber={e.ventsNumber}
              description={e.description}
              dimensions={e.dimensions}
              ventDimensions={e.ventDimensions}
            />
          }
        />
      ))}
    </ProductsContainer>
  );
};

export default VentPage;

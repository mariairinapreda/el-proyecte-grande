import { useEffect, useState } from "react";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import Card from "../../wrappers/card/Card";
import HddDetails from "../../wrappers/card/details/hdd-details/HddDetails";

const HddPage = () => {
  const [hdds, setHdds] = useState([
    {
      price: 135,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      rotationSpeed: 350,
      connectionInterface: "SATA-III",
      capacity: 5,
      unit: "TB",
      storageProducer: {
        name: "Samsung",
      },
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/hard-disk-uri.jpg",
    },
  ]);

  useEffect(() => {
    fetch("http://localhost:8888/hdd", { method: "GET" })
      .then((response) => response.json())
      .then((re) => setHdds(re));
  }, []);

  return (
    <ProductsContainer>
      {hdds.map((e, index) => (
        <Card
          key={`hdd_${e.storageProducer}_${index}`}
          title={`Hard-Disk ${e.storageProducer.name} ${e.capacity} ${e.unit}`}
          imageUrl={e.imageUrl}
          price={e.price}
          currency={e.currency.currency}
          details={
            <HddDetails
              connectionInterface={e.connectionInterface}
              capacity={e.capacity}
              unit={e.unit}
            />
          }
        />
      ))}
    </ProductsContainer>
  );
};

export default HddPage;

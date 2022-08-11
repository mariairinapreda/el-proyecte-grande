import { useEffect, useState } from "react";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import Card from "../../wrappers/card/Card";
import SsdDetails from "../../wrappers/card/details/ssd-details/SsdDetails";
import Navigation from "../../components/navigation/Navigation";

const SsdPage = ({ user }) => {
  const [ssds, setSsds] = useState([
    {
      price: 135,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      writeSpeed: 350,
      readSpeed: 450,
      connectionInterface: "",
      capacity: 5,
      unit: "TB",
      storageProducer: {
        name: "",
      },
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/ssd-uri.jpg",
    },
  ]);

  useEffect(() => {
    fetch("http://localhost:8888/ssd", { method: "GET" })
      .then((response) => response.json())
      .then((re) => setSsds(re));
  }, []);

  return (
    <>
      <Navigation actualUser={user} />
      <ProductsContainer>
        {ssds.map((e, index) => (
          <Card
            key={`ssd_${e.storageProducer.name}_${index}`}
            imageUrl={e.imageUrl}
            price={e.price}
            currency={e.currency.currency}
            details={
              <SsdDetails
                connectionInterface={e.connectionInterface}
                capacity={e.capacity}
                unit={e.unit}
                writeSpeed={e.writeSpeed}
                readSpeed={e.readSpeed}
              />
            }
          />
        ))}
      </ProductsContainer>
    </>
  );
};

export default SsdPage;

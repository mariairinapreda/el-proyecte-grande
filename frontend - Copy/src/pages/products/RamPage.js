import { useEffect, useState } from "react";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import Card from "../../wrappers/card/Card";
import RamDetails from "../../wrappers/card/details/ram-details/RamDetails";
import Navigation from "../../components/navigation/Navigation";

const RamPage = ({ user }) => {
  const [rams, setRams] = useState([
    {
      price: 135,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      ramProducer: {
        name: "Corsair",
      },
      memoryType: {
        name: "DDR4",
      },
      capacity: 3,
      frequency: 3200,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/memorii.jpg",
    },
    {
      price: 135,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      ramProducer: {
        name: "Corsair",
      },
      memoryType: {
        name: "DDR4",
      },
      capacity: 3,
      frequency: 3200,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/memorii.jpg",
    },
    {
      price: 135,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      ramProducer: {
        name: "Corsair",
      },
      memoryType: {
        name: "DDR4",
      },
      capacity: 3,
      frequency: 3200,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/cat/memorii.jpg",
    },
  ]);

  useEffect(() => {
    fetch("http://localhost:8888/ram", { method: "GET" })
      .then((response) => response.json())
      .then((re) => setRams(re));
  }, []);

  return (
    <>
      <Navigation actualUser={user} />
      <ProductsContainer>
        {rams.map((e, index) => (
          <Card
            key={`ram_${e.ramProducer.name}_${index}`}
            title={`Memorie RAM ${e.ramProducer.name} ${e.capacity} GB`}
            imageUrl={e.imageUrl}
            price={e.price}
            currency={e.currency.currency}
            details={
              <RamDetails
                memoryType={e.memoryType.name}
                capacity={e.capacity}
                frequency={e.frequency}
              />
            }
          />
        ))}
      </ProductsContainer>
    </>
  );
};

export default RamPage;

import {useEffect, useState} from "react";

const CoolerPage = () => {
  const [cooler, setCooler] = useState([
    {
      price: 233.9,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      description: "",
      dimensions: ""
    }
  ]);

  useEffect(() => {
      fetch("http://localhost:8888/cooler", {method:"GET"})
          .then(response => response.json())
          .then(re => setCooler(re))
  },[])

  return <></>;
};

export default CoolerPage;

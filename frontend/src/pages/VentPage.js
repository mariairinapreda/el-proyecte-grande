import {useEffect, useState} from "react";

const VentPage = () => {
  const [vents, setVents] = useState([{
    price : 135,
    currency : {
      currency: "RON",
    },
    quantity : 5,
    supplier : {
      name: "Bright Xchange",
    },
    rotationSpeed: 1200,
    ventsNumber: 3,
    description: "",
    dimensions: "",
    ventProducer: {
      name: ""
    },
    ventDimensions: ""
  }]);

  useEffect(() => {
    fetch("http://localhost:8888/vent", {method:"GET"})
        .then(response => response.json())
        .then(re => setVents(re))
  },[])

  return <></>;
};

export default VentPage;

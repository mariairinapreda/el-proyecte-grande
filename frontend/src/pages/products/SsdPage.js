import {useEffect, useState} from "react";

const SsdPage = () => {
  const [ssds, setSsds] = useState([{
    price : 135,
    currency : {
      currency: "RON",
    },
    quantity : 5,
    supplier : {
      name: "Bright Xchange",
    },
    rotationSpeed : 350,
    connectionInterface : "",
    capacity: 5,
    unit: "TB",
    storageProducer: {
      name: ""
    }
  }]);

  useEffect(() => {
    fetch("http://localhost:8888/ssd", {method:"GET"})
        .then(response => response.json())
        .then(re => setSsds(re))
  },[])

  return <></>;
};

export default SsdPage;

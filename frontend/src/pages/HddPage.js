import {useEffect, useState} from "react";

const HddPage = () => {
  const [hdds, setHdds] = useState([{
    price : 135,
    currency : {
      currency: "RON",
    },
    quantity : 5,
    supplier: {
      name: "Bright Xchange",
    },
    rotationSpeed: 350,
    connectionInterface:  "",
    capacity: 5,
    unit: "TB",
    storageProducer: {
      name: ""
    }
  }]);

  useEffect(() => {
    fetch("http://localhost:8888/hdd", {method:"GET"})
        .then(response => response.json())
        .then(re => setHdds(re))
  },[])

  return <></>;
};

export default HddPage;

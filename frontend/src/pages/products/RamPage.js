import {useEffect, useState} from "react";

const RamPage = () => {
  const [rams, setRams] = useState([{
    price : 135,
    currency : {
      currency: "RON",
    },
    quantity : 5,
    supplier : {
      name: "Bright Xchange",
    },
    ramProducer : {
      name: ""
    },
    memoryType : {
      name: ""
    },
    capacity : 3,
    frequency : 3511
  }]);

  useEffect(() => {
    fetch("http://localhost:8888/ram", {method:"GET"})
        .then(response => response.json())
        .then(re => setRams(re))
  },[])

  return <></>;
};

export default RamPage;

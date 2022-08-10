import Card from "../wrappers/card/Card";
import CaseDetails from "../wrappers/card/details/case-details/CaseDetails";
import ProductsContainer from "../wrappers/products-container/ProductsContainer";

const CasePage = () => {
  // const [cases,setCases] = useState([]);

  // useEffect(() => {
  //     fetch("http://localhost:8888/case", {method:"GET"})
  //         .then(response => response.json())
  //         .then(re => setCases(re))
  // },[])
  let cases = [
    {
      price: 599.9,
      currency: {
        currency: "RON",
      },
      quantity: 3,
      supplier: {
        name: "Bright Xchange",
      },
      caseProducer: {
        name: "Lenovo",
      },
      model: "X450",
      caseType: {
        name: "High Tower",
      },
      numberOfHDD: 3,
      numberOfSSD: 2,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/product_26.jpg",
    },
    {
      price: 233.9,
      currency: {
        currency: "RON",
      },
      quantity: 5,
      supplier: {
        name: "Bright Xchange",
      },
      caseProducer: {
        name: "Lenovo",
      },
      model: "X300",
      caseType: {
        name: "High Tower",
      },
      numberOfHDD: 3,
      numberOfSSD: 2,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/product_26.jpg",
    },
    {
      price: 135.9,
      currency: {
        currency: "RON",
      },
      quantity: 2,
      supplier: {
        name: "Bright Xchange",
      },
      caseProducer: {
        name: "Myria",
      },
      model: "X300",
      caseType: {
        name: "High Tower",
      },
      numberOfHDD: 3,
      numberOfSSD: 2,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/product_26.jpg",
    },
    {
      price: 123.3,
      currency: {
        currency: "RON",
      },
      quantity: 2,
      supplier: {
        name: "Bright Xchange",
      },
      caseProducer: {
        name: "Alienware",
      },
      model: "X300",
      caseType: {
        name: "Middle Tower",
      },
      numberOfHDD: 3,
      numberOfSSD: 2,
      imageUrl:
        "https://brightxchangeprojectbucket.s3.eu-central-1.amazonaws.com/product_26.jpg",
    },
  ];
  return (
    <ProductsContainer key={"cases-container"}>
      {cases.map((e, i) => (
        <Card
          key={`carcasa_${e.caseProducer.name}_${e.model}`}
          title={`Carcasa ${e.caseProducer.name} ${e.caseType.name} ${e.model}`}
          price={e.price}
          currency={e.currency.currency}
          imageUrl={e.imageUrl}
          details={
            <CaseDetails
              numberOfHDD={e.numberOfHDD}
              numberOfSSD={e.numberOfSSD}
            />
          }
        />
      ))}
    </ProductsContainer>
  );
};

export default CasePage;

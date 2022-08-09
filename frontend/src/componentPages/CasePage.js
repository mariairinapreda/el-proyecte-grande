import "../scss/products_page.css";
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
    <>
      <ProductsContainer>
          {cases.map((e, i) => (
            <div key={"case_" + i} className="custom-card">
              <img className="custom-card-image" src={e.imageUrl} alt="None" />
              <div className="custom-card-header">
                <p className="custom-card-title">
                  Carcasa {e.caseProducer.name} {e.caseType.name} {e.model}
                </p>
              </div>
              <table className="custom-card-details">
                <tbody>
                  <tr>
                    <td>Numar suport HDD: {e.numberOfHDD}</td>
                  </tr>
                  <tr>
                    <td>Numar suport SSD: {e.numberOfSSD}</td>
                  </tr>
                </tbody>
              </table>
              <div className="custom-card-body">
                <div className="custom-card-text">
                  <p className="lead">
                    {e.price} {e.currency.currency}
                  </p>
                </div>
                <div className="custom-card-text">
                  <button className="btn btn-success add-product">
                    Adauga in cos
                  </button>
                </div>
              </div>
            </div>
          ))}
      </ProductsContainer>
    </>
  );
};

export default CasePage;

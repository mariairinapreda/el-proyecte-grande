import { useParams } from "react-router-dom";
import Navigation from "../../components/navigation/Navigation";
import ProductsContainer from "../../wrappers/products-container/ProductsContainer";
import { useEffect, useState } from "react";
import Card from "../../wrappers/card/Card";
import axios from "axios";
import { BASE_PATH } from "../../atoms/STORE";
import Details from "../../wrappers/card/details/Details";
import Detail from "../../wrappers/card/details/Detail";

const CategoryProducts = () => {
  const { categoryName } = useParams();
  const [products, setProducts] = useState([]);
  console.log(categoryName);
  useEffect(() => {
    axios
      .get(`${BASE_PATH}/products/category/${categoryName}`)
      .then((r) => setProducts(r.data));
  }, [categoryName]);

  return (
    <>
      <Navigation />
      <h1 style={{ marginTop: 100, textAlign: "center" }}>{categoryName}</h1>
      <ProductsContainer>
        {products.map((p) => (
          <Card
            key={`product_${p.id}`}
            imageUrl={p.imageNames[0]}
            title={p.name}
            price={p.price}
            details={
              <Details
                details={
                  <>
                    {p.specs.map((spec, index) => (
                      <Detail
                        key={`spec_${spec.id}_${index}`}
                        name={spec.categorySpec.name}
                        value={
                          spec.categorySpec.type === "text"
                            ? spec.stringValue
                            : spec.numberValue
                        }
                      />
                    ))}
                  </>
                }
              />
            }
          />
        ))}
      </ProductsContainer>
    </>
  );
};

export default CategoryProducts;

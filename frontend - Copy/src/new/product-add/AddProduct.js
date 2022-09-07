import { useEffect, useState } from "react";
import axios from "axios";
import { ADMIN_PATH, BASE_PATH, USER } from "../../atoms/STORE";
import { useAtom } from "jotai";

const AddProduct = () => {
  // const [user] = useAtom(USER);
  const defaultCategory = { id: 0, name: "Alegeti o categorie", specs: [] };
  const [state, setState] = useState({
    name: "",
    quantity: 1,
    price: 1,
    producer: { name: "" },
    specs: [],
  });
  const [categories, setCategories] = useState([defaultCategory]);
  const [activeCategory, setActiveCategory] = useState(defaultCategory);
  const [user] = useAtom(USER);

  useEffect(() => {
    axios.get(`${BASE_PATH}/categories`).then((r) => {
      let cat = [defaultCategory, ...r.data];
      setCategories(cat);
    }, []);
  });

  const onChange = (e) => {
    const { name, value, type } = e.target;
    let finalValue;
    if (type === "number") {
      finalValue = parseFloat(value);
    } else finalValue = value;

    if (name !== "producer") setState({ ...state, [name]: finalValue });
    else setState({ ...state, producer: { name: value } });
  };

  const onChangeSpec = (e) => {
    let specs = state.specs.map((elem) => {
      if (elem.categorySpec.name === e.target.name) {
        if (elem.categorySpec.type === "text") {
          elem = { ...elem, stringValue: e.target.value };
        } else {
          elem = { ...elem, numberValue: e.target.value };
        }
      }
      return elem;
    });
    setState({ ...state, specs: specs });
  };

  const onChangeCategory = (e) => {
    for (let elem of categories) {
      if (elem.id === parseInt(e.target.value)) {
        setActiveCategory(elem);
        let specs = [];
        for (let spec of elem.specs) {
          if (spec.type === "text") {
            specs.push({ categorySpec: spec, stringValue: "" });
          } else {
            specs.push({ categorySpec: spec, numberValue: 0 });
          }
        }
        setState({ ...state, specs: specs });
        break;
      }
    }
  };

  const onSubmit = () => {
    let finalState = { ...state, category: activeCategory };
    axios.post(`${ADMIN_PATH}/products`, finalState, {
      headers: {
        Authorization: user.token,
        "Content-Type": "application/json",
        Accept: "application/json",
      },
    });
  };

  return (
    <>
      <div>
        {Object.keys(state).map((k) => {
          let type;
          let value;
          let name;
          switch (k) {
            case "producer": {
              name = "producator";
              type = "text";
              value = state.producer.name;
              break;
            }
            case "name": {
              name = "nume";
              type = "text";
              value = state.name;
              break;
            }
            case "quantity": {
              name = "cantitate";
              type = "number";
              value = state.quantity;
              break;
            }
            case "price": {
              name = "pret";
              type = "number";
              value = state.price;
              break;
            }
          }
          return k !== "specs" ? (
            <div key={`${k}`}>
              <label>
                {name}:{" "}
                <input name={k} value={value} onChange={onChange} type={type} />
              </label>
            </div>
          ) : null;
        })}
      </div>
      <div>
        <select
          name={"category"}
          value={activeCategory.id}
          onChange={onChangeCategory}
        >
          {categories.map((c) => (
            <option key={`category_${c.id}`} value={c.id}>
              {c.name}
            </option>
          ))}
        </select>
      </div>
      {state.specs.map((e, index) => (
        <div key={`spec_${index}`}>
          <label>
            {e.categorySpec.name}:{" "}
            <input
              name={e.categorySpec.name}
              value={e.categorySpec === "text" ? e.stringValue : e.numberValue}
              onChange={onChangeSpec}
              type={e.categorySpec.type}
            />
          </label>
        </div>
      ))}
      <button onClick={onSubmit}>SUBMIT</button>
    </>
  );
};

export default AddProduct;

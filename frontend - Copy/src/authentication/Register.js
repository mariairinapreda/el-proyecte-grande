import { useState } from "react";
import axios from "axios";
import { BASE_PATH } from "../atoms/STORE";
import FormContainer from "../wrappers/form/container/FormContainer";
import FormCard from "../wrappers/form/card/FormCard";
import { useNavigate } from "react-router-dom";
import TextInput from "../components/inputs/TextInput";

const defaultFormFields = {
  firstName: "",
  lastName: "",
  email: "",
  password: "",
  confirmPassword: "",
};

const errors = {
  password: {
    value: false,
    message: "Numele ar trebui sa contina cel putin 4 litere",
  },
  confirmPassword: {
    value: false,
    message: "Numele ar trebui sa contina cel putin 4 litere",
  },
  firstName: {
    value: false,
    message: "Numele ar trebui sa contina cel putin 4 litere",
  },
  lastName: {
    value: false,
    message: "Numele ar trebui sa contina cel putin 4 litere",
  },
  email: {
    value: false,
    message: "Numele ar trebui sa contina cel putin 4 litere",
  },
};

const Register = () => {
  const [formFields, setFormFields] = useState(defaultFormFields);
  const [error] = useState(errors);
  const navigate = useNavigate();

  let path = `${BASE_PATH}/api/auth/register`;
  const onSubmit = (e) => {
    // e.preventDefault()
    // Object.keys(formFields).forEach((k) => console.log(`key: ${k} ---- value: ${formFields[k]}`));
    if (formFields.password === formFields.confirmPassword) {
      axios
        .post(path, formFields, {
          headers: {
            "Content-Type": "application/json",
            Accept: "application/json",
          },
        })
        .then((response) => {
          console.log(response);
          if (response.data === "Created") navigate("/login");
        });
    } else {
    }
  };

  const onChange = (e) => {
    setFormFields({ ...formFields, [e.target.name]: e.target.value });
    switch (e.target.name) {
      case "lastName": {
        break;
      }
      case "firstName": {
        break;
      }
      case "password": {
        break;
      }
      case "confirmPassword": {
        break;
      }
      case "email": {
        break;
      }
    }
  };
  return (
    <FormContainer>
      <FormCard
        onSubmit={onSubmit}
        title={"Inregistrare"}
        submitMessage={"Inregistrare"}
      >
        <TextInput
          name={"lastName"}
          type={"text"}
          value={formFields.lastName}
          onChange={onChange}
          title={"Nume"}
          error={error.lastName}
        />
        <TextInput
          name={"firstName"}
          type={"text"}
          value={formFields.firstName}
          onChange={onChange}
          title={"Prenume"}
          error={error.firstName}
        />
        <TextInput
          name={"email"}
          type={"email"}
          value={formFields.email}
          onChange={onChange}
          title={"E-mail"}
          error={error.email}
        />
        <TextInput
          name={"password"}
          type={"password"}
          value={formFields.password}
          onChange={onChange}
          title={"Parola"}
          error={error.password}
        />
        <TextInput
          name={"confirmPassword"}
          type={"password"}
          value={formFields.confirmPassword}
          onChange={onChange}
          title={"Confirmare parola"}
          error={error.confirmPassword}
        />
      </FormCard>
    </FormContainer>
  );
};

export default Register;
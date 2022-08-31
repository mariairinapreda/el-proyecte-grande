import {useState} from "react";
import axios from "axios";
import {BASE_PATH} from "../atoms/STORE";
import FormContainer from "../wrappers/form/container/FormContainer";
import FormCard from "../wrappers/form/card/FormCard";
import classes from "./authentication.module.scss";

const defaultFormFields = {
  firstName: "linda",
  lastName: "linda",
  email: "asd@asd.com",
  password: "password",
  confirmPassword: "password"
}


const Register = () => {
  const [formFields, setFormFields] = useState(defaultFormFields)

  let path = `${BASE_PATH}/api/auth/register`
  const onSubmit = () => {axios.post(path,formFields,{
    headers: {
      "Content-Type": "application/json",
      "Accept": "application/json"
    }
  }).then(respose => console.log(respose))}

    console.log(formFields)
  const onChange = (e) => {
      setFormFields({...formFields, [e.target.name]: e.target.value});
  }
  return (
      <FormContainer>
        <FormCard onSubmit={onSubmit} submitMessage={"Inregistrare"}>
          {/*<form onSubmit={onSubmit}>*/}
            <label>Nume: <input value={formFields.lastName} onChange={onChange} name={"lastName"} type={"text"}/></label>
            <label>Prenume: <input value={formFields.firstName} onChange={onChange} name={"firstName"} type={"text"}/></label>
            <label>E-mail: <input value={formFields.email} onChange={onChange} name={"email"} type={"email"}/></label>
            <label>Parola: <input value={formFields.password} onChange={onChange} name={"password"} type={"password"}/></label>
            <label>Confirmare parola: <input value={formFields.confirmPassword} onChange={onChange} name={"confirmPassword"} type={"password"}/></label>
            {/*<button type={"submit"}>SUBMIT</button>*/}
          {/*</form>*/}
        </FormCard>
      </FormContainer>

  )
}

export default Register;
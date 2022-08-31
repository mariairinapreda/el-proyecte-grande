import {useState} from "react";
import axios from "axios";
import {BASE_PATH} from "../atoms/STORE";

const defaultFormFields = {
  username: "linda",
  email: "asd@asd.com",
  password: "password"
}


const Register = () => {
  const [formFields, setFormFields] = useState(defaultFormFields)

  let path = `${BASE_PATH}/api/auth/register`
  const onSubmit = () => {axios.post(path,defaultFormFields,{
    headers: {
      "Content-Type": "application/json",
      "Accept": "application/json"
    }
  }).then(response => console.log(response))}
  return <form onSubmit={onSubmit}>
    <button type={"submit"}>SUBMIT</button>
  </form>
}

export default Register;
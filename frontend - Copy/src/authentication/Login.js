import { useState } from "react";
import { useAtom } from "jotai";
import { BASE_PATH, USER } from "../atoms/STORE";
import axios from "axios";
import FormContainer from "../wrappers/form/container/FormContainer";
import FormCard from "../wrappers/form/card/FormCard";
import { useNavigate } from "react-router-dom";

const Login = () => {
  const [credentials, setCredentials] = useState({
    email: "",
    password: "",
  });
  const [errorMessage, setErrorMessage] = useState("");
  const navigate = useNavigate();
  const [, setUser] = useAtom(USER);

  const onSubmit = (e) => {
    // e.preventDefault();
    let path = `${BASE_PATH}/api/auth/signin`;
    axios
      .post(path, credentials, {
        headers: {
          "Content-Type": "application/json",
        },
      })
      .then((response) => {
        if (response.status === 200) {
          const { token, id, name, roles } = response.data;
          setUser({
            token: token,
            id: id,
            name: name,
            roles: roles,
          });
          localStorage.setItem("token", token);
          localStorage.setItem("id", id);
          localStorage.setItem("name", name);
          localStorage.setItem("role", roles[0]);
          navigate("/");
        } else {
          setErrorMessage(response.data);
        }
      });
  };

  const onChange = (e) => {
    e.preventDefault();
    setCredentials({ ...credentials, [e.target.name]: e.target.value });
  };

  return (
    <FormContainer>
      <FormCard onSubmit={onSubmit} title={"Logare"} submitMessage={"Logare"}>
        {errorMessage !== "" && (
          <h5 style={{ color: "red", textAlign: "center" }}>{errorMessage}</h5>
        )}
        <label>
          E-mail:{" "}
          <input
            name={"email"}
            value={credentials.email}
            onChange={onChange}
            type={"email"}
          />
        </label>
        <label>
          Parola:{" "}
          <input
            name={"password"}
            value={credentials.password}
            onChange={onChange}
            type={"password"}
          />
        </label>
      </FormCard>
    </FormContainer>
  );
};

export default Login;

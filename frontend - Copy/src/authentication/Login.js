import {useState} from "react";
import {useAtom} from "jotai";
import {BASE_PATH, USER,} from "../atoms/STORE";
import axios from "axios";
import FormContainer from "../wrappers/form/container/FormContainer";
import FormCard from "../wrappers/form/card/FormCard";
import {useNavigate} from "react-router-dom";
import {useForm} from "react-hook-form";

const Login = () => {

    const [credentials, setCredentials] = useState({
        email: "",
        password: ""
    })
    const [errorMessage, setErrorMessage] = useState("")
    const navigate = useNavigate();
    const [setUser] = useAtom(USER);
    const {handleSubmit} = useForm()


    const onSubmit = () => {
        let path = `${BASE_PATH}/api/auth/signin`
        axios.post(path, credentials, {
            headers: {
                "Content-Type": "application/json"
            }
        }).then(response => {
            console.log(response)
            if (response.status === 200) {
                setUser({
                    token: response.data.token,
                    id: response.data.id,
                    name: response.data.name,
                    roles: response.data.roles
                });
                navigate("/");
            }else {
                setErrorMessage(response.data)
            }

            console.log(response.data)
        });
    };

    const onChange = (e) => {
        e.preventDefault();
        setCredentials({...credentials, [e.target.name]: e.target.value})
    }


    return (
        <FormContainer>
            <FormCard onSubmit={handleSubmit(onSubmit)} title={"Logare"} submitMessage={"Logare"}>
                {errorMessage !== "" && <h5 style={{color:"red", textAlign:"center"}}>{errorMessage}</h5>}
                <label>E-mail: <input name={"email"} value={credentials.email} onChange={onChange}
                                      type={"email"}/></label>
                <label>Parola: <input name={"password"} value={credentials.password} onChange={onChange}
                                        type={"password"}/></label>
            </FormCard>
        </FormContainer>
    );

}

export default Login;
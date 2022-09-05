import {useState} from "react";
import {useAtom} from "jotai";
import {BASE_PATH, USER,} from "../atoms/STORE";
import axios from "axios";
import FormContainer from "../wrappers/form/container/FormContainer";
import FormCard from "../wrappers/form/card/FormCard";
import {useNavigate} from "react-router-dom";

const Login = () => {

    const [credentials, setCredentials] = useState({
        email: "asd@asd.com",
        password: "password"
    })
    const navigate = useNavigate();
    const [user, setUser] = useAtom(USER);

    const onSubmit = (e) => {
        e.preventDefault();

        let path = `${BASE_PATH}/api/auth/signin`
        axios.post(path, credentials, {
            headers: {
                "Content-Type": "application/json"
            }
        }).then(response => {
            console.log(response)
			if(response.status === 200){
				setUser({
					token: response.data.token,
					id: response.data.id,
					name: response.data.name
				});
                navigate("/");
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
            <FormCard onSubmit={onSubmit} title={"Logare"}>
                <label>E-mail: <input name={"email"} value={credentials.email} onChange={onChange}
                                      type={"email"}/></label>
                <label>Password: <input name={"password"} value={credentials.password} onChange={onChange}
                                        type={"password"}/></label>
            </FormCard>
        </FormContainer>
    );

}

export default Login;
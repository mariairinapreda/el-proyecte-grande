import {Component} from "react";
import {useAtom} from "jotai";
import {BASE_PATH, JWT_TOKEN, USER_ID} from "../atoms/STORE";
import axios from "axios";
import FormContainer from "../wrappers/form/container/FormContainer";
import FormCard from "../wrappers/form/card/FormCard";

const Login= () =>{

	const state = {
		email: "asd@asd.com",
		password: "password"
	}
	const [token, setToken] = useAtom(JWT_TOKEN);
	const [userId, setUserId] = useAtom(USER_ID);

	const onSubmit = (e) => {
		e.preventDefault();

		let path = `${BASE_PATH}/api/auth/signin`
		axios.post(path,state,{
			headers: {
				"Content-Type": "application/json"
			}
		}).then(response => {
			setToken(response.data.token);
			setUserId(response.data.userId);
		});
	};


	return (
		<FormContainer>
			<FormCard>
				<form onSubmit={onSubmit}>
					<label>E-mail: <input type={"email"}/></label>
					<label>Password: <input type={"password"}/></label>
					<button type={"submit"}>SUBMIT</button>
				</form>
			</FormCard>
		</FormContainer>
	);

}

export default Login;
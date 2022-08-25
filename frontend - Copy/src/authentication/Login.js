import {Component} from "react";
import {useAtom} from "jotai";
import {BASE_PATH, JWT_TOKEN} from "../atoms/STORE";
import axios from "axios";

const Login= () =>{

	const state = {
		username: "linda",
		password: "password"
	}
	const [token, setToken] = useAtom(JWT_TOKEN);

	const onSumbit = (e) => {
		e.preventDefault();

		let path = `${BASE_PATH}/login`
		axios.post(path,state,{
			method:"post",
			headers: {
				"Content-Type": "application/json",
				"Accept": "application/json"
			}
		}).then(response => {
			setToken(response.config.headers.Authorization)
			console.log(token)
		})
		// setToken()
	};


	return <form onSubmit={onSumbit}>
		<button type={"submit"}>SUBMIT</button>
	</form>

}

export default Login;
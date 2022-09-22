// import {useAtom} from "jotai";
// import {BASE_PATH} from "../atoms/STORE";
// import axios from "axios";
//
//
// const Log = () => {
//   const [token, setToken] = useAtom(JWT_TOKEN);
//
//   const formFields = {
// 	  username: "linda",
// 	  password: "password"
//   }
//   let tokens = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJsaW5kYSIsImF1dGhvcml0aWVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2NjE0MjExNTUsImV4cCI6MTY2MjU4NDQwMH0.JIRPi8OG08NY2vfxjYLe9DeyRADSWoIai1pWsHupIxcKceia2WhxbeWlrcrNU1xz5kIxPS_x57PF9kIl7Ykifw";
//
//   const onSumbit = (e) => {
// 	  e.preventDefault();
// 	  let path = `${BASE_PATH}/categories`
// 	  axios.get(path,{
// 		  headers: {
// 			  "Authorization": tokens,
// 			  "Content-Type": "application/json",
// 			  "Accept": "application/json"
// 		  }
// 	  }).then(response => {
// 		  setToken(response.config.headers.Authorization)
// 		  console.log(token)
// 	  })
// 	  // setToken()
//   };
//
//   return  <form onSubmit={onSumbit}>
// 	  <button type={"submit"}>SUBMIT</button>
//   </form>
// }
//
// export default Log;
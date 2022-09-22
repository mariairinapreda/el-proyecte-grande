import {USER_PATH} from "../../../atoms/STORE";
import axios from "axios";
import {Component} from "react";

class SuccessPayment extends Component{
  constructor() {
    super();
    this.id = localStorage.getItem("id");
    this.params = new URLSearchParams(window.location.search);
    this.token = localStorage.getItem("token")
  }

  componentDidMount() {
    axios.get(`${USER_PATH}/payment/${this.id}/${this.params.get("PayerID")}/${this.params.get("paymentId")}`, {
      method: "get",
      headers: {
        authorization: this.token,
        "Access-Control-Allow-Origin": `${window.location.origin}`
      }
    }).then(r => console.log(r))
  }

  render() {
  return (
      <>PLATA ACCEPTATA</>
  )
  ;
}
}

export default SuccessPayment;

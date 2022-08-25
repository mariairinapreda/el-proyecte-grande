import React, {Component} from "react";


class SpecInput extends Component{
    constructor({count}) {
        super(count);
        this.state = {
            count: count
        }
    }

    render() {
        let {count} = this.state;
        return <div>
            <label>Spec {count} Name :<input type={"text"} className={"spec"}/></label>
            <label>Spec {count} Type :
                <select className={"type"}>
                    <option value={"text"} selected>Text</option>
                    <option value={"number"}>Numeric</option>
                </select>
            </label>
        </div>;
    }
}


export default SpecInput;
import React, {Component, useState} from "react";


const SpecInput = ({count, value, onChangeValue, onChangeType, type, inputName}) =>{

    const [state, setState] = useState({
        count: count,
        value: value,
        type: type
    });

    return(
        <div>
            <label> {state.count}. nume: <input type={"text"} name={inputName} value={value} onChange={onChangeValue} className={"spec"}/></label>
            <label>  tip:
                <select name={inputName} value={state.type} className={"type"} onChange={onChangeType}>
                    <option value={"text"}>Text</option>
                    <option value={"number"}>Numeric</option>
                </select>
            </label>
        </div>
    );
}


export default SpecInput;
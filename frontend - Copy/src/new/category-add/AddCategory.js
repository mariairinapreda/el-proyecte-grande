import React, {useState} from "react";
import SpecInput from "./SpecInput";
import axios from "axios";
import {BASE_PATH, USER} from "../../atoms/STORE";
import {useAtom} from "jotai";


const AddCategory = () => {

    const [user, setUser] = useAtom(USER)

    const [state, setState] = useState({
        name: "",
        specs: [
            {key: "name", name: "nume", type: "text"},
            {key: "quantity", name: "cantitate", type: "number"},
            {key: "price", name: "pret", type: "number"}
        ],
        count: 3
    })


    const addSpecInput = () => {
        let count = state.specs.length + 1;
        let name = `spec${count}`;
        const newSpecs = state.specs;
        newSpecs.push({key: name, name: "", type: "text"},)
        setState({...state,specs: newSpecs, count: count});
    }

    const onSpecChangeValue = (e) => {
        const {name, value} = e.target;
        console.log(e.target)
        const newSpecs = state.specs.map(e => {
            console.log(`element: ${e.key}    name: ${name}    value: ${value}`)
            if(e.key === name){
                return {...e, name:value}
            }else return e;
        })

        setState({
                ...state,
                specs: newSpecs
            }
        )
    }

    const onSpecChangeType = (e) => {
        const {name, value} = e.target;
        const newSpecs = state.specs.map(e => {
            if(e.key === name){
                return {...e, type:value}
            }else return e;
        })
        console.log(newSpecs)
        setState({
                ...state,
                specs: newSpecs
            }
        )
    }

    const onSubmit = () => {
        let finalSpecs = [];
        let category = {
            name: document.getElementById("category-name").value, categorySpecs: finalSpecs
        };


        axios.post(`${BASE_PATH}/category-images`, {"image": document.getElementById("image-input").files[0]}, {
            method: "POST",
            headers: {
                "Authorization": user.token,
                "Content-Type": "multipart/form-data",
                "Accept": "application/json"
            }
        }).then(() => {
            axios.post(`${BASE_PATH}/categories`, category, {
                    method: "POST",
                    headers: {
                        "Authorization": user.token,
                        "Content-Type": "application/json",
                        "Accept": "application/json"
                    }
                }
            ).then(r => console.log(r))
        })

        console.log(category)
    }

    // console.log(state)

    return <div>
        <label>Category name: <input id={"category-name"} name={"category-name"}/></label>
        <h3>Specifications</h3>
        <div id={"specs"} className={"specs-container"}>
            {/*{Object.keys(state.specs).map((s, index) => <SpecInput key={`${s}`} inputName={s} value={state.specs[s].name}*/}
            {/*                                                       type={state.specs[s].type} count={index+1}*/}
            {/*                                                       onChangeValue={onSpecChangeValue}*/}
            {/*                                                       onChangeType={onSpecChangeType}/>)}*/}

            {state.specs.map((s, index) => <div key={s.key}>
                <label> {index+1}. nume: <input type={"text"} name={s.key} value={s.name} onChange={onSpecChangeValue} className={"spec"}/></label>
                <label>  tip:
                    <select name={s.key} value={s.type} className={"type"} onChange={onSpecChangeType}>
                        <option value={"text"}>Text</option>
                        <option value={"number"}>Numeric</option>
                    </select>
                </label>
            </div>)}
        </div>

        {Object.keys(state.specs).length<30 && <button onClick={addSpecInput}>Add spec</button>}

        <div>
            <input type={"file"} accept={".jpeg,.jpg,.png"} id={"image-input"}/>
        </div>
        <button onClick={onSubmit}>Submit</button>
    </div>;

}

export default AddCategory;
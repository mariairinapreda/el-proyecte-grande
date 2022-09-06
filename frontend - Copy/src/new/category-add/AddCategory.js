import React, {useState} from "react";
import SpecInput from "./SpecInput";
import axios from "axios";
import {BASE_PATH, USER} from "../../atoms/STORE";
import {useAtom} from "jotai";


const AddCategory = () => {

    const [user, setUser] = useAtom(USER)

    const [state, setState] = useState({
        specs: {
            quantity: { name: "quantity", type: "number"}
        },
        count: 0
    })


    const addSpecInput = () => {
        let count = parseInt(state.count)+1;
        let name = `spec${state.count}`;
        setState({specs: {...state.specs, [name]: {name: "", type:"text"}}, count: count});
        console.log(state)
    }

    const onSubmit = () => {
        let specs = document.getElementsByClassName("spec");
        let types = document.getElementsByClassName("type");
        let finalSpecs = [];
        // for (let index = 0; index < specs.length; index++) {
        //     finalSpecs.push({name: specs.item(index).value, type: types.item(index).value})
        // }
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

        // fetch("https://localhost:8888/category-images", {
        //     method: "POST",
        //     headers: {
        //         "Authorization": token,
        //         "Content-Type": "multipart/form-data",
        //         "Accept": "application/json"
        //     }, body: {"image": document.getElementById("image-input").files[0]}
        // }).then();


        console.log(category)


        // fetch("https://localhost:8888/categories", {
        //     method: "POST",
        // 	headers: {
        //         "Authorization": token,
        //         "Content-Type": "application/json",
        // 		"Accept": "application/json"
        //     },
        //     body: category
        // })
    }

    return <div>
        <label>Category name: <input id={"category-name"} name={"category-name"}/></label>
        <h3>Specifications</h3>
        <div id={"specs"} className={"specs-container"}>
            {Object.keys(state.specs).map((s, index) => <SpecInput key={state.specs[s].name} value={state.specs[s].name} count={index}/>)}
        </div>

        <button onClick={addSpecInput}>Add spec</button>

        <div>
            <input type={"file"} accept={".jpeg,.jpg,.png"} id={"image-input"}/>
        </div>
        <button onClick={onSubmit}>Submit</button>
    </div>;

}

export default AddCategory;
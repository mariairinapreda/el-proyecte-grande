import React, {Component, useState} from "react";
import SpecInput from "./SpecInput";
import {useAtom} from "jotai";
import {userToken} from "../../atoms/User";
import axios from "axios";


class AddCategory extends Component {

    constructor() {
        super();
        this.state = {
            specs: [], count: 0
        }
    }

    addSpecInput = () => {
        let newSpecs = this.state.specs;
        newSpecs.push({})
        this.setState({specs: newSpecs, count: newSpecs.length})
        this.state.specs.forEach(spec => {
            console.log(spec);
        })
    }

    onSubmit = () => {

        let specs = document.getElementsByClassName("spec");
        let types = document.getElementsByClassName("type");
        let finalSpecs = [];
        for (let index = 0; index < specs.length; index++) {
            finalSpecs.push({name: specs.item(index).value, type: types.item(index).value})
        }
        let category = {
            name: document.getElementById("category-name").value, categorySpecs: finalSpecs
        };

        let token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJsaW5kYSIsImF1dGhvcml0aWVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2NjEzODMzMjUsImV4cCI6MTY2MjU4NDQwMH0.C5e1Eb_9d1N_711-GhPBp1GP40-zPHQAghsYxuDUt6Db9ts9b1gC74SgNGDC7zb2-9VdDGINMZS9GwUv7qcu5A";


        axios.post("http://localhost:8888/category-images",{"image": document.getElementById("image-input").files[0]},{
            method: "POST",
            headers:{
                "Authorization": token,
                "Content-Type": "multipart/form-data",
                "Accept": "application/json"
            }
        }).then(() =>{
            axios.post("http://localhost:8888/categories", category, {
                    method: "POST",
                    headers: {
                        "Authorization": token,
                        "Content-Type": "application/json",
                        "Accept": "application/json"
                    }
                }
            )
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

    render() {
        return <div>
            <label>Category name: <input id={"category-name"} name={"category-name"}/></label>
            <h3>Specifications</h3>
            <div id={"specs"} className={"specs-container"}>
                {this.state.specs.map((s, index) => <SpecInput key={s.id} count={index}/>)}
            </div>

            <button onClick={this.addSpecInput}>Add spec</button>

            <div>
                <input type={"file"} accept={".jpeg,.jpg,.png"} id={"image-input"}/>
            </div>
            <button onClick={this.onSubmit}>Submit</button>
        </div>;
    }
}

export default AddCategory;
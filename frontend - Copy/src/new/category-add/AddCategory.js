import React, {Component} from "react";
import SpecInput from "./SpecInput";



class AddCategory extends Component{

	constructor() {
		super();
		this.state = {
			specs: [],
			count: 0
		}
	}

	addSpecInput = () => {
		let newSpecs = this.state.specs;
		newSpecs.push({id:`spec_${newSpecs.length}`})
		this.setState({specs: newSpecs, count: newSpecs.length})
		this.state.specs.forEach(spec => {

		})
	}

	onSubmit = () =>{
		let specs = document.getElementsByClassName("spec");

		let finalSpecs = [];
		for (let specsKey of specs) {
			finalSpecs.push({name:specsKey.value})
		}
		let category={
			name: document.getElementById("category-name").value,
			categorySpecs: finalSpecs
		};
		console.log(category)
	}

	render() {
		return <div>
			<label>Category name: <input id={"category-name"} name={"category-name"} /></label>
			<h3>Specifications</h3>
			<div id={"specs"} className={"specs-container"}>
				{this.state.specs.map((s, index) => <SpecInput key={s.id} count={index} />)}
			</div>
			<button onClick={this.addSpecInput}>Add spec</button>
			<button onClick={this.onSubmit}>Submit</button>
		</div>;
	}
}

export default AddCategory;
import React from "react";
import FormContainer from "../../../wrappers/form/container/FormContainer";
import CaseFormStep1 from "./steps/CaseFormStep1";
import CaseFormStep3 from "./steps/CaseFormStep3";
import CaseFormStep2 from "./steps/CaseFormStep2";

class AddCaseForm extends React.Component {
    constructor() {
        super();
        this.state = {
            step: 1,
            existent: true,
        };
    }

    changeExistence = (e) => {
        e.preventDefault();
        this.setState({existent: !this.state.existent});
    };

    nextStep = (e) => {
        e.preventDefault();
        if (this.state.step !== 4) this.setState({step: this.state.step + 1});
    };

    previousStep = (e) => {
        e.preventDefault();
        this.setState({step: this.state.step - 1});
    };

    render() {
        return (
            <FormContainer key={"form"}>
                {this.state.step === 1 && (
                    <CaseFormStep1
                        step={this.state.step}
                        existent={this.state.existent}
                        changeExistence={this.changeExistence}
                        nextStep={this.nextStep}
                        stepData={"Distribuitor"}
                    />
                )}
                {this.state.step === 2 && (
                    <CaseFormStep2
                        step={this.state.step}
                        existent={this.state.existent}
                        changeExistence={this.changeExistence}
                        nextStep={this.nextStep}
                        previousStep={this.previousStep}
                        stepData={"Producator"}
                    />
                )}
                {this.state.step === 3 && (
                    <CaseFormStep3
                        step={this.state.step}
                        existent={this.state.existent}
                        changeExistence={this.changeExistence}
                        nextStep={this.nextStep}
                        previousStep={this.previousStep}
                        stepData={"Tip carcasa"}
                    />
                )}
                {this.state.step === 4 && (
                    <CaseFormStep3
                        step={this.state.step}
                        existent={this.state.existent}
                        changeExistence={this.changeExistence}
                        nextStep={this.nextStep}
                        previousStep={this.previousStep}
                        stepData={"Detalii"}
                    />
                )}
            </FormContainer>
        );
    }
}

export default AddCaseForm;

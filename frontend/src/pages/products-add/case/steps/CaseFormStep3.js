import FormCard from "../../../../wrappers/form/card/FormCard";

const CaseFormStep3 = ({
  step,
  stepData,
  previousStep,
  nextStep,
  existent,
  changeExistence,
}) => {
  return (
    <FormCard
      step={step}
      stepData={stepData}
      nextStep={nextStep}
      previousStep={previousStep}
      existent={existent}
      changeExistence={changeExistence}
      existentData={<div></div>}
      newData={<div></div>}
      totalSteps={4}
    ></FormCard>
  );
};

export default CaseFormStep3;

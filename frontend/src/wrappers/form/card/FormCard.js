import classes from "./FormCard.module.scss";

const FormCard = ({
  productType,
  step,
  nextStep,
  previousStep,
  stepData,
  newData,
  existentData,
}) => {
  return (
    <form className={classes.form}>
      <h1>Adaugare {productType}</h1>
      <h2>
        Pasul {step} din 4 - {stepData}
      </h2>
      <div>{newData}</div>
      <div>{existentData}</div>
      <div>
        {previousStep !== undefined && (
          <button
            type="cancel"
            className={classes.cancel}
            onClick={previousStep}
          >
            <span></span>
            Back
          </button>
        )}
        <button type="submit" className={classes.submit} onClick={nextStep}>
          Next step
          <span></span>
        </button>
      </div>
    </form>
  );
};

export default FormCard;

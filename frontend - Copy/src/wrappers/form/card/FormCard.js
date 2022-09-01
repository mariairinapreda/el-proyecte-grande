import classes from "./FormCard.module.scss";

const FormCard = (props) => {
  return (
    <form onSubmit={props.onSubmit} className={classes.form}>
        <h1>{props.title}</h1>

        <div className={classes.content}>{props.children}</div>
        <div>
            <button
                type="cancel"
                className={classes.cancel}
            >
                <span></span>
                {props.cancelMessage !== undefined ? props.cancelMessage : "Anulare"}
            </button>
            <button type="submit" className={classes.submit}>
                {props.submitMessage !== undefined ? props.submitMessage : "Salveaza"}
                <span></span>
            </button>
        </div>
    </form>
  );
};

export default FormCard;

import classes from "./FormCard.module.scss";
import {useNavigate} from "react-router-dom";

const FormCard = (props) => {
    const navigate = useNavigate();
    const onCancel = () => {
        navigate("/")
    }

    return (
        <form onSubmit={props.onSubmit} className={classes.form}>
            <h1>{props.title}</h1>

            <div className={classes.content}>{props.children}</div>
            <div>
                <button
                    type="cancel"
                    onClick={onCancel}
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

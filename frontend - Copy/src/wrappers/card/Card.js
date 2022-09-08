import classes from "./Card.module.scss";

const Card = ({title, imageUrl, details, price}) => {
    return (
        <div className={classes.customCard}>
            <img className={classes.customCardImage} src={imageUrl} alt="None"/>
            <div className={classes.customCardHeader}>
                <p className={classes.customCardTitle}>{title}</p>
            </div>
            <div style={{color: "white"}}>{details}</div>
            <div className={classes.customCardBody}>
                <div className={classes.customCardText}>
                    <p>
                        {price} {"RON"}
                    </p>
                </div>
                <div className={classes.customCardText}>
                    <button className="btn btn-success add-product">Adauga in cos</button>
                </div>
            </div>
        </div>
    );
};

export default Card;

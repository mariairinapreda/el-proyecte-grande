import classes from "./LandingPageCard.module.scss";
import {Link} from "react-router-dom";

const LandingPageCard = ({url, imageUrl, name}) => {
    return <div className={classes.categoryCard}>
        <Link to={url}>
            <img
                className={classes.backgroundImage}
                src={imageUrl}
                alt={name + " Image"}
            />
            <div className={classes.content}>
                <p className={classes.title}>{name}</p>
                <p className={classes.subtitle}>Vezi produse</p>
            </div>
        </Link>
    </div>
}

export default LandingPageCard;
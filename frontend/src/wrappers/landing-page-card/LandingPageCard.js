import classes from "./LandingPageCard.module.scss";
import { Link } from "react-router-dom";

const LandingPageCard = ({ url, imageUrl, name }) => {
  return (
    <div className={classes.categoryCard}>
      <Link to={url}>
        <div
          className={classes.backgroundImage}
          style={{ backgroundImage: `url(${imageUrl})` }}
        >
          <div className={classes.content}>
            <p className={classes.title}>{name}</p>
            <p className={classes.subtitle}>Vezi produse</p>
          </div>
        </div>
      </Link>
    </div>
  );
};

export default LandingPageCard;

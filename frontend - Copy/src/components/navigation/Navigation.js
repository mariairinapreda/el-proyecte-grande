import { Link } from "react-router-dom";
import classes from "./Navigation.module.scss";
import "font-awesome/css/font-awesome.min.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars, faTimes } from "@fortawesome/free-solid-svg-icons";
import { useAtom } from "jotai";
import { USER } from "../../atoms/STORE";

const Navigation = () => {
  const [actualUser, setUser] = useAtom(USER);
  const logout = (e) => {
    e.preventDefault();
    setUser({ token: undefined, id: undefined, name: undefined, roles: [] });
    localStorage.clear();
  };
  return (
    <nav className={classes.nav}>
      <div className={classes.wrapper}>
        {actualUser.name === undefined || actualUser.name === null ? (
          <div className={classes.logo}>
            <Link to="/login">Logare</Link>
            <Link to="/register">Inregistrare</Link>
          </div>
        ) : (
          <div className={classes.logo}>
            <Link to="/">{actualUser.name}</Link>
            <span onClick={logout}>Deconectare</span>
          </div>
        )}
        <input
          type="checkbox"
          name="slider"
          id={"menu-btn"}
          className={classes.showMenu}
        />
        <ul className={classes.navLinks}>
          <label htmlFor="menu-btn" className={[classes.closeBtn].join()}>
            <FontAwesomeIcon icon={faTimes}></FontAwesomeIcon>
          </label>
          <li className={classes.link}>
            <Link to="/">Home</Link>
          </li>
          {actualUser.roles.indexOf("ADMIN") !== -1 && (
            <>
              <li className={classes.link}>
                <Link to="/adauga-produs">Adauga produs</Link>
              </li>
              <li className={classes.link}>
                <Link to="/adauga-categorie">Adauga Categorie</Link>
              </li>
            </>
          )}

          <li className={classes.link}>
            <Link to="/contact">Contact</Link>
          </li>
          <li className={classes.link}>
            <Link to="/about-us">Despre noi</Link>
          </li>
          <li className={classes.link}>
            <Link to="/cos-cumparaturi" className={classes.cart}>
              {/*COS*/}
              <i className="fa-solid fa-cart-shopping"></i>
              <span className={classes.cartQuantity}>0</span>
            </Link>
          </li>
        </ul>
        <label htmlFor="menu-btn" className={classes.showMenuLabel}>
          <FontAwesomeIcon icon={faBars}></FontAwesomeIcon>
        </label>
      </div>
    </nav>
  );
};

export default Navigation;

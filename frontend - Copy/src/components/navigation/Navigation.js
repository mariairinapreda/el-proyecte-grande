import { Link } from "react-router-dom";
import classes from "./Navigation.module.scss";
import "font-awesome/css/font-awesome.min.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars, faTimes } from "@fortawesome/free-solid-svg-icons";
import { useAtom } from "jotai";
import {
  CART_PRODUCTS,
  CART_PRODUCTS_NUMBER,
  USER,
  USER_PATH,
} from "../../atoms/STORE";
import axios from "axios";
import { useCallback, useEffect } from "react";

const Navigation = (callback, deps) => {
  const [actualUser, setUser] = useAtom(USER);
  const [, setCartItems] = useAtom(CART_PRODUCTS);
  const [cartItemsCount, setCartItemsCount] = useAtom(CART_PRODUCTS_NUMBER);

  const logout = useCallback(
    (e) => {
      e.preventDefault();
      setUser({ token: undefined, id: undefined, name: undefined, roles: [] });
      localStorage.clear();
    },
    [setUser]
  );

  useEffect(() => {
    if (actualUser.roles.indexOf("USER") !== -1) {
      axios
        .get(`${USER_PATH}/cart-item/${actualUser.id}`, {
          headers: {
            authorization: actualUser.token,
          },
        })
        .then((r) => {
          setCartItems(r.data);
          let count = 0;
          for (let item of r.data) {
            count += item.quantity;
          }
          setCartItemsCount(count);
        })
        .catch(() => {
          logout(new MouseEvent("LMB"));
        });
    }
  }, [
    actualUser.id,
    actualUser.roles,
    actualUser.token,
    logout,
    setCartItems,
    setCartItemsCount,
  ]);
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
          {actualUser.roles.indexOf("USER") !== -1 && (
            <li className={classes.link}>
              <Link to="/cos-cumparaturi" className={classes.cart}>
                {/*COS*/}
                <i className="fa-solid fa-cart-shopping"></i>
                <span className={classes.cartQuantity}>{cartItemsCount}</span>
              </Link>
            </li>
          )}
        </ul>
        <label htmlFor="menu-btn" className={classes.showMenuLabel}>
          <FontAwesomeIcon icon={faBars}></FontAwesomeIcon>
        </label>
      </div>
    </nav>
  );
};

export default Navigation;

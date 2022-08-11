import { Link } from "react-router-dom";
import classes from "./Navigation.module.scss";
import "font-awesome/css/font-awesome.min.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars, faTimes } from "@fortawesome/free-solid-svg-icons";

const Navigation = ({ actualUser }) => {
  // const [actualUser, setUser] = useAtom(user);
  // console.log(actualUser);
  return (
    <nav className={classes.nav}>
      <div className={classes.wrapper}>
        {actualUser.username == null ? (
          <div className={classes.logo}>
            <Link to="/login">Logare</Link>
            <Link to="/register">Inregistrare</Link>
          </div>
        ) : (
          <div className={classes.logo}>
            <Link to="/">{actualUser.username}</Link>
            <Link to="/logout">Deconectare</Link>
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
          {actualUser.status === "admin" && (
            <li className={classes.link}>
              <Link to="/" className={classes.desktopItem}>
                Adauga produse
              </Link>
              <input type="checkbox" className={classes.showDrop} />
              <label htmlFor="showDrop" className={classes.mobileItem}>
                Adauga produs
              </label>
              <ul className={classes.dropMenu}>
                <li className={classes.link}>
                  <Link to="/add-case">Link button</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-case">Carcasa</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-cooler">Cooler</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-desktop">Desktop</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-graphics-card">Placa video</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-motherboard">Placa de baza</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-power-supply">Sursa</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-processor">Procesor</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-ram">Memorie</Link>
                </li>
                <li className={classes.link}>
                  <Link to="/add-vent">Ventilator</Link>
                </li>
              </ul>
            </li>
          )}
          <li className={classes.link}>
            <Link to="/" className={classes.desktopItem}>
              Categorii
            </Link>
            <input type="checkbox" className={classes.showMega} />
            <label htmlFor="showMega" className={classes.mobileItem}>
              Categorii
            </label>
            <div className={classes.megaBox}>
              <div className={classes.content}>
                <div className={classes.row}>
                  {/*<img src="/static/img/logo/icon.png" alt="Logo"/>*/}
                </div>
                <div className={classes.row}>
                  <header>Componente</header>
                  <ul className={classes.megaLinks}>
                    <li className={classes.link}>
                      <Link to="/placi-video">Placi video</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/procesoare">Procesoare</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/placi-de-baza">Placi de baza</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/memorii">Memorii</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/hard-disk-uri">Hard Disk-uri</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/ssd-uri">SSD</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/surse">Surse</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/carcase">Carcase</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/coolere">Coolere</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/ventilatoare">Ventilatoare</Link>
                    </li>
                  </ul>
                </div>
                <div className={classes.row}>
                  <header>Laptop</header>
                  <ul className={classes.megaLinks}>
                    <li className={classes.link}>
                      <Link to="/laptop-uri">Notebook</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/laptop-uri">Ultrabook</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/laptop-uri">Laptop Business</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/laptop-uri">Laptop Gaming</Link>
                    </li>
                  </ul>
                </div>
                <div className={classes.row}>
                  <header>Sisteme Gaming & Office</header>
                  <ul className={classes.megaLinks}>
                    <li className={classes.link}>
                      <Link to="/desktop-uri">PC Gaming Low-Level</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/desktop-uri">PC Gaming Middle-Level</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/desktop-uri">PC Gaming High-Level</Link>
                    </li>
                    <li className={classes.link}>
                      <Link to="/desktop-uri">PC Office</Link>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </li>
          {/*<li className={classes.link}>*/}
          {/*  <Link to="/feedback">Feedback</Link>*/}
          {/*</li>*/}
          <li className={classes.link}>
            <Link to="/contact">Contact</Link>
          </li>
          <li className={classes.link}>
            <Link to="/about-us">Despre noi</Link>
          </li>
          <li className={classes.link}>
            <Link to="/cos-cumparaturi" className={classes.cart}>
              COS<span className={classes.cartQuantity}>0</span>
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

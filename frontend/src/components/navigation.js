import "../scss/main.css"
import { Link } from "react-router-dom";
// import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
// import { solid, regular, brands } from '@fortawesome/fontawesome-svg-core/import.macro'
let user = {
	"username": null
}
// let cart = <FontAwesomeIcon icon={solid("cart-plus")} />;

function getNavigation() {

	return (
		<nav>
			<div className="wrapper">
				{
					user.username != null
						?
					<div className="logo">
						<Link to="/login">Logare</Link>
						<Link to="/register">Inregistrare</Link>
					</div>
						:
					<div className="logo">
						<Link to="/">Login</Link>
						<Link to="/logout">Deconectare</Link>
					</div>
				}
				<input type="radio" name="slider" id="menu-btn"/>
					<input type="radio" name="slider" id="close-btn"/>
						<ul className="nav-links">
							<label htmlFor="close-btn" className="btn close-btn"><i
								className="fas fa-times"></i></label>
							<li><Link to="/">Home</Link></li>
							<li>
								<Link to="/" className="desktop-item">Adauga produse</Link>
								<input type="checkbox" id="showDrop"/>
									<label htmlFor="showDrop" className="mobile-item">Adauga produs</label>
									<ul className="drop-menu">
										<li><Link to="/add-case">Link button</Link></li>
										<li><Link to="/add-case">Carcasa</Link></li>
										<li><Link to="/add-cooler">Cooler</Link></li>
										<li><Link to="/add-desktop">Desktop</Link></li>
										<li><Link to="/add-graphics-card">Placa video</Link></li>
										<li><Link to="/add-motherboard">Placa de baza</Link></li>
										<li><Link to="/add-power-supply">Sursa</Link></li>
										<li><Link to="/add-processor">Procesor</Link></li>
										<li><Link to="/add-ram">Memorie</Link></li>
										<li><Link to="/add-vent">Ventilator</Link></li>
									</ul>
							</li>
							<li>
								<Link to="/" className="desktop-item">Categorii</Link>
								<input type="checkbox" id="showMega"/>
									<label htmlFor="showMega" className="mobile-item">Categorii</label>
									<div className="mega-box">
										<div className="content">
											<div className="row">
											{/*<img src="/static/img/logo/icon.png" alt="Logo"/>*/}
											</div>
											<div className="row">
												<header>Componente</header>
												<ul className="mega-links">
													<li><Link to="/placi-video">Placi video</Link></li>
													<li><Link to="/procesoare">Procesoare</Link></li>
													<li><Link to="/placi-de-baza">Placi de baza</Link></li>
													<li><Link to="/memorii">Memorii</Link></li>
													<li><Link to="/hard-disk-uri">Hard Disk-uri</Link></li>
													<li><Link to="/ssd-uri">SSD</Link></li>
													<li><Link to="/surse">Surse</Link></li>
													<li><Link to="/carcase">Carcase</Link></li>
													<li><Link to="/coolere">Coolere</Link></li>
													<li><Link to="/ventilatoare">Ventilatoare</Link></li>
												</ul>
											</div>
											<div className="row">
												<header>Laptop</header>
												<ul className="mega-links">
													<li><Link to="/laptop-uri">Notebook</Link></li>
													<li><Link to="/laptop-uri">Ultrabook</Link></li>
													<li><Link to="/laptop-uri">Laptop Business</Link></li>
													<li><Link to="/laptop-uri">Laptop Gaming</Link></li>
												</ul>
											</div>
											<div className="row">
												<header>Sisteme Gaming & Office</header>
												<ul className="mega-links">
													<li><Link to="/desktop-uri">PC Gaming Low-Level</Link></li>
													<li><Link to="/desktop-uri">PC Gaming Middle-Level</Link></li>
													<li><Link to="/desktop-uri">PC Gaming High-Level</Link></li>
													<li><Link to="/desktop-uri">PC Office</Link></li>
												</ul>
											</div>
										</div>
									</div>
							</li>
							<li><Link to="/feedback">Feedback</Link></li>
							<li><Link to="/contact">Contact</Link></li>
							<li><Link to="/about-us">About</Link></li>
							<li><Link to="/cos-cumparaturi">CART<span id="cart-quantity">0</span>
							</Link></li>
						</ul>
						<label htmlFor="menu-btn" className="btn menu-btn"><i className="fas fa-bars"></i></label>
			</div>
		</nav>
	)
}

export default getNavigation();
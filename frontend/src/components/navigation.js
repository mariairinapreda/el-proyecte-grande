import "../scss/main.css"
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
						<a href="/login">Logare</a>
						<a href="/register">Inregistrare</a>
					</div>
						:
					<div className="logo">
						<a href="#">Login</a>
						<a href="/logout">Deconectare</a>
					</div>
				}
				<input type="radio" name="slider" id="menu-btn"/>
					<input type="radio" name="slider" id="close-btn"/>
						<ul className="nav-links">
							<label htmlFor="close-btn" className="btn close-btn"><i
								className="fas fa-times"></i></label>
							<li><a href="/">Home</a></li>
							<li>
								<a href="#" className="desktop-item">Adauga produse</a>
								<input type="checkbox" id="showDrop"/>
									<label htmlFor="showDrop" className="mobile-item">Adauga produs</label>
									<ul className="drop-menu">
										<li><a href="/add-case">Carcasa</a></li>
										<li><a href="/add-cooler">Cooler</a></li>
										<li><a href="/add-desktop">Desktop</a></li>
										<li><a href="/add-graphics-card">Placa video</a></li>
										<li><a href="/add-motherboard">Placa de baza</a></li>
										<li><a href="/add-power-supply">Sursa</a></li>
										<li><a href="/add-processor">Procesor</a></li>
										<li><a href="/add-ram">Memorie</a></li>
										<li><a href="/add-vent">Ventilator</a></li>
									</ul>
							</li>
							<li>
								<a href="#" className="desktop-item">Categorii</a>
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
													<li><a href="/placi-video">Placi video</a></li>
													<li><a href="/procesoare">Procesoare</a></li>
													<li><a href="/placi-de-baza">Placi de baza</a></li>
													<li><a href="/memorii">Memorii</a></li>
													<li><a href="/hard-disk-uri">Hard Disk-uri</a></li>
													<li><a href="/ssd-uri">SSD</a></li>
													<li><a href="/surse">Surse</a></li>
													<li><a href="/carcase">Carcase</a></li>
													<li><a href="/coolere">Coolere</a></li>
													<li><a href="/ventilatoare">Ventilatoare</a></li>
												</ul>
											</div>
											<div className="row">
												<header>Laptop</header>
												<ul className="mega-links">
													<li><a href="/laptop-uri">Notebook</a></li>
													<li><a href="/laptop-uri">Ultrabook</a></li>
													<li><a href="/laptop-uri">Laptop Business</a></li>
													<li><a href="/laptop-uri">Laptop Gaming</a></li>
												</ul>
											</div>
											<div className="row">
												<header>Sisteme Gaming & Office</header>
												<ul className="mega-links">
													<li><a href="/desktop-uri">PC Gaming Low-Level</a></li>
													<li><a href="/desktop-uri">PC Gaming Middle-Level</a></li>
													<li><a href="/desktop-uri">PC Gaming High-Level</a></li>
													<li><a href="/desktop-uri">PC Office</a></li>
												</ul>
											</div>
										</div>
									</div>
							</li>
							<li><a href="/feedback">Feedback</a></li>
							<li><a href="/contact">Contact</a></li>
							<li><a href="/about-us">About</a></li>
							<li><a href="/cos-cumparaturi">CART<span id="cart-quantity">0</span>
							</a></li>
						</ul>
						<label htmlFor="menu-btn" className="btn menu-btn"><i className="fas fa-bars"></i></label>
			</div>
		</nav>
	)
}

export default getNavigation();
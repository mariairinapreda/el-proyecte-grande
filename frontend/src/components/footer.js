import "../scss/main.css"

function getFooter() {
	return(
		<div className="footer-div">
			<div className="footer-text-div">
				<div><span>L.A Team &copy; 2022 Codecool Bucharest</span></div>
				<div>
					<a href="https://www.linkedin.com/in/loredana-mihai-b5b46b206/" target="_blank" rel="noreferrer">Loredana-Stefania
						Mihai </a>
					|
					<a href="https://www.linkedin.com/in/loredana-mihai-b5b46b206/" target="_blank" rel="noreferrer"> Maria-Irina Preda </a>
					|
					<a href="https://www.linkedin.com/in/marian-andrei-sidor-603069174/" target="_blank" rel="noreferrer"> Marian-Andrei
						Sidor</a>
				</div>
			</div>
		</div>
	)
}

export default getFooter();
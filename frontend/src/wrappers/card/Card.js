import "./Card.styles.scss"

const Card = ({title, imageUrl, details,price, currency}) => {
  return (
	  <div  className="custom-card">
		  <img className="custom-card-image" src={imageUrl} alt="None" />
		  <div className="custom-card-header">
			  <p className="custom-card-title">
				  {title}
			  </p>
		  </div>
		  {details}
		  <div className="custom-card-body">
			  <div className="custom-card-text">
				  <p className="lead">
					  {price} {currency}
				  </p>
			  </div>
			  <div className="custom-card-text">
				  <button className="btn btn-success add-product">
					  Adauga in cos
				  </button>
			  </div>
		  </div>
	  </div>
  );
}

export default Card;
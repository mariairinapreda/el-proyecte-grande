import { useEffect, useState} from "react";
import Footer from "../components/Footer";
import Navigation from "../components/Navigation";
import {Link} from "react-router-dom";
import "../scss/first_page.css"

const LandingPage =() => {
    const [categories, setCategories] = useState([]);

    useEffect(() =>{
        fetch("http://localhost:8888/categories",{method:"GET"}).then(
            response => response.json()
        ).then(re =>
            setCategories(re)
        )
    },[])
    if (categories != null) {
        console.log({categories})
    }


    return(
        <>
            <Navigation />
            <div className={"container"}>
                {categories.map(category =>
                    <div key={"category_"+category.id} className={"category-card"}>
                        <Link  to={category.url}>
                            <img className={"category-card-image"} src={category.imageUrl} alt={category.name + " Image"}/>
                            <p className={"category-card-title"}>{category.name}</p>
                        </Link>
                    </div>
                )}
            </div>
            <Footer />
        </>
    )
}

export default LandingPage;
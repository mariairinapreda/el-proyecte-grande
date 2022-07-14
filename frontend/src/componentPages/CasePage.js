import {useEffect, useState} from "react";
import Navigation from "../components/Navigation";
import Footer from "../components/Footer";

const CasePage = () => {
    const [cases,setCases] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8888/case", {method:"GET"})
            .then(response => response.json())
            .then(re => setCases(re))
    },[])

    return (
        <>
            <Navigation />



            <Footer />
        </>
    )
}

export default CasePage;
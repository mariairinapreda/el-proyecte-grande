import { useEffect, useState} from "react";
import Footer from "../components/Footer";
import Navigation from "../components/Navigation";

const LandingPage =() => {
    const [data, setData] = useState(null);

    useEffect(() =>{
        fetch("http://localhost:8888/demo/case",{method:"GET"}).then(
            response => response.json()
        ).then(re =>
            setData(re)
        )
    },[])
if (data != null) {
    console.log({data})
}


    return(
        <>
            <Navigation />
            <ul style={{fontSize: "50px"}}>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
                <li>a</li>
            </ul>
            <Footer />
        </>
    )
}

export default LandingPage;
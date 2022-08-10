import "./App.styles.scss";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import LandingPage from "./pages/LandingPage";
import CasePage from "./pages/CasePage";
import Footer from "./components/footer/Footer";
import React from "react";
import Navigation from "./components/navigation/Navigation";

class App extends React.Component {
  constructor() {
    super();
    this.state = {
      user: {
        username: "test",
        status: "user",
      },
    };
  }

  render() {
    let { user } = this.state;
    return (
      <>
        <BrowserRouter>
          <Navigation user={user} />
          <Routes>
            <Route path="/" element={<LandingPage />} />
            <Route path="/carcase" element={<CasePage />} />
            <Route path="/coolere" element={<LandingPage />} />
            <Route path="/desktop-uri" element={<LandingPage />} />
            <Route path="/hard-disk-uri" element={<LandingPage />} />
            <Route path="/laptopuri" element={<LandingPage />} />
            <Route path="/memorii" element={<LandingPage />} />
            <Route path="/placi-de-baza" element={<LandingPage />} />
            <Route path="/placi-video" element={<LandingPage />} />
            <Route path="/procesoare" element={<LandingPage />} />
            <Route path="/ssd-uri" element={<LandingPage />} />
            <Route path="/surse" element={<LandingPage />} />
            <Route path="/ventilatoare" element={<LandingPage />} />

            <Route path="/add-case" element={<Footer />} />
            <Route path="/cases" element={<Footer />}>
              <Route path=":caseId" element={<Footer />}></Route>
            </Route>
            <Route path="*" element={<div>404</div>}></Route>
          </Routes>
        </BrowserRouter>
        <Footer />
      </>
    );
  }
}

export default App;

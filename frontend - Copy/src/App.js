import "./App.styles.scss";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import LandingPage from "./pages/LandingPage";
import Footer from "./components/footer/Footer";
import React from "react";
import SsdPage from "./pages/products/SsdPage";
import VentPage from "./pages/products/VentPage";
import RamPage from "./pages/products/RamPage";
import HddPage from "./pages/products/HddPage";
import CoolerPage from "./pages/products/CoolerPage";
import CasePage from "./pages/products/CasePage";
import AddCaseForm from "./pages/products-add/case/AddCaseForm";
import AddCategory from "./new/category-add/AddCategory";

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
          {/*<Navigation user={user} />*/}
          <Routes>

            <Route path="/demo" element={<AddCategory />} />





            <Route path="/" element={<LandingPage user={user} />} />
            <Route path="/carcase" element={<CasePage user={user} />} />
            <Route path="/coolere" element={<CoolerPage user={user} />} />
            <Route path="/desktop-uri" element={<LandingPage user={user} />} />
            <Route path="/hard-disk-uri" element={<HddPage user={user} />} />
            <Route path="/laptopuri" element={<LandingPage user={user} />} />
            <Route path="/memorii" element={<RamPage user={user} />} />
            <Route
              path="/placi-de-baza"
              element={<LandingPage user={user} />}
            />
            <Route path="/placi-video" element={<LandingPage user={user} />} />
            <Route path="/procesoare" element={<LandingPage user={user} />} />
            <Route path="/ssd-uri" element={<SsdPage user={user} />} />
            <Route path="/surse" element={<LandingPage user={user} />} />
            <Route path="/ventilatoare" element={<VentPage user={user} />} />

            <Route path="/add-case" element={<AddCaseForm />} />
            <Route path="/cases" element={<Footer user={user} />}>
              <Route path=":caseId" element={<Footer user={user} />}></Route>
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

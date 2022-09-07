import "./App.styles.scss";
import {BrowserRouter, Navigate, Route, Routes} from "react-router-dom";
import Footer from "./components/footer/Footer";
import React, { Component } from "react";
import AddCategory from "./new/category-add/AddCategory";
import Login from "./authentication/Login";
import Register from "./authentication/Register";
import AddProduct from "./new/product-add/AddProduct";
import LandingPage from "./pages/LandingPage";
import CategoryProducts from "./pages/category-products/CategoryProducts";
import Product from "./pages/product/Product";

class App extends Component {
  render() {
    return (
      <>
        <BrowserRouter>
          {/*<Navigation user={user} />*/}
          <Routes>
            <Route path="/" element={<LandingPage />} />
            <Route path="/demo" element={<AddCategory />} />
            <Route path="/add-product" element={<AddProduct />} />
            <Route path="/login" element={<Login />} />
            <Route path="/register" element={<Register />} />
            {/*<Route path="/log" element={<Log />}/>*/}
            <Route path={"/categorii/:categoryName"} element={<CategoryProducts />} />
            <Route path={"/produse/:productName"} element={<Product/>}/>
            <Route path="*" element={<div>404</div>}></Route>
          </Routes>
        </BrowserRouter>
        <Footer />
      </>
    );
  }
}

export default App;

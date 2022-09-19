import "./App.styles.scss";
import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import Footer from "./components/footer/Footer";
import React, { useEffect } from "react";
import AddCategory from "./new/category-add/AddCategory";
import Login from "./authentication/Login";
import Register from "./authentication/Register";
import AddProduct from "./new/product-add/AddProduct";
import LandingPage from "./pages/LandingPage";
import CategoryProducts from "./pages/category-products/CategoryProducts";
import Product from "./pages/product/Product";
import { useAtom } from "jotai";
import { USER } from "./atoms/STORE";

const App = () => {
  const [user, setUser] = useAtom(USER);

  useEffect(() => {
    let { token, id, name, role } = localStorage;
    setUser({
      token: token,
      id: id,
      name: name,
      roles: [role],
    });
  }, []);
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<LandingPage />} />

          <Route
            path="/adauga-categorie"
            element={
              user.roles.indexOf("ADMIN") !== -1 ? (
                <AddCategory />
              ) : (
                <Navigate to={"/"} />
              )
            }
          />
          <Route
            path="/adauga-produs"
            element={
              user.roles.indexOf("ADMIN") !== -1 ? (
                <AddProduct />
              ) : (
                <Navigate to={"/"} />
              )
            }
          />

          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route
            path={"/categorii/:categoryName"}
            element={<CategoryProducts />}
          />
          <Route path={"/produse/:productName"} element={<Product />} />
          <Route path="*" element={<div>404</div>}></Route>
        </Routes>
      </BrowserRouter>
      <Footer />
    </>
  );
};

export default App;

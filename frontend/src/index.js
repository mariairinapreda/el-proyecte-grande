import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import {
    BrowserRouter,
    Routes,
    Route,
} from "react-router-dom";
import LandingPage from "./componentPages/LandingPage";
import Footer from "./components/Footer";

const root = ReactDOM.createRoot(document.getElementById('root'));


root.render(
  <React.StrictMode>
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<LandingPage />} />

              <Route path="/carcase" element={<LandingPage />} />
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

              <Route path="/add-case" element={<Footer />}/>
              <Route path="/cases" element={<Footer />}>
                  <Route path=":caseId" element={<Footer />}></Route>
              </Route>
              <Route path="*" element={<Footer />}></Route>
          </Routes>
      </BrowserRouter>

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

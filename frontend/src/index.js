import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import footer from "./components/footer";
import navigation from "./components/navigation";

const root = ReactDOM.createRoot(document.getElementById('root'));

let foot= footer;
let nav = navigation;
root.render(
  <React.StrictMode>
      {nav}
    <App />
      {foot}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

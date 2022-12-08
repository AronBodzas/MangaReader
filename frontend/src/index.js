import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter, Router} from "react-router-dom";
import App from "./App";
import Header from "./Header";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <Header />
        <BrowserRouter>
            <App/>
        </BrowserRouter>
    </React.StrictMode>
);

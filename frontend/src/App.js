import MangaList from "./MangaList";
import {Route, Routes} from "react-router-dom";
import React from "react";


function App(){
    return (
        <div className="App">
            <Routes>
                <Route path="/" element={<MangaList />}/>
            </Routes>
        </div>
    )
}

export default App;
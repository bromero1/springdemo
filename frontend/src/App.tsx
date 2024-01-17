import { Route, Routes } from "react-router-dom";
import JournalEntry from "./pages/JournalEntry";
import Home from "./pages/Home";
//import OAuth2Redir from "./user/oauth2/OAuth2Redir";
import Login from "./pages/login/Login";

function App() {
  return (
    <div className="App">
      <Routes>
        {/* <Route path="/oauth2/redirect" element={<OAuth2Redir />}></Route> */}
        <Route path="/daily" element={<JournalEntry />} />
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
      </Routes>
    </div>
  );
}

export default App;

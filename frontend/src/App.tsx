import { Route, Routes } from "react-router-dom";
import JournalEntry from "./pages/JournalEntry";
import Home from "./pages/Home";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/daily" element={<JournalEntry />} />
        <Route path="/" element={<Home />} /> 
      </Routes>
    </div>

  );
}

export default App;

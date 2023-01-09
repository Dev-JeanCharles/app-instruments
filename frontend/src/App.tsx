import "./App.css";
import "./assets/styles/custom.scss";
import MenuBar from "./components/MenuBar";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";

function App() {
  return (
    <>
      <Navbar />
      <MenuBar />
      <Home />
    </>
  );
}

export default App;

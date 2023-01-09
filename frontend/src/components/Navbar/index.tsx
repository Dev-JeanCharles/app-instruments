import "./styles.css";
import Select from "react-select";
import { ReactComponent as Logo } from "../../assets/images/logo.svg";

const Navbar = () => {
  return (
    <nav className="bg-danger navbar navbar-expand-md main-nav">
      <div className="container-fluid">
        <div className="nav-container-superior">
          <a href="link" className="nav-logo">
            <Logo />
          </a>
          <div className="nav-catalog-content-search">
            <Select />
          </div>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;

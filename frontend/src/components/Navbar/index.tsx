import {ReactComponent as Github} from 'assets/img/github.svg';
import './styles.css';
function Navbar() {
    return (
        <header>
      <nav className="container">
        <div className="locadora-nav-content">
          <h1>Locadora</h1>
          <a href="https://github.com/CesarO99">
            <div className="locadora-contact-container">
              <Github />
              <p className="locadora-link-container">/Meu Github</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
    );
}

export default Navbar;
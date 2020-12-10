import React, {useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  const [message, setMessage] = useState("");
  useEffect(() => {
    fetch('/index')
    .then(response => response.text())
    .then(message => {
      setMessage(message);
    });
  }, []);
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          안녕하세요
        </p>
        <h2>
          {message}
        </h2>
      </header>
    </div>
  );
}

export default App;

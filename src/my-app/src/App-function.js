import logo from './logo.svg';
import './App.css';
import { useEffect } from 'react';

function App() {
  useEffect(() => {
    fetch('/students')
    .then(response => response.json())
    .then(data => console.log(data))
  }, [])
  return (
    <h1>Hello Spring Boot</h1>
  );
}

export default App;

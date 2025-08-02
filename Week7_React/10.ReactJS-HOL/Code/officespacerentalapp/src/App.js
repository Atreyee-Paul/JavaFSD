import React from 'react';
import './App.css';
import officeImage from './office.jpg';

function App() {
  const heading = "Office Space";
  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const rentColor = office.Rent <= 60000 ? 'textRed' : 'textGreen';

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>
      <img src={officeImage} width="25%" height="25%" alt="Office Space" />
      <h1>Name: {office.Name}</h1>
      <h3 className={rentColor}>Rent: Rs. {office.Rent}</h3>
      <h3>Address: {office.Address}</h3>
    </div>
  );
}

export default App;

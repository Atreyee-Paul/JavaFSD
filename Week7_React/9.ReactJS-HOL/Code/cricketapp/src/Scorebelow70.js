import React from "react";

function Scorebelow70({ players }) {
  let players70 = [];
  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
  });

  return (
    <ul>
      {players70.map((p, i) => (
        <li key={i}>
          Mr. {p.name} <span>{p.score}</span>
        </li>
      ))}
    </ul>
  );
}

export default Scorebelow70;

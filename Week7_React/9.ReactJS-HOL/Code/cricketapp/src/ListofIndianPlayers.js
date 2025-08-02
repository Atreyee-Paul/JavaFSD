import React from "react";

export const T20Players = ["First Player", "Second Player", "Third Player"];
export const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

export function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <ul>
      {IndianPlayers.map((p, i) => (
        <li key={i}>Mr. {p}</li>
      ))}
    </ul>
  );
}

import './App.css';
import React, { useState, useEffect } from 'react';


export default function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch('/students');
        const json = await response.json();
        setData(json);
        console.log(json);
      } catch (error) {
        console.error(error);
      }
    };
    if(!data.length){
      fetchData();
    }
  }, [data]);
    
      
  return (
    <div>
      {data.map((post) => (
        <div key={post.id}>
          <p>{post.id}</p>
          <p>{post.first_name}</p>
        </div>
      ))}
    </div>
  );
      
}
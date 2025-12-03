import { useState } from 'react'
function App() {
    const [message, setMessage] = useState("Loading...");
    const checkHealth = async () => {
        try {
            const res = await fetch("http://localhost:8080/health");
            const text = await res.text();
            setMessage(text);
        }
        catch (error) {
            setMessage("Error connecting to backend");
        }
    };

    return (
        <div style={{ padding: "20px", fontSize: "20px" }}>
            <h2>React Orders Dashboard</h2>
            <button onClick={checkHealth}>Check Backend Health</button>
            <p>Backend says: {message}</p>
        </div>
    );
}

export default App;
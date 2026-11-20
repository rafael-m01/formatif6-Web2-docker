import {useEffect, useState} from 'react'
import './App.css'
import {fetchAvailableBidulesAsync} from "./script/http.js";
import {Bidule} from "./composant/Bidule.jsx";

function App() {
    const [bidules, setBidules] = useState([]);
    const [isFetching, setIsFetching] = useState(false);
    const [error, setError] = useState({error: "none", message: ""});

    useEffect(() => {
        (async function () {
            setIsFetching(true)
            try {
                const bidulesRecus = await fetchAvailableBidulesAsync();
                setBidules(bidulesRecus);

            } catch (error) {
                setError({error: "error", message: error.message});
            } finally {
                setIsFetching(false);
            }
        })();

    }, [fetchAvailableBidulesAsync]);

    return (
        <>
            <h1>Bienvenue sur le site des bidules</h1>
            {isFetching ? <p>Loading...</p> : error.error === "none" ?
                <>
                    <h2>Les bidules sonts :</h2>
                    <ul>
                        {bidules.map((bidule) => (
                            <Bidule key={bidule.id} nom={bidule.nom} id={bidule.id}/>
                        ))}
                    </ul>
                </> :
                <p style={{backgroundColor:"red"}}>Erreur : {error.message}</p>
            }
        </>
    )
}

export default App

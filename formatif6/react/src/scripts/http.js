export async function fetchAvailableBidulesAsync() {
    //const url ='http://localhost:8080/formatif6/bidules'; // avec un war
    const url ='http://localhost:8080/bidules'; // avec un jar
    const response = await fetch(url); // peut aussi lancer une erreur

    if (!response.ok) {
        throw new Error('Échec du chargement des locations');
    }
    const resData = await response.json();
    return resData;
}
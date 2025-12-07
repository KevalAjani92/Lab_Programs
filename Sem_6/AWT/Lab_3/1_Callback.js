//WAP to demonstrate callbacks in JavaScript. 
function fetchData(callbackFunction) {
    const data = "Sample Data";
    callbackFunction(data);
}

function displayData(data) {
    console.log("Fetched Data:", data);
}
fetchData(displayData);
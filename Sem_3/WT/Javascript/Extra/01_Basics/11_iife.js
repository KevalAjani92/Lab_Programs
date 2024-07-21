//Immediately Invoked Function Expression (IIFE)

(function one() {
    console.log(`DB CONNECTED`);
})();

( (name) =>{
    console.log(`DB CONNECTED TWO ${name}`);
} )('Keval Ajani');
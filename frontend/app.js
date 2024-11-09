// /* eslint-disable no-unused-vars */
function addElement(array, element){
    array.push(element);
    console.log(`Element ${element} added to the array`);
}

function displayArray(array){
    console.log("Array contents:",array.join(", "));
}

let myArray =[];
addElement(myArray,5);
addElement(myArray,3);
displayArray(myArray);
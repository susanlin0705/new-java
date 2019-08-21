// Make a function named isEqual(input1, input2) that returns if both inputs have the same value. areEqual

function isEqual(input1, input2){
    if(input1==input2){
        return true;
    }
    return false;
}

// Make a function named isIdentical(input1, input2) that returns if both inputs are same value and data type.

function isIdentical(input1, input2) {
    if(input1===input2){
        return true;
    }
}
console.log(isIdentical(1,2));

// Make a function named not(input) returns the input with a flipped boolean

function not(input){
    if(input == true){
        return false;
    }
    return true;
}

//Make a function named isOdd(number) that returns true if the number is odd
 function isOdd(number) {
     if(number%2===1){
         return true;
     }
     return false;
 }
// Make a function named isEven(number) that returns true if the number is even or zero

function isEven(number){
    if(number%2===0){
        return true;
    }
    return false;
}
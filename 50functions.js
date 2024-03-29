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

// Make a function named isPositive(number) that returns true if the provided input is a positive number. False for zero or any other number or data type.
function isPositive(number){
    if(number>0 && number===!NaN){
        return true;
    }
    return false;
}

// Make a function named isNegative(number) that returns true if the provided input is a negative number. False for zero or any other number or data type
function isNegative(number){
    if(number<0 && number===!NaN){
        return true;
    }
    return false;
}
// Make a function named isFive(input)
function isFive (input){
    return 5;
}
//Make a function named addFive(input) that adds five to some input.

function addFive(input){
    return input +5;
}

// Make a function named isVowel(letter)
function vowelTest(s) {
    return (/^[aeiou]$/i).test(s);
}
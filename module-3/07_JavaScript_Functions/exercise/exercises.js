/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */

function isAdmitted(gpa, satScore = 0, recommendation =false) {
    let admitted = (gpa > 4.0 || satScore > 1200 || gpa > 3.0 && recommendation || satScore
        > 1200 && recommendation);
        return admitted;
}
 



/**
 * Write a function called useParameterToFilterArray that takes an anonymous
 * function and uses that in the `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */

function useParameterToFilterArray(filterFunction) {

let unfilteredArray = [1, 2, 3, 4, 5, 6];

return unfilteredArray.filter(filterFunction);

}




/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

// function makeNumber(first, second = '') {
//     number = first + second;
//     number = Number
// }







/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
function addAll(num) {
    let sum = 0;
    for(i = 0; i < arguments.length; i++) {
        sum += arguments[i];
    }
    return sum;
}


/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */

/**
 * Takes an array and prepends 'Happy' at the beginning of all words
 * @param 
 * 
 */
function makeHappy(str) {
    return str.map((hString) => {
        return "Happy " + hString;
    });
}


/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */

function getFullAddressesOfProperties(strObj) {

    return strObj.map((values) => {
        return values.streetNumber + " " + values.streetName + " " + values.streetType +
         " " + values.city + " " + values.state + " " + values.zip;
    })

    

}

/*
 * Write and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It must work for strings and numbers.
 */

function findLargest (myArrays) {
    a = 0;
    b = "";
    myArrays.forEach((myArray) => {
        if (typeof myArray != Number) {
            if(b < myArray) {
                b= myArray
            }
        } else if(a < myArray) {
             a = myArray;
        }
        // if (typeof myArray == String) {
        //     if(a < myArray) {
        //         a = myArray
        //     }
        // }

        }); 
        
        if(typeof myArrays[0] != Number) {
            return b;
        }
        return a;
    }




/**
 *  Write a function to find the largest element in an array. 
 * @param
 * @param
 * @returns 
 */



















/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */

function getSumOfSubArrayValues(){
    return 0;
}

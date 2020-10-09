// Step 1

var name='Oriol';
var surname1='Canadés';
var surname2='Díez';
var day=26;
var month=2;
var year=2020;
consloe.log(surname1 + '' + surname2 + ',' + name + '\n');
consloe.log(day + '/' + month + '/' + year);

// Step2

const constantLeapYear=1948;
var arrayLeapYears=[];

var i;
for (i=4; i<arrayLeapYears.length; i+=4) {
    if (i%400===0 || i%4===0 || i/100!==0) {
        console.log(i);
    }
}

var birthYear=window. prompt("Enter a year, please: ");
var resultLYCount=(birthYear-constantLeapYear)/4;

console.log("Between 1948 and " + birthYear + " there are " + resultYCount + " leap years.");


// Step 3

var entryBirthYear = window. prompt("Enter a year, please: ");
var leapYear = 1948;

// print all leap years since 1948 until the year who had been introduced in console

for (i=leapYear; i<entryBirthYear; i+=4){
    console.log(i);
}

var booLeapYearTrue="It's a leap year";
var booLeapYearFalse="It isn't a leap year";

if (entryBirthYear%400===0 || entryBirthYear%4===0 && entryBirthYear/100!==0) {
    console.log(booLeapYearTrue);
}
else {
    console.log(booLeapYearFalse);
}


// Step 4

// Name input

var entryName = window. prompt("What's your name?");
var entrySurname = window. prompt("What's your surname?");
var completeName = entryName + " " + entrySurname; // complete variable name

// Birth input

var entryBirthDay = window. prompt("Enter your birth day, please: ");
var entryBirthMonth = window. prompt("Enter your birth month, please: ");
var entryBirthYear = window. prompt("Enter your birth year, please: ");
var completeDate = entryBirthMonth + "/" + entryBirthDay + "/" + entryBirthYear; // complete variable birth date

// Out name and birth info

if (entryBirthYear%400===0 || entryBirthYear%4===0 && entryBirthYear/100!==0) {
    console.log(completeName + ", " + completeDate + ". " + entryBirthYear + " was a leap year");
}
else {
    console.log("Your name is " + completeName + "\n" + "You were born " + completeDate + " and " + entryBirthYear + " wasn't a leap year.");
}
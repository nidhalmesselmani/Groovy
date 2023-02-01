def num = 0

if (num == 10) 
    println "num is 10"
else 
    println "num is not 10"

// to check number is positive or negative    
if (num > 0) 
    println "number is positive"
else if (num == 0)
    println "number is zero"
else 
    println "number is negative"

// switch-case
def x = 0
def result = ""

switch(x){
    case 0: 
        result = "x is zero"
        break
    case {x>0}:
         result = "x is positive"
         break
    case {x<0}:
        result = "x is negative"
        break
    default:
        result = "Invalid number"
}

println result
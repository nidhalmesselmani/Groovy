def printHello(){
    println "Hello.."
}

printHello()

def sum(int a, int b=20){
    println "Sum is "+(a+b)
}

sum(5,3)
sum(5)

int sub(int a, int b){
    int c = a-b
    return c
}

println " result is " + sub(8,5)
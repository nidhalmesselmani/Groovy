
def str = "Hello!!"

def myClosure1 = { name -> println "${str} ${name}"}

myClosure1.call("Nidhal")

def myMethod(clos){
    clos.call("Groovy")
}

def myClosure2 = {
    a,b,c -> return (a+b+c)
}

def res =  myClosure2(10,20,30)
println res


def myList1 = ["Apples", "Orange", "Grapes"]
println myList1.each { it }

def myMap = [
    'subject' : 'groovy',
    'topic'   : 'closures'
    ]
println myMap.each { it }


def myList = [1,2,3,4,5]
println  myList.find { item -> item == 3 }
println  myList.findAll { item -> item > 3 }
println  myList.any { item -> item > 3 }
println  myList.every { item -> item > 3 }
println  myList.collect { item -> item * 2 }
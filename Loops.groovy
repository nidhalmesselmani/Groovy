// for 
/* for (int i=1; i<5; i++){
    println i
} */

// for in
/* for (i in 1..5){
    println i
}
 */
// 1.upto(5){    println "$it" }

// 5.times {  println "$it"  }

// 1.step(10, 2){  println "$it" }

// iterate over a list
/* for ( i in [0, 1, 2, 3, 4] ) {
    println i
} */

// iterate over a map
/* def map = ['abc':1, 'def':2, 'xyz':3]
x = 0
for ( e in map ) {
    println e.key
    println e.value
} */

int i=1
while(i<5){
    println i
    i++
}
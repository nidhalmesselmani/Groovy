

try {
  int i = 1/1

}catch(ArithmeticException exp1){
   println "Catch block to catch arithmetic exceptions"
}
catch(Exception exp){
   println "I am inside exception block"
   println exp.getCause()
   println exp.getMessage()
   // exp.printStackTrace()
}finally {
    println "I am inside finally block"
}

println "I am here"


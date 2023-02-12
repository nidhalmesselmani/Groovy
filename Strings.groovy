

/* String name = "Nidhal"
println name

println "my name is " + name 

println "my name is ".concat(name) 

println "my name is ${name}" 
println "my name is $name" 
// we can do interpolation only in a doubled quoted strings
println 'my name is $name' 

String s1 = """ this is 
heello yeah no"""

println s1

println name.length()
println name[2]
println name[-2]
println name.indexOf('h')
println name[0..2]
println name[5..3]
println name[0,2,4]
println name.substring(2)
println name.subSequence(1,4)
 */

/* String str = "This is a groovy class"

println str.split(" ")
println str-("groovy ")
println str.replace("class", "session")
println str.toLowerCase()
println str.toUpperCase()
println str.toList()
println "Groovy "*3
println "Abc".equals("abc")
println "Abc".equalsIgnoreCase("abc") */
// slashy and $ dollar slashy strings
String name = "Nidhal"
String s1 = /a green sky 
       $name/
String s2= $/a blue tree 
       $name/$
println s1
println s2

println "my name is \"nidhal\""
String s3 =  /my name is "Nidhal"/
println s3
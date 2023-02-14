// reges - patterns used to find substrings in a text
// ~"expression"

def regex = / (?:[^Groovy]*) /

def match = "This is Groovy" =~ regex


if (match) {
    int i = 0
    while(match){
        
        println match[i]
        i++

    }
    
}else {
    println "no match found"
}

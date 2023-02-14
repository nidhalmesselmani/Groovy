/**  reading fies **/
String filePath = "data1.txt"
File myFile = new File(filePath)

// reading entire content as String
println myFile.text

// collect lines into a list

def list = myFile.collect{ it }
println "list: $list"

// store file content in an array
def array = myFile as String[]
println "array: $array"

// read file into a list of String
def lines = myFile.readLines()
println "lines : $lines"
// read line by line
myFile.eachLine { line ->
println "line : $line"
 }
 // read file line by line with line no
myFile.eachLine { line, lineNo ->
println "$lineNo : $line"
 }
 def lineNoRange = 2..4
 def lineList = []
 myFile.eachLine { line, lineNo ->
     if(lineNoRange.contains(lineNo)){
         lineList.add(line)
     }
    // println "$lineNo : $line"
 }
 println "lineList: $lineList "

 // read with a reader
 def line
 myFile.withReader { reader ->
     while((line = reader.readLine()) != null ){
        println line
     }     
  }
  // reading with new reader
  def outputFile = "data2.txt"
  def reader = myFile.newReader()

  new File(outputFile).append(reader)
  reader.close()

  // when working with binary files, read content as bytes
  byte[] contents = myFile.bytes
  println contents

  // size in bytes
println myFile.length()

// check if is a file or dir
println myFile.isFile()
println myFile.isDirectory()

// get list of files from a directory
new File("C:/Docker/Groovy").eachFile {
    files -> println files.getAbsolutePath()
}

// recursiverly display all files in a directory & it's sub-dir
new File("C:/Docker/Groovy").eachFileRecurse { 
    files -> println files.getAbsolutePath()
}

// copy file data to another file
def newFile = new File("data3.txt")
newFile << myFile.text

// delete file
newFile.delete()
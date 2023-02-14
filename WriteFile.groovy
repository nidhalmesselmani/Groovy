File myFile = new File("data1.txt")

myFile.write("this is Line 1")
myFile << "\nThis is a line 2"
// myFile.text = "This is Line3"

myFile.withWriter { writer ->
    writer.writeLine("This is Line 4")
 }

 myFile.append("\n This is Line 5")

println myFile.length()
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()

def newFile = new File("data2.txt")
newFile << myFile.text

myFile.bytes = []

myFile.renameTo("newFile.txt")

println myFile.text
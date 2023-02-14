class Student {
    
    private String name
    private int sub1Marks
    private int sub2Marks


    void  printTotal() {
        println " $name total of marks are " + (sub1Marks + sub2Marks)
    }

     public static void main(args){

        Student student1 = new Student()
        student1.name = "John"
        student1.sub1Marks = 17
        student1.sub2Marks = 18
        
        student1.printTotal()

        Student student2 = new Student()
        student2.name = "Sarah"
        student2.sub1Marks = 15
        student2.sub2Marks = 14
        
        student2.printTotal()



    }
}
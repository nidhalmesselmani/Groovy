package abstractDemo

abstract class Car {

    String name;
    String color;
    int model;

    def startEngine(){
        println "Engine Started for $name"
    }

    abstract void topSpeed();

}
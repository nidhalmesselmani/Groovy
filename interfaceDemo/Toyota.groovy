package interfaceDemo

class Toyota implements Car {


    @Override
    public void startEngine(){
        println "Engine started"
    } 
        @Override
    public void stopEngine(){
        println "Engine stopped"
    } 

    static void main(args){
        Toyota car1 = new Toyota()
        car1.startEngine()
        car1.stopEngine()
    }

}
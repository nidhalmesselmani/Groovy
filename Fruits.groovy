class Fruits {
    
    private String fruitName
    private String fruitColor

    void  setFruitName(String name) {
        this.fruitName = name
    }

    def setFruitColor(String color) {
        fruitColor = color
    }

    String getFruitName() {
        return fruitName
    }

    String getFruitColor() {
        return fruitColor
    }

     public static void main(args){

        Fruits apple =  new Fruits()
        apple.setFruitName("Apple")
        apple.setFruitColor("Red") 

        println apple.getFruitName() 
        println apple.getFruitColor() 

    }
}
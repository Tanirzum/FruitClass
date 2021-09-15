public class Test {
    public static void main(String[] args) {

        Box<String, Banana> boxBanana = new Box<>("banana", new Banana());
        boxBanana.getObj().printClass();
        Box<String, Apple> boxApple = new Box<>("apple", new Apple());
        boxApple.getObj().printClass();
        Box<String, Friut> boxFruit = new Box<>("fruit", new Friut());
        boxFruit.getObj().printClass();
        VegetableBox<String, Cabbage> boxVegetable = new VegetableBox<>(new Cabbage(), "cabbage");
        boxVegetable.getObj().printClass();
    }
}

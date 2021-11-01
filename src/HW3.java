public class HW3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();

        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);
        System.out.println(boxOrange.getCurrentWeight());
        System.out.println(boxApple.getCurrentWeight());
        System.out.println(boxApple.compare(boxOrange));

        boxOrange.addFruit(orange);
        System.out.println(boxOrange.getCurrentWeight());
        System.out.println(boxApple.getCurrentWeight());
        System.out.println(boxApple.compare(boxOrange));


    }
}

package Decorator;

public class DecoratorRunner {

    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        CaramelDecorator caramelDecorator = new CaramelDecorator(espresso, 10);

        SoyaMilkDecorator soyaMilk = new SoyaMilkDecorator(caramelDecorator, 2);
        System.out.println("Final Price " + soyaMilk.getCost() + " and " + soyaMilk.getDesc());
    }
}

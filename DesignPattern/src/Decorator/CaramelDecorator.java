package Decorator;

public class CaramelDecorator implements BeverageDecorator {
    private Beverage beverage;
    private int quantity;

    public CaramelDecorator(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 40;
    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc() + "\n This is with Caramel";
    }

    @Override
    public int quantity() {
        return quantity;
    }
}

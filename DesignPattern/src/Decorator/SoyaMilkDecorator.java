package Decorator;

public class SoyaMilkDecorator implements BeverageDecorator {
    private Beverage beverage;
    private int quantity;

    public SoyaMilkDecorator(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 10 * quantity();
    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc() + "\n This is with Soya Milk";
    }

    @Override
    public int quantity() {
        return quantity;
    }
}

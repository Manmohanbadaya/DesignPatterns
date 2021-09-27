package Decorator;

public class Espresso extends Coffee{

    @Override
    public int getCost() {
        return 60;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "\n This is Espresso Category";
    }
}

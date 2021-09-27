package Decorator;

public abstract class Coffee implements Beverage{

    @Override
    public String getDesc() {
        return "This is coffee description";
    }
}

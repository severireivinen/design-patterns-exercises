package model.asus;

import model.interfaces.Case;
import model.interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class AsusCase implements Component, Case {
    private double price;
    private List<Component> components = new ArrayList<>();

    public AsusCase(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        double returnPrice = price;
        if (!components.isEmpty()) {
            for (Component c : components) {
                returnPrice += c.getPrice();
            }
        }
        return returnPrice;
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public String toString() {
        return "Asus Case";
    }
}

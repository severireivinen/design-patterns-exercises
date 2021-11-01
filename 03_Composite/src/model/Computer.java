package model;

import model.interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Component {
    private double price;
    private String name;
    private List<Component> components = new ArrayList<>();

    public Computer(String name) {
        this.name = name;
        this.price = 0;
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
        return name;
    }
}

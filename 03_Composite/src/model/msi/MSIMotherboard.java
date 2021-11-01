package model.msi;

import model.interfaces.Component;
import model.interfaces.Motherboard;

import java.util.ArrayList;
import java.util.List;

public class MSIMotherboard implements Component, Motherboard {
    private double price;
    private List<Component> components = new ArrayList<>();

    public MSIMotherboard(double price) {
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
        return "MSI Motherboard";
    }
}

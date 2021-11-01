package model.msi;

import model.interfaces.CPU;
import model.interfaces.Component;

public class MSICPU implements Component, CPU {
    private double price;

    public MSICPU(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add component to a simple component");
    }

    @Override
    public String toString() {
        return "MSI CPU";
    }
}

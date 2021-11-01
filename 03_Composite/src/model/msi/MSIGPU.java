package model.msi;

import model.interfaces.Component;
import model.interfaces.GPU;

public class MSIGPU implements Component, GPU {
    private double price;

    public MSIGPU(double price) {
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
        return "MSI GPU";
    }
}

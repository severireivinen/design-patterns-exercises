package model.asus;

import model.interfaces.CPU;
import model.interfaces.Component;

public class AsusCPU implements Component, CPU {
    private double price;

    public AsusCPU(double price) {
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
        return "Asus CPU";
    }
}

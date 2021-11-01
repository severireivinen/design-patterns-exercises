package model.msi;

import model.interfaces.Component;
import model.interfaces.NetworkCard;

public class MSINetworkCard implements Component, NetworkCard {
    private double price;

    public MSINetworkCard(double price) {
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
        return "MSI Network Card";
    }
}

import factory.ComponentFactory;
import model.Computer;
import model.interfaces.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Class c = null;
        ComponentFactory componentFactory = null;

        Properties properties = new Properties();
        try {
            properties.load(
                    new FileInputStream("03_Composite/src/factory.properties")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            c = Class.forName(properties.getProperty("factory"));
            componentFactory = (ComponentFactory) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Run
        Component ram = componentFactory.createRAM();
        Component cpu = componentFactory.createCPU();
        Component networkCard = componentFactory.createNetworkCard();
        Component gpu = componentFactory.createGPU();
        Component motherBoard = componentFactory.createMotherboard();
        Component computerCase = componentFactory.createCase();
        Component computer = new Computer("My First Computer");

        // Attach to motherboard
        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(networkCard);
        motherBoard.addComponent(gpu);

        // Attach to case
        computerCase.addComponent(motherBoard);
        computer.addComponent(computerCase);

        System.out.println("Name: " + computer + "\nFinal price: " + computer.getPrice() + "€");

    }
}

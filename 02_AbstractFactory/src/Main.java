import factory.interfaces.ClothingFactoryIF;
import factory.interfaces.PersonFactoryIF;
import model.interfaces.PersonIF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Class c = null;
        ClothingFactoryIF clothingFactory = null;
        PersonFactoryIF personFactory = null;

        Properties properties = new Properties();
        try {
            properties.load(
                    new FileInputStream("02_AbstractFactory/src/factory.properties")

            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            c = Class.forName(properties.getProperty("clothingFactory"));
            clothingFactory = (ClothingFactoryIF) c.getDeclaredConstructor().newInstance();
            c = Class.forName(properties.getProperty("personFactory"));
            personFactory = (PersonFactoryIF) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        PersonIF male = personFactory.createPerson("Jasper");
        male.dress(clothingFactory);
        male.printOutfit();
    }
}

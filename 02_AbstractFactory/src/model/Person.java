package model;

import factory.interfaces.ClothingFactoryIF;
import model.interfaces.*;

public class Person implements PersonIF {
    private String name;
    private CapIF cap;
    private TeeIF tee;
    private JeansIF jeans;
    private ShoesIF shoes;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CapIF getCap() {
        return cap;
    }

    public void setCap(CapIF cap) {
        this.cap = cap;
    }

    public TeeIF getTee() {
        return tee;
    }

    public void setTee(TeeIF tee) {
        this.tee = tee;
    }

    public JeansIF getJeans() {
        return jeans;
    }

    public void setJeans(JeansIF jeans) {
        this.jeans = jeans;
    }

    public ShoesIF getShoes() {
        return shoes;
    }

    public void setShoes(ShoesIF shoes) {
        this.shoes = shoes;
    }

    public void dress(ClothingFactoryIF clothingFactory) {
        System.out.println(name + " is getting dressed...");
        setCap(clothingFactory.createCap());
        setTee(clothingFactory.createTee());
        setJeans(clothingFactory.createJeans());
        setShoes(clothingFactory.createShoes());
    }

    public void printOutfit() {
        System.out.println(name + " is wearing " + cap + ", " + tee + ", " + jeans + ", " + shoes);
    }
}

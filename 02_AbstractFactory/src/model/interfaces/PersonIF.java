package model.interfaces;

import factory.interfaces.ClothingFactoryIF;

public interface PersonIF {

    public abstract void dress(ClothingFactoryIF clothingFactory);

    public abstract void printOutfit();

    public abstract String getName();
}

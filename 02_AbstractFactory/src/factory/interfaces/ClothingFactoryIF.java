package factory.interfaces;

import model.interfaces.CapIF;
import model.interfaces.JeansIF;
import model.interfaces.ShoesIF;
import model.interfaces.TeeIF;

public interface ClothingFactoryIF {
    public abstract CapIF createCap();

    public abstract TeeIF createTee();

    public abstract JeansIF createJeans();

    public abstract ShoesIF createShoes();
}

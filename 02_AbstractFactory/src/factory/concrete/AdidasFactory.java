package factory.concrete;

import factory.interfaces.ClothingFactoryIF;
import model.adidas.AdidasCap;
import model.adidas.AdidasJeans;
import model.adidas.AdidasShoes;
import model.adidas.AdidasTee;
import model.interfaces.CapIF;
import model.interfaces.JeansIF;
import model.interfaces.ShoesIF;
import model.interfaces.TeeIF;

public class AdidasFactory implements ClothingFactoryIF {
    @Override
    public CapIF createCap() {
        return new AdidasCap();
    }

    @Override
    public TeeIF createTee() {
        return new AdidasTee();
    }

    @Override
    public JeansIF createJeans() {
        return new AdidasJeans();
    }

    @Override
    public ShoesIF createShoes() {
        return new AdidasShoes();
    }
}

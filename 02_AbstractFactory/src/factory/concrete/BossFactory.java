package factory.concrete;

import factory.interfaces.ClothingFactoryIF;
import model.boss.BossCap;
import model.boss.BossJeans;
import model.boss.BossShoes;
import model.boss.BossTee;
import model.interfaces.CapIF;
import model.interfaces.JeansIF;
import model.interfaces.ShoesIF;
import model.interfaces.TeeIF;

public class BossFactory implements ClothingFactoryIF {
    @Override
    public CapIF createCap() {
        return new BossCap();
    }

    @Override
    public TeeIF createTee() {
        return new BossTee();
    }

    @Override
    public JeansIF createJeans() {
        return new BossJeans();
    }

    @Override
    public ShoesIF createShoes() {
        return new BossShoes();
    }
}

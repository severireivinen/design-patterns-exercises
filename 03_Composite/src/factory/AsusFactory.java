package factory;

import model.asus.*;
import model.interfaces.*;

public class AsusFactory implements ComponentFactory {
    @Override
    public Component createRAM() {
        return new AsusRAM(99.99);
    }

    @Override
    public Component createMotherboard() {
        return new AsusMotherboard(149.99);
    }

    @Override
    public Component createCPU() {
        return new AsusCPU(249.99);
    }

    @Override
    public Component createNetworkCard() {
        return new AsusNetworkCard(29.99);
    }

    @Override
    public Component createGPU() {
        return new AsusGPU(639.99);
    }

    @Override
    public Component createCase() {
        return new AsusCase(99.99);
    }
}

package factory;

import model.interfaces.Component;
import model.msi.*;

public class MSIFactory implements ComponentFactory {

    @Override
    public Component createRAM() {
        return new MSIRAM(129.99);
    }

    @Override
    public Component createMotherboard() {
        return new MSIMotherboard(169.99);
    }

    @Override
    public Component createCPU() {
        return new MSICPU(399.99);
    }

    @Override
    public Component createNetworkCard() {
        return new MSINetworkCard(59.99);
    }

    @Override
    public Component createGPU() {
        return new MSIGPU(899.99);
    }

    @Override
    public Component createCase() {
        return new MSICase(129.99);
    }
}

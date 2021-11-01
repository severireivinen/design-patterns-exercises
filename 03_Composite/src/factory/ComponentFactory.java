package factory;

import model.interfaces.*;

public interface ComponentFactory {
    public abstract Component createRAM();

    public abstract Component createMotherboard();

    public abstract Component createCPU();

    public abstract Component createNetworkCard();

    public abstract Component createGPU();

    public abstract Component createCase();
}

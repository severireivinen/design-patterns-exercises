package factory.interfaces;

import model.interfaces.PersonIF;

public interface PersonFactoryIF {
    public abstract PersonIF createPerson(String name);
}

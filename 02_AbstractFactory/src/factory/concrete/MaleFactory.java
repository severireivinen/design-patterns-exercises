package factory.concrete;

import factory.interfaces.PersonFactoryIF;
import model.Person;
import model.interfaces.PersonIF;

public class MaleFactory implements PersonFactoryIF {
    @Override
    public PersonIF createPerson(String name) {
        return new Person(name);
    }
}

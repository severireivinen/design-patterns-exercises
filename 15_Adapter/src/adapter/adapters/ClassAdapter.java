package adapter.adapters;

import adapter.Socket;
import adapter.SocketAdapter;
import adapter.Volt;

public class ClassAdapter extends Socket implements SocketAdapter {


    @Override
    public Volt get3Volt() {
        return voltConverter(getVolt(), 8);
    }

    @Override
    public Volt get12Volt() {
        return voltConverter(getVolt(), 2);
    }

    @Override
    public Volt get24Volt() {
        return getVolt();
    }

    private Volt voltConverter(Volt volt, int i) {
        return new Volt(volt.getVolt() / i);
    }

}

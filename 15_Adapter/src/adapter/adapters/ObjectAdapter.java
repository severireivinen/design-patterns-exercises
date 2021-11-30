package adapter.adapters;

import adapter.Socket;
import adapter.SocketAdapter;
import adapter.Volt;

public class ObjectAdapter implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get3Volt() {
        return voltConverter(socket.getVolt(), 8);
    }

    @Override
    public Volt get12Volt() {
        return voltConverter(socket.getVolt(), 2);
    }

    @Override
    public Volt get24Volt() {
        return socket.getVolt();
    }

    private Volt voltConverter(Volt volt, int i) {
        return new Volt(volt.getVolt() / i);
    }
}

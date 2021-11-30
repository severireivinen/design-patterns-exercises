import adapter.SocketAdapter;
import adapter.Volt;
import adapter.adapters.ClassAdapter;
import adapter.adapters.ObjectAdapter;

public class Main {
    public static void main(String[] args) {
        SocketAdapter objectAdapter = new ObjectAdapter();
        SocketAdapter classAdapter = new ClassAdapter();


        System.out.println("Object Adapter");
        System.out.println(objectAdapter.get3Volt().getVolt());
        System.out.println(objectAdapter.get12Volt().getVolt());
        System.out.println(objectAdapter.get24Volt().getVolt());

        System.out.println("\nClass Adapter");
        System.out.println(classAdapter.get3Volt().getVolt());
        System.out.println(classAdapter.get12Volt().getVolt());
        System.out.println(classAdapter.get24Volt().getVolt());
    }
}

import proxy.Image;
import proxy.ProxyImage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProxyImage> imageList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            imageList.add(new ProxyImage("HiRes_10MB_Photo_" + i));
        }

        System.out.println("Contents of the image folder");
        for (Image i : imageList) {
            System.out.println(i.showData());
        }

        System.out.println("\nDisplay the contents");
        for (Image i : imageList) {
            i.displayImage();
        }
    }
}

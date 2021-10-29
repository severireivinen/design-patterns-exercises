
import abstracts.AterioivaOtus;
import people.KeittioTati;
import people.Opettaja;
import people.Oppilas;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus keittioTati = new KeittioTati();

        System.out.println("Opettaja:");
        opettaja.aterioi();
        System.out.println("\n");
        System.out.println("Oppilas:");
        oppilas.aterioi();
        System.out.println("\n");
        System.out.println("Keittiötäti:");
        keittioTati.aterioi();
    }
}

import Contoh.Turunan_1;
import Contoh.Turunan_2;

public class Main {

    public static void main(String[] args) {

        // membuat object dari kelas non-abstract
        Turunan_1 turunan1 = new Turunan_1("turunan 1");
        turunan1.display();

        Turunan_2 turunan2 = new Turunan_2("turunan 2");
        turunan2.display();
    }
}
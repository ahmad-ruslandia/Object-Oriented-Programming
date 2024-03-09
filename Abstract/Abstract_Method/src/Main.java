import contoh.Turunan_2;
import contoh.Turunan_3;
import contoh.Turunan_1;

public class Main {

    public static void main(String[] args) {

        // membuat object dari kelas non-abstract
        Turunan_1 turunan1 = new Turunan_1("turunan 1");
        turunan1.display();

        Turunan_2 turunan2 = new Turunan_2("turunan 2");
        turunan2.display();

        turunan1.levelUp();
        turunan2.levelUp();
        turunan1.display();
        turunan2.display();

        Turunan_3 turunan3 = new Turunan_3("turunan 3");
        turunan3.levelUp();
        turunan3.display();
    }
}
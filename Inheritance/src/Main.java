// inheritance adalah hubungan is-a
public class Main{
    public static void main(String[] args) {
        IntiTurunan it = new IntiTurunan();
        it.name = "Inti Turunan";
        it.display();

        Turunan1 t1 = new Turunan1();
        t1.name = "Turunan 1";
        t1.display();

        Turunan2 t2 = new Turunan2();
        t2.name = "Turunan 2";
        t2.display();
    }
}
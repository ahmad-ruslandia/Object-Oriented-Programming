public class konstruktor_overloading {
    /* membuat variabel */
    int angka; //tipe data int

    /* isi variabel */
    public konstruktor_overloading(){ //konstruktor default
        angka = 1;
    }

    /* isi variabel */
    public konstruktor_overloading(int a){
        angka = a; //variabel = a
    }

    public static void main (String[] args){
        /* objek i1 */
        konstruktor_overloading i1 = new konstruktor_overloading();
        System.out.println(i1.angka + " Konstruktor Default");

        /* objek i2*/
        konstruktor_overloading i2 = new konstruktor_overloading(2); //angka 2 merupakan parameter
        System.out.println(i2.angka + " Konstruktor Berparameter");
    }
}

/* masing-masing konstruktor memiliki objeknya */
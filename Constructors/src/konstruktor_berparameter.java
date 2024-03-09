public class konstruktor_berparameter {
    /* membuat variabel */
    int nilai;  //tipe data int

    /* isi variabel */
    public konstruktor_berparameter(int a){   //konstruktor berparameter
        nilai = a;  //variabel = a
    }

    public static void main (String[] args){
        /* objek = i */
        konstruktor_berparameter i = new konstruktor_berparameter(3); //angka 3 merupakan parameter

        System.out.print(i.nilai);
    }
}

/* perhatikan nama kelas untuk membuat objek */
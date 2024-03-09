public class konstruktor_default {
    /* membuat variabel */
    int nilai;  //tipe data int

    /* isi variabel */
    public konstruktor_default(){ //konstruktor default
        nilai = 3;  //variabel = 3
    }

    public static void main (String[] args){
        /* objek = i */
        konstruktor_default i = new konstruktor_default();

        System.out.print(i.nilai);
    }
}

/* perhatikan nama kelas untuk membuat objek */
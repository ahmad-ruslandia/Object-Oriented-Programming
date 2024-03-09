// this.name akan mengakses atribut name kalau ada di kelas ini.
// jika tidak ada maka akan mengkases atribut name dari superclass.

// super.name akan selalu mengakses atribut superclass
public class DataB extends Data {
    String name = "Class Data B";

    void display(){
        System.out.println("\nIni adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("method ini ada di subclass");
    }
}
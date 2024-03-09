import terminal.Console;

class Main{
    public static void main(String[] args) {
        KelasData obj1 = new KelasData("A");
        KelasData obj2 = new KelasData("B");
        KelasData obj3 = new KelasData("C");
        obj1.show();
        obj2.show();
        obj3.show();

        Console.log("\n Berhasil Menampilkan Data");
    }
}
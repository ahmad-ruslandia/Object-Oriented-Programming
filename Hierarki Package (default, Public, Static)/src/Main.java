// ini akan mengimport class console
import terminal.Console;

// mengimport static method dari console;
import static terminal.Console.log;

class Main{
    public static void main(String[] args) {
        Data obj = new Data("Data A");
        obj.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(obj.getDt());

        log("Menampilkan data dengan log saja");
        log(obj.getDt());
    }
}
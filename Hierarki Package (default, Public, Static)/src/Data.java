import terminal.Console;

// visibility default
class Data {
    private String dt;

    Data(String dt){
        this.dt = dt;
    }

    String getDt(){
        return this.dt;
    }

    void show(){
        // System.out.println("Player name : " + this.dt);
        Console.log("Menggunakan Console");
        Console.log("Menampilkan hasil : " + this.dt);
    }
}
package Contoh;

// abstract class
public abstract class Abstrak {
    private String data;

    public Abstrak(String data){
        this.data = data;
    }

    public void display(){
        System.out.println("ini merupakan " + this.data);
    }
}
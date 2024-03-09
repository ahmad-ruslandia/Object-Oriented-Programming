package contoh;

// abstract class
public abstract class Abstrak {
    private String data;
    private int level;

    public Abstrak(String data){
        this.data = data;
        this.level = 1;
    }

    public void display(){
        System.out.println("ini adalah "+this.data + " Level " + this.level);
    }

    // abstract method
    public abstract void levelUp();

    // setter
    public void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }
}
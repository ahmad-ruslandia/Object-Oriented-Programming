package contoh;

// inheritance dari abstract Abstrak
public class Turunan_1 extends Abstrak {

    public Turunan_1(String data){
        super(data);
    }

    public void levelUp(){
        this.setLevel(1);
    }
}
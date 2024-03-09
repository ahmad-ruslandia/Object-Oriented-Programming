package contoh;

// inheritance dari abstract Abstrak
public class Turunan_2 extends Abstrak {

    public Turunan_2(String data){
        super(data);
    }

    public void levelUp(){
        this.setLevel(1);
    }
}
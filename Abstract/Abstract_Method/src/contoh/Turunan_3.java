package contoh;

// inheritance dari abstract Abstrak
public class Turunan_3 extends Abstrak {

    public Turunan_3(String data){
        super(data);
    }

    public void levelUp(){
        this.setLevel(5);
    }
}
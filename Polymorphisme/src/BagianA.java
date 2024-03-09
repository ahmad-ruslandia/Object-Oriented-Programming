public class BagianA extends Keseluruhan {
    String type = "A";

    BagianA(String data){
        super(data);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
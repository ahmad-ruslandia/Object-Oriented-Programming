public class BagianD extends Keseluruhan {
    String type = "D";

    BagianD(String data){
        super(data);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
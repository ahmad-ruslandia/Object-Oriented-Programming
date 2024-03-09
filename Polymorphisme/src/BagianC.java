public class BagianC extends Keseluruhan {
    String type = "C";

    BagianC(String data){
        super(data);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
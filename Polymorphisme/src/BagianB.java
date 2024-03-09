public class BagianB extends Keseluruhan {
    String type = "B";

    BagianB(String data){
        super(data);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
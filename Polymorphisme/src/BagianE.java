public class BagianE extends Keseluruhan {
    String type = "E";

    BagianE(String data){
        super(data);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }

    void showoff(){
        System.out.println("Merupakan : " + this.data);
    }
}
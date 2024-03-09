public class DataC extends Data {
    float vdata;

    // overriding methods
    void display(){
        System.out.println("\nData C");
        System.out.println("Data Name    : " + this.dtname);
        System.out.println("Data Version : " + this.vdata);
    }
}
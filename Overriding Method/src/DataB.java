public class DataB extends Data {
    float vdata;

    // overriding methods
    void display(){
        System.out.println("\nData B");
        System.out.println("Data Name    : " + this.dtname);
        System.out.println("Data Version : " + this.vdata);
    }
}
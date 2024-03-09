public class Main{
    public static void main(String[] args) {
        Data obj1 = new Data();
        obj1.dtname = "A";
        // obj1 tidak memiliki vdata
        obj1.display();

        DataB obj2 = new DataB();
        obj2.dtname = "B-A";
        obj2.vdata = 1;
        obj2.display();

        DataC obj3 = new DataC();
        obj3.dtname = "C-A";
        obj3.vdata = 1;
        obj3.display();

        DataD obj4 = new DataD();
        obj4.dtname = "D-A";
        obj4.vdata =  (float) 3.2;
        obj4.display();
    }
}
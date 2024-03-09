// membuat class sebagai template
class ClsObj{
    String DataA;
    String DataB;
    String DataC;
}


public class Main {
    public static void main(String[] args) throws Exception {

        // instansiasi membuat object
        ClsObj obj1 = new ClsObj();
        obj1.DataA = "Data A1";
        obj1.DataB = "Data B1";
        obj1.DataC = "Data C1";

        System.out.println(obj1.DataA);
        System.out.println(obj1.DataB);
        System.out.println(obj1.DataC);

        System.out.println("\n\n");

        ClsObj obj2 = new ClsObj();
        obj2.DataA = "Data A2";
        obj2.DataB = "Data B2";
        obj2.DataC = "Data C2";

        System.out.println(obj2.DataA);
        System.out.println(obj2.DataB);
        System.out.println(obj2.DataC);

    }
}
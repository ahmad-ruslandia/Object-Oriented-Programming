class Display{
    static String type = "ABC - XYZ";
    private String data;

    Display(String data){
        this.data = data;
    }

    void setType(String typeInput){
        /* type = typeInput;      // alternatif 1 */
        /* this.type = typeInput; // alternatif 2 */
        Display.type = typeInput; // alternatif 3
    }

    void show(){
        System.out.println("Display Data : " + this.data);
    }
}


public class Main{
    public static void main(String[] args) {

        Display display1 = new Display("ABC");
        display1.show();

        Display display2 = new Display("XYZ");
        display2.show();

        // tampilkan static variable atau class variable
        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        // kita coba mengganti variable staticnya
         Display.type = "A-B-C";
        // display1.type = "A-B-C";
        // display2.type = "A-B-C";

        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        // kita coba mengganti variable staticnya
        display1.setType("X-Y-Z");
        // display2.setType("X-Y-Z");

        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

    }
}
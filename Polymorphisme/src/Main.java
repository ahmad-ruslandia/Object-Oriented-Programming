public class Main {
    public static void main(String[] args) {
        Keseluruhan S = new Keseluruhan("Bagian Keseluruhan");
        S.display();

        // Non-Polymorphic
        BagianA bA = new BagianA("Bagian A");
        bA.display();
        BagianB bB = new BagianB("Bagian B");
        bB.display();

        // Polymorphic
        Keseluruhan bC = new BagianC("Bagian C");
        bC.display();
        Keseluruhan bD = new BagianD("Bagian D");
        bD.display();

        BagianE bE = new BagianE("Bagian E");
        bE.display();
        bE.showoff();

        // Array list
        Keseluruhan[] BagianKeseluruhan = new Keseluruhan[6];
        BagianKeseluruhan[0] = S;
        BagianKeseluruhan[1] = bA;
        BagianKeseluruhan[2] = bB;
        BagianKeseluruhan[3] = bC;
        BagianKeseluruhan[4] = bD;
        BagianKeseluruhan[5] = bE;

        BagianKeseluruhan[0].display();
        BagianKeseluruhan[1].display();
        BagianKeseluruhan[2].display();
        BagianKeseluruhan[3].display();
        BagianKeseluruhan[4].display();
        BagianKeseluruhan[5].display();

        // method calls
        bE.showoff();
    }
}
class Main{
    public static void main(String[] args) {
        Data dt1 = new Data();
        DataA dt2 = new DataA();
        DataB dt3 = new DataB();
        DataC dt4 = new DataC();

        dt1.display();
        dt2.display();
        dt2.displaySuper();
        dt3.display();
        dt3.displaySuper();
        dt4.display();
        dt4.displaySuper();
    }
}
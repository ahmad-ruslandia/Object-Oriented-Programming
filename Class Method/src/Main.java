import java.util.ArrayList;

class Data{

    private static int DataNumber;
    private static ArrayList<String> DataList = new ArrayList<String>();

    private String dtname;

    Data(String dtname){
        this.dtname = dtname;
        Data.DataNumber++;
        Data.DataList.add(this.dtname);
    }

    // static method
    static void showDataNumber(){
        System.out.println("Data Number : " + Data.DataNumber);
    }

    static ArrayList<String> getDataName(){
        return Data.DataList;
    }

}

class Main{
    public static void main(String[] args) {
        Data Data1 = new Data("A");
        Data Data2 = new Data("B");
        Data Data3 = new Data("C");
        Data Data4 = new Data("D");
        Data Data5 = new Data("E");

        Data.showDataNumber();

        System.out.println("Data : " + Data.getDataName());

    }
}
class KelasData {

    private String data;

    KelasData(String data){
        this.data = data;
    }

    void setName(String data){
        this.data = data;
    }

    void show(){
        System.out.println("Data : " + this.data);
    }
}
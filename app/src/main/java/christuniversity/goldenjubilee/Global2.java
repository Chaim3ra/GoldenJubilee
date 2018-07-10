package christuniversity.goldenjubilee;

public class Global2{
    private static Global2 instance;

    // Global variable
    private String name;

    // Restrict the constructor from being instantiated
    private Global2(){}

    public void setData(String d){

        this.name=d;
    }
    public String getData(){

        return this.name;
    }

    public static synchronized Global2 getInstance(){
        if(instance==null){
            instance=new Global2();
        }
        return instance;
    }
}
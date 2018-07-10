package christuniversity.goldenjubilee;

public class Global{
    private static Global instance;

    // Global variable
    private String name;

    // Restrict the constructor from being instantiated
    private Global(){}

    public void setData(String d){

        this.name=d;
    }
    public String getData(){

        return this.name;
    }

    public static synchronized Global getInstance(){
        if(instance==null){
            instance=new Global();
        }
        return instance;
    }
}
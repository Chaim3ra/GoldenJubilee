package christuniversity.goldenjubilee;

public class Global{
    private static Globals instance;

    // Global variable
    private String name;

    // Restrict the constructor from being instantiated
    private Globals2(){}

    public void setData(String d){

        this.name=d;
    }
    public String getData(){

        return this.name;
    }

    public static synchronized Globals2 getInstance(){
        if(instance==null){
            instance=new Globals2();
        }
        return instance;
    }
}
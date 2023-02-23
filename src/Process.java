public class Process {
    private String name;
    private double size;
    private boolean flag;
    Process(){                           //  Default Constructor
        name ="NONE";
        size =0.00;
        flag = false;
    }
    Process(String Name,double s){       //  Parameterized Constructor
        this.name =Name;
        this.size =s;
        flag =false;
    }
    //  Setters
    public void setName(String name){
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void check() {
        flag =true;
    }
    //  Getters
    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
    public boolean isFlag() {
        return flag;
    }
}

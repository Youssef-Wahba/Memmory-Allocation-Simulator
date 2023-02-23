public class Partition {
    private String name;
    private double size;
    private Process p=null;
    private boolean Free=true;
    Partition()                           //  Default Constructor
    {
        name ="NONE";
        size =0.00;
    }
    Partition(String Name,double s)       //  Parameterized Constructor
    {
        this.name =Name;
        this.size =s;
    }
    //  Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setSize(double size)
    {
        this.size = size;
    }

    public void setP(Process p)
    {
        this.p = p;
    }
    public void Lock()
    {
        Free = false;
    }

    //  Getters
    public double getSize()
    {
        return size;
    }

    public String getName()
    {
        return name;
    }

    public Process getP()
    {
        return p;
    }

    public boolean isFree()
    {
        return Free;
    }
}

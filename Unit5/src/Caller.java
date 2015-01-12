
public class Caller {
    String name;
    int id;
    static int nextid = 0;
    
    public Caller(String nm)
    {
        name = nm;
        nextid++;
        id = nextid;
    }
    
    public String toString()
    {
        return "ID: " + id + "\tName: " + name;
    }
}

public class Patient {
    private String name;
    private int condition;
    
    public Patient(String nm, int cond){
        name = nm;
        condition = cond;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCondition(){
        return condition;
    }

    public boolean validate()
    {
        if (name == null || name == "")
            return false;
        else
            return true;
    }
    
}

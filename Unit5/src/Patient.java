public class Patient {
    private String name;
    private String condition;
    
    public Patient(String nm, String cond){
        name = nm;
        condition = cond;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCondition(){
        return condition;
    }

    public boolean validate()
    {
        if (name == null || name == "" || condition == null || condition == "")
            return false;
        else
            return true;
    }
    
    public boolean setName(String nm){
        if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
                }
    }
    
    public String toString()
    {
        return condition + " condition " + name + " ";
    }
}

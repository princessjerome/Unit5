public class Task {
    
    private String name;
    private String description;

    Task(String nm, String d) {
        name = nm;
        description = d;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean validate()
    {
        if (name == null || description == null || name.equals("") || description.equals(""))
            return false;
        else
            return true;
    }
    
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + description + '}';
    }    
}

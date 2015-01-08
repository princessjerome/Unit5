public class Task {
    
    private String name;
    private String description;
    
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
    
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + description + '}';
    }    
}

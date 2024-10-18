package model;

public class Project {

    private String id;
    private String name;
    private String description;
    private NStatus status;

    public Project (String id, String name, String description, NStatus status){

        this.id = id;
        this.name=name;
        this.description=description;
        this.status=status;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NStatus getStatus() {
        return status;
    }

    public void setStatus(NStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    
}

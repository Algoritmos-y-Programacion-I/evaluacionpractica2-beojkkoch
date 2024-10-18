package model;

public class Pillar {

    private String name;
    private Project[] projects;

    public Pillar(String name) {
        this.name = name;
        projects = new Project[50];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Project searchProject(String id){

        for(int l=0; l<projects.length; l++){

            if(projects[l].getId().equalsIgnoreCase(id)){
                return projects[l]; 
            }


        }
        return null;
    }

    /**
     * Descripcion: Añade un nuevo Project al arreglo projects
     * pre: El arreglo projects debe estar inicializado
     * pos: El arreglo projects queda modificado con el nuevo Project
     * agregado
     * 
     * @param newProject Project El Project que se va a añadir
     * @return boolean true si se logra añadir el Project, false en caso
     *         contrario
     */
    public boolean registerProject(Project newProject) {
        for(int i=0; i<projects.length; i++){
            if(projects[i]!=null){
                newProject = projects[i];
                return true;
            }
        }

        return false;
    }

    /**
     * Descripcion: Genera una cadena en formato lista con la información de los
     * Project registrados en el Pillar
     * pre: El arreglo projects debe estar inicializado
     * 
     */
    public String getProjectList() {
         
        String list = "";

        boolean  verify = false;
        for(int j=0; j<projects.length;j++){
            if(projects[j]!=null){
                list +="\n"+projects[j].getId()+ " - " +projects[j].getName()+ " - " +projects[j].getDescription()+ " - " +projects[j].getStatus();
                verify = true;
            }
        }
        if(!verify){
            list = "No hay proyectos registrados";
        }

        return list;
    }



    public Project[] getProjects() {
        return projects;
    }


    

}

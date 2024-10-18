package model;

public class Controller {

    private Pillar[] pillars;

    public Controller() {

        pillars = new Pillar[4];

    }

    public void pillarsType(){
        pillars[0] = new Pillar("Energia");
        pillars[1] = new Pillar("Tratamiento de Basuras");
        pillars[2] = new Pillar("Biodiversidad");
        pillars[3] = new Pillar("Agua");
    }


    /**public String verifyProjectInPillar(String id){

        for(Pillar pillar : pillars){
            for(Project project : pillar.getProjects()){
                if(project.getId().equals(id)){
                    return "next";
                }
        }
        
    }return null;
    
}


    /**
     * Descripcion: Permite crear y añadir un Project en un Pillar en el sistema
     * 
     * @return boolean true si se logra añadir el Prject en el Pillar, false en caso
     *         contrario
     */
    public boolean registerProjectInPillar(int pillarType, String id, String name, String description, int status) {



        NStatus st = NStatus.ACTIVO;
        switch(status){
            case 1:
            st = NStatus.ACTIVO;
            break;
            case 2:
            st = NStatus.INACTIVO;
            break;
        }
        Project newProject = new Project(id, name, description, st);
        boolean verify = pillars[pillarType-1].registerProject(newProject);
        if(verify){
            return true;
        }
        return false;
        
        
    }

    /**
     * Descripcion: Calcula el valor en dinero correspondiente al arrendamiento
     * mensual de todos los Edificios
     * pre: El arreglo edificios debe estar inicializado
     * 
     * @return String cadena en formato lista con la información de los
     * Project registrados en el Pillar
     */
    public String queryProjectsByPillar(int pillarType) {

        String query = "";

        for(int i=0; i<pillars.length; i++){
            if(pillars[i].equals(pillarType)){
                
                
            }


        }


        return query;

    }

}
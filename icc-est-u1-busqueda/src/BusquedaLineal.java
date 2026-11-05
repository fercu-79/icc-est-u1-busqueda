import java.util.List;

public class BusquedaLineal{
    
    private List<Persona> personas;
    
    public BusquedaLineal(List<Persona> personas){
        this.personas = personas;
    }
    
    // BUSQUE UNA PERSONA
    // RETORNE LA PERSONA SI LA ENCUENTRA
    // RETORNE NULL SI NO LA ENCUENTRA
    public Persona findByname(String nombre){

        for (int i = 0; i < personas.size(); i++){
            if (personas.get(i).getNombre().equals(nombre)){
                return personas.get(i);
            }
        }
        return null;
    }   

    //BUSQUE LA POS DE UNA PERSONA
    // RETORNE LAS POS PERSONA SI LO ENCUENTRA
    // RETORNE -1 SI NO LO ENCUENTRA
    public int findPosByName(String nombre){


        for (int i = 0; i < personas.size(); i++){
            if (personas.get(i).getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

}
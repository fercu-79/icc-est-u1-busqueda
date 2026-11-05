
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F")
        );

        // 1. BUSQUE UNA PERSONA con nombre Maria
        // RETORNE LA PERSONA SI  LO ENCONTRO
        // 2. BUSQUE UN APERSONA con nombre Diego
        // RETORNE LA PERSONA SI LO ENCONTRO
        // 3. BUSQUE UNA PERSONA con nombre Ana
        // Imprima laposicion de la persona si la encontro

        BusquedaLineal busqueda = new BusquedaLineal(personas);
        Busqueda findByName = new Busqueda();
        Persona personaEncontrada = busqueda.findByname("Maria");
        if (personaEncontrada != null) {
            System.out.println("Persona encontrada: " + personaEncontrada.getNombre() + ", Edad: " + personaEncontrada.getEdad() + ", Genero: " + personaEncontrada.getGenero());
        } else {
            System.out.println("Persona no encontrada");
        }
    
    }


}

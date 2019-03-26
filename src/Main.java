import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();

        personas = Arrays.asList( new Persona("Carlos", 35, 10000000),
                                new Persona("Juan", 17, 20000000),
                                new Persona("Maria", 21, 30000000),
                                new Persona("Susana", 27, 40000000));

        //personas.forEach(System.out::println);

        List<Persona> mayores = personas.stream()
                                .filter(persona -> persona.getEdad()>21)
                                .collect(Collectors.toList());

        //mayores.forEach(System.out::println);

        List<Persona> dnifilter = personas.stream()
                                .filter(persona -> persona.getEdad()>21)
                                .filter(persona -> persona.getDni()>20000000)
                                .collect(Collectors.toList());

        dnifilter.forEach(System.out::println);

    }
}

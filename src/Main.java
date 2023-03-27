import classes.Bootcamp;
import classes.Cursos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        curso1.setNome("Cloud");
        curso1.setDescrisao("Aprendendo cloud microssof");
        curso1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Oragle Java");
        bootcamp.setDescrisao("Aprendendo java em 90hs");

        System.out.println(curso1);
        System.out.println(bootcamp);
    }
}
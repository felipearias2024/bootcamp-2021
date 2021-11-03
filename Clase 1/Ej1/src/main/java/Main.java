import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        ArrayList alumnos = new ArrayList<Alumno>();
        int na1[] = new int[3];
        int na2[] = new int[3];
        int na3[] = new int[3];
        int na4[] = new int[3];
        for(int i=0; i<3; i++){
            na1[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
            na2[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
            na3[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
            na4[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
        }
        Alumno alumno1 = new Alumno("Felipe", "Arias", 21, na1);
        Alumno alumno2 = new Alumno("Joaquin", "Gomez", 21, na2);
        Alumno alumno3 = new Alumno("Magdalena", "Casale", 21, na3);
        Alumno alumno4 = new Alumno("Gelipe", "Arias", 21, na1);
        Curso curso1 = new Curso("curso1", 4, alumnos);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);

        System.out.println("1- Promedio:");
        System.out.println(curso1.promedioDePromedios());
        System.out.println("2- Datos del curso:");
        System.out.println(curso1.toString());
        System.out.println("3- Listado promedios mayores a 6:");
        System.out.println(curso1.listadoMayores6());
        System.out.println("4- Listado ordenado:");
        curso1.ordenarAlumnos();
        System.out.println(curso1.toString());
        JSONObject rtas = new JSONObject();
        rtas.put("Promedio", curso1.promedioDePromedios());
        rtas.put("Datos Curso", curso1.toString());
        rtas.put("Listado mayores a 6", curso1.listadoMayores6());
        curso1.ordenarAlumnos();
        rtas.put("Listado ordenado", curso1.toString());
        System.out.println("JSON:");
        System.out.println(rtas.toString(0));
    }
}

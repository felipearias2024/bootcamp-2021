import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Curso {
    private String nombre;
    private int ctdad_horas;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre, int ctdad_horas, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.ctdad_horas = ctdad_horas;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCtdad_horas() {
        return ctdad_horas;
    }

    public void setCtdad_horas(int ctdad_horas) {
        this.ctdad_horas = ctdad_horas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno a) {
        this.alumnos.add(a);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", ctdad_horas=" + ctdad_horas +
                ", alumnos=" + alumnos +
                '}';
    }

    public float promedioDePromedios() {
        int acu = 0;
        for (Alumno alumno : alumnos) {
            acu += alumno.calcularPromedio();
        }
        return (float) acu / this.alumnos.size();
    }

    public ArrayList<Alumno> listadoMayores6() {
        ArrayList promedios = new ArrayList<Alumno>();
        for (Alumno alumno : alumnos) {
            if (alumno.calcularPromedio() >= 6) {
                promedios.add(alumno);
            }
        }
        return alumnos;
    }

    public void ordenarAlumnos() {
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.size(); j++) {
                Collections.sort(alumnos, new Comparator() {
                    public int compare(Object o1, Object o2) {
                        Alumno p1 = (Alumno) o1;
                        Alumno p2 = (Alumno) o2;
                        int res = p1.getApellido().compareToIgnoreCase(p2.getApellido());
                        if (res != 0)
                            return res;
                        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
                    }
                });
            }

        }
    }
}

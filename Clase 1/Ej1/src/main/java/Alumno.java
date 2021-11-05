import java.util.Arrays;


public class Alumno{
    private String nombre;
    private String apellido;
    private int edad;
    private int notas[];

    public Alumno(String nombre, String apellido, int edad, int[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public float calcularPromedio(){
        int acu = 0;
        for(int i=0; i<this.notas.length; i++){
           acu += this.notas[i];
        }
        return (float)acu/this.notas.length;
    }
}

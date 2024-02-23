package Eventos_Deportivos;

public class Participante {
    //Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //metodos


    @Override
    public String toString() {
        return super.toString();
    }


    //constructores
    public Participante ( String dni, String nombre, String apellidos, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    //Getter y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

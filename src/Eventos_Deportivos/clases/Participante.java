package Eventos_Deportivos.clases;

public class Participante {
    //Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //metodos


    @Override
    public String toString() {
        return "Dni "+this.dni+" Nombre: "+this.nombre+" Apellidos: "+this.apellidos+" Edad: "+this.edad;
    }

    @Override
    public boolean equals(Object part) {
        if(part instanceof Participante participante) {
            return this.dni.equalsIgnoreCase(participante.dni);
        } else {
            return false;
        }

    }

    //constructores
    public Participante ( String dni, String nombre, String apellidos, int edad){
        setDni(dni);
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

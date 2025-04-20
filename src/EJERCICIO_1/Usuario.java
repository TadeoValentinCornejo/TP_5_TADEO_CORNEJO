package EJERCICIO_1;

public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id, String email, String nombre) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package EJERCICIO_1;

import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnico;


    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.fechaCreacion = LocalDate.now();
        this.estado = "Abierto";
        this.descripcion = descripcion;
    }

    public TicketSoporte(int id, Usuario usuario, String descripcion) {
        this.id = id;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public void cerrarTicket(){
        this.estado = "Cerrado";
    }

    public void mostrarTicket(){
        System.out.println("id: " + this.id+"\nfechaCreacion: " + this.fechaCreacion+"\nestado: " + this.estado+"\ndescripcion: " + this.descripcion+"\nusuario: " + this.usuario+"\ntecnico: " + this.tecnico);
    }

    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", usuario=" + usuario +
                ", tecnico='" + tecnico + '\'' +
                '}';
    }
}

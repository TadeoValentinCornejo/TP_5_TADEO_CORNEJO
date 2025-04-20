package EJERCICIO_1;

public class EJERCICIO_1_principal {
    public static void main(String[] args) {

        Usuario user = new Usuario(1, "jose@gmail.com", "jose");
        TicketSoporte ts = new TicketSoporte(1,"No puedo ingresar dinero a mi cuenta bancaria");
        TicketSoporte ts2 = new TicketSoporte(4,user,"Ocurre un error al retirar dinero de mi cuenta" );


        ts.cerrarTicket();

        ts.mostrarTicket();

        ts2.mostrarTicket();
        ts2.cerrarTicket();
        ts2.mostrarTicket();


    }
}

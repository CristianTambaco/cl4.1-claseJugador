public class llamarClase {

    public static void main(String[]args){

        jugador jugador1 = new jugador("Rick",34,"Chile");
        jugador jugador2 = new jugador("Brayan",21,"Uruguay");

        jugador1.correr();
        jugador1.patear(7);

        jugador2.correr();
        jugador2.patear(4);
        jugador2.saltar();

    }

}

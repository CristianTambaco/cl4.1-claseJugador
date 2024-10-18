public class jugador {

    //atributos
    String nombre;
    int edad;
    String pais;


    //metodo constructor
    public jugador(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;

    }


    // metodos vacíos,(imprimir)
    public void patear(int p) {
        int pateos;
        pateos = 2;
        pateos = pateos + p;
        System.out.println("El jugador " + nombre +
                ", de edad " + edad +
                " pais " + pais +
                " patea la pelota");
        System.out.println("El jugador ha tenido " + pateos + " p(pateos)");


    }

    public void correr() {
        System.out.println("El jugador " + nombre +
                ", de edad " + edad +
                " pais " + pais +
                " corre hacia el arco");


    }

    public void saltar() {
        System.out.println("El jugador " + nombre +
                ", de edad " + edad +
                " pais " + pais +
                " salta");

    }

}






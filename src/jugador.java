public class jugador {

    //atributos
    String nombre;
    int edad;
    String pais;





    //metodo constructor
    public  jugador (String nombre,int edad, String pais){
        this.nombre = "Pablo";
        this.edad = 20;
        this.pais = "Mexico";

    }




// metodo vacío,(imprimir)
    public void patear() {
        System.out.println("El jugador "+ nombre +
                            ", de edad "+ edad +
                            " pais "+ pais +
                            " patea la pelota");


    }

    public void correr() {
        System.out.println("El jugador "+ nombre +
                ", de edad "+ edad +
                " pais "+ pais +
                " corre hacia el arco");


    }

    public void saltar() {
        System.out.println("El jugador "+ nombre +
                ", de edad "+ edad +
                " pais "+ pais +
                " salta");


    }





}
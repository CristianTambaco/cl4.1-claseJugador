public class jugador {

    //atributos
    String nombre;
    int edad;
    String pais;
    int saltos=0;





    //metodo constructor
    public  jugador (String nombre,int edad, String pais){
        this.nombre = "Pablo";
        this.edad = 20;
        this.pais = "Mexico";

    }




// metodo vacío,(imprimir)
    public void patear(int p) {
        int pp;
        pp = 2;
        pp = pp+p;
        System.out.println("El jugador "+ nombre +
                            ", de edad "+ edad +
                            " pais "+ pais +
                            " patea la pelota");
        System.out.println("El jugador ha tenido " + pp   );


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
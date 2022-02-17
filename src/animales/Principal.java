package animales;

public class Principal {
    public static void main(String[] args) {
        // 1)	Instancia un objeto rana de la clase Animal, un objeto ballena de la clase Mamifero
        // y un objeto perro de la clase MamiferoTerrestre, un objeto avestruz y otro paloma de clase Ave.
        Animal rana = new Animal("rana", "anfibio",50, 11);
        Mamifero ballena = new Mamifero("ballena", "cetaceo", 4000, 140, 2, 3);
        MamiferoTerrestre perro = new MamiferoTerrestre("Perro", "canino", 80, 30, 4, 1, 4);
        Ave avestruz = new Ave("avestruz", "camelius", 19, 130, 2, false);
        Ave paloma = new Ave("paloma", "columbidae",2, 15, 3, true);


        // 2)	Visualiza los datos de los objetos.


        System.out.println("ANTES DE LOS CAMBIOS...");

        System.out.println(rana);
        System.out.println(ballena);
        System.out.println(perro);
        System.out.println(avestruz);
        System.out.println(paloma);

        // 3)	Cambia el peso de la rana, dándole un nuevo valor.

        rana.setPeso(30);

        // 4)	Cambia el peso de la ballena, dándole un nuevo valor.

        ballena.setPeso(10000);

        // 5)	Cambia el atributo numeroHuevos de la paloma, dándole un nuevo valor.

        paloma.setNumeroHuevos(5);

        // 6)	Cambia el tamaño del perro, incrementándolo en un 10%.

        perro.crecimiento(50);

        // 7)	Cambia los meses de embarazo de la ballena.

        ballena.setMesesEmbarazo(6);

        // 8)	¿Se puede cambiar los meses de embarazo de la rana? Razona la respuesta.
        // No, porque la rana perteneces a la clase Animal, y para establecer los meses de embarazo
        // lo realizamos desde la clase Mamifero ... un animal no siempre es un mamifero

        // 9)	Visualiza de nuevo los objetos.

        System.out.println("DESPUES DE LOS CAMBIOS...");

        System.out.println(rana);
        System.out.println(ballena);
        System.out.println(perro);
        System.out.println(avestruz);
        System.out.println(paloma);


    }
}

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        // numero alatorio entre 1 y 99
        double random = Math.random();
        random *= 100;
        random = Math.floor(random);
        System.out.println("random = " + random);

        /// color aleatorio
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        Random rand = new Random();

        int indiceAleatorio = rand.nextInt(colores.length);

        String colorAleatorio = colores[indiceAleatorio];

        System.out.println("Color aleatorio = " + colorAleatorio);
    }
}

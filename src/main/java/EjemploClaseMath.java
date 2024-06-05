public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double pi = Math.PI;
        System.out.println("pi = " + pi);
        
        // e elevado a ...
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        
        // logaritmo
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        //potencia
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        // raiz cuadrada
        double raiz = Math.sqrt(9);
        System.out.println("raiz = " + raiz);

        double grados =  Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir a grados = " + grados);

        double radianes = Math.toRadians(90);
        System.out.println("convertir de grados a radianes = " + radianes);

        // sin() y cos() rebiben radianes de entrada
        System.out.println("sin(90) = " + Math.sin(radianes));

        System.out.println("cos(90) = " + Math.cos(radianes));

    }
}

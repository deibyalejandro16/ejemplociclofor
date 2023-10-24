public class ejemploarreglo {
    public static void main(String[] args) {
        // inicializar el arreglo
        int[] numeros = {1, 2, 3, 4, 5,};

        //usar el ciclo for para recorrer el arreglo
        for (int i = 0; i < numeros.length; i++) {
            //acceder al elemento en la posicion i del arreglo
            System.out.println("elemento en la posicion" + i + ":" + numeros[i]);
        }

    }
}
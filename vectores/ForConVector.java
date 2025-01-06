package vectores;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class ForConVector {

    public static void main(String[] args) {
        char[] characters = crearVector();

        imprimirVector(characters);
        System.out.println();
    }

    public static char[] crearVector() {
        char[] s;

        s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('A' + i);
        }

        return s;
    }

    public static void imprimirVector(char[] vector) {
        int i = 0;
        System.out.print('<');
        for (char elemento : vector) {
            // imprimir un elemento
            System.out.print(elemento);
            // imprimir una coma para separar si no es el último elemento
            if ((i + 1) < vector.length) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.print('>');
    }
}

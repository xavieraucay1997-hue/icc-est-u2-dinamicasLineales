import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        runLinkList();
        runQueue();
        runArrayDequeQueue();
        runStack();
        System.out.println();

        System.out.println(" EJERCICIO 1 ");

        Ejercicio1 ejercicio1 = new Ejercicio1();

        String texto = "COMPUTACION";
        String textoInvertido = ejercicio1.invertString(texto);

        System.out.println(textoInvertido);

        System.out.println();

        System.out.println(" EJERCICIO 2 ");

        Ejercicio2 ejercicio2 = new Ejercicio2();

        System.out.println(ejercicio2.esPalindromo("radar"));
        System.out.println(ejercicio2.esPalindromo("computacion"));
    }

    private static void runLinkList() {
        System.out.println();

        System.out.println(" LINKEDLIST ");

        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");

        System.out.println("Primero: " + nombres.get(0));
        System.out.println("Ultimo: " + nombres.get(nombres.size() - 1));

        System.out.println("Elemento indice 2: " + nombres.get(2));

        System.out.println("Eliminado: " + nombres.pop());

        System.out.println("Tamaño actual: " + nombres.size());
    }

    private static void runQueue() {
        System.out.println();

        System.out.println(" QUEUE ");

        Queue<String> cola = new LinkedList<>();

        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println("Primero: " + cola.peek());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendiendo -> " + cliente);
        }
    }
    private static void runArrayDequeQueue() {

        System.out.println();

        System.out.println(" ARRAYDEQUE COMO COLA ");

        ArrayDeque<String> cola = new ArrayDeque<>();

        cola.offer("Carlos");
        cola.offer("Luis");
        cola.offer("Sofia");

        System.out.println("Primero: " + cola.peek());

        while (!cola.isEmpty()) {
            System.out.println("Atendiendo -> " + cola.poll());
        }
    }

    private static void runStack() {
        System.out.println();
        System.out.println("ARRAYDEQUE COMO PILA ");

        ArrayDeque<String> pila = new ArrayDeque<>();

        pila.push("Jose");
        pila.push("Andres");
        pila.push("Ana");
        pila.push("Maria");

        System.out.println("Cima: " + pila.peek());

        while (!pila.isEmpty()) {
            System.out.println("Sale -> " + pila.pop());
        }
    }
}
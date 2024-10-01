public class Exercicio2 {

//    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
//    anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
//    escreva um programa na linguagem que desejar onde, informado um número,
//    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número
//    informado pertence ou não a sequência.

    public static boolean fibonacci(int numero) {
        if (numero == 0 || numero == 1) return true;

        int a = 0, b = 1;
        int aux = a + b;

        while (aux <= numero) {
            if (aux == numero) return true;
            a = b;
            b = aux;
            aux = a + b;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}

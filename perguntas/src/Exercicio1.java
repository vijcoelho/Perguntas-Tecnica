public class Exercicio1 {

//    1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
//    Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
//    Imprimir(SOMA);
//    Ao final do processamento, qual será o valor da variável SOMA?

    public static void exc1() {
        int indice = 13, soma = 0, k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
            System.out.println(soma);
        }
    }

    public static void main(String[] args) {
        exc1();
        //RESPOSTA 91;
    }
}

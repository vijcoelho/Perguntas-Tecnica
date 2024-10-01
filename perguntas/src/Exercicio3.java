public class Exercicio3 {

//    3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//            • O menor valor de faturamento ocorrido em um dia do mês;
//            • O maior valor de faturamento ocorrido em um dia do mês;
//            • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

    public static int menor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor)
                menor = vetor[i];
        }
        return menor;
    }

    public static int maior(int[] vetor) {
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior)
                maior = vetor[i];
        }
        return maior;
    }

    public static double media(int[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }

    public static int diasAcimaMedia(int[] vetor) {
        double media = media(vetor);
        int contagem = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media)
                contagem++;
        }
        return contagem;
    }

    public static void main(String[] args) {
        int[] vetor_teste = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        System.out.println(menor(vetor_teste));
        System.out.println(maior(vetor_teste));
        System.out.println(media(vetor_teste));
        System.out.println(diasAcimaMedia(vetor_teste));
    }
}

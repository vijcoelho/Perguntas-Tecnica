public class Excercicio5 {

    //5) Escreva um programa que inverta os caracteres de um string.
    public static String inverterString(String str) {
        StringBuilder inverter = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            inverter.append(str.charAt(i));
        }
        return inverter.toString();
    }

    public static void main(String[] args) {
        System.out.println(inverterString("Hello, World!"));
    }
}

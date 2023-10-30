
public class Main {
    public static void main(String[] args) {
        String test = "Мне попалась очень сложная задача!";
        char[] testSymbols = test.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < testSymbols.length; i++) {
            if (i < testSymbols.length / 2) {
                sb1.append(testSymbols[i]);
            } else {
                sb2.append(testSymbols[i]);
            }
        }
        System.out.println("Первая половина: " + sb1.toString());
        System.out.println("Первая половина: " + sb2.toString());
    }

}
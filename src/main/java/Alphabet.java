import java.util.Random;

public class Alphabet {
    public static void main(String[] args) {

    }
    public static String generateCode() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        char code = 'A';
        for (int i = 0; i < 10; i++) {
            code = alphabet.charAt(random.nextInt(51));
            System.out.print(Character.toString(code) + ", ");
        }
        return Character.toString(code);
    }
}

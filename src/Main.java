import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        System.out.println("Input number of string");
        int number;
        String palindrom = "";

        try {
            number = scanner.nextInt();
            if (number>strs.length){
                System.out.println("The number must be less than or equal to the number of words in a string");
            }
            for (int i = 0; i < strs[number].length(); i++) {
                palindrom = palindrom + strs[number].charAt(i);
            }
            if (palindrom.equals(strs[number])) {
                System.out.println(strs[number] + " is palindrom");
            } else {
                System.out.println(strs[number] + " isn't palindrom");
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("There aren't that many words in a string");
        }
    }
}

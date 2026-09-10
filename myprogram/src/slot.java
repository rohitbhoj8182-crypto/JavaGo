import java.util.Random;
import java.util.Scanner;

public class slot {

    static String[] symbols = {"🍒", "🍋", "🍊", "🍉", "⭐", "💎"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎰 SLOT MACHINE 🎰");
        System.out.println("Enter your bet: ₹");

        int bet = sc.nextInt();

        String[] result = new String[3];

        // Spin
        for (int i = 0; i < result.length; i++) {
            result[i] = symbols[random.nextInt(symbols.length)];
        }

        System.out.println("\nSpinning... 🎰");
        System.out.println("[" + result[0] + "] [" + result[1] + "] [" + result[2] + "]");

        // Payout
        if (result[0].equals(result[1]) && result[1].equals(result[2])) {

            int payout = bet * 10;

            System.out.println("🎉 JACKPOT! 🎉");
            System.out.println("You won ₹" + payout);

        } else if (result[0].equals(result[1])
                || result[1].equals(result[2])
                || result[0].equals(result[2])) {

            int payout = bet * 2;

            System.out.println("✨ TWO MATCH! ✨");
            System.out.println("You won ₹" + payout);

        } else {

            System.out.println("😢 No match!");
            System.out.println("You lost ₹" + bet);
        }

        sc.close();
    }
}
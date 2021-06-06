package base;

import java.util.Scanner;

public class TaxCalculator {
    static Scanner in = new Scanner(System.in);
    final double taxWI = .055;
    public static void main(String[] args) {
        TaxCalculator myApp = new TaxCalculator();
        myApp.output();
    }

    private double amtPrompt() {
        System.out.print("What is the order amount? ");
        return Double.parseDouble(in.nextLine());
    }

    private String statePrompt() {
        System.out.print("What is the state? ");
        return in.nextLine();
    }

    private double[] calculations(double amt) {
        double tax = amt * taxWI;
        double total = amt + tax;
        return new double[]{amt, tax, total};
    }

    private void output() {
        double amt = amtPrompt();
        String state = statePrompt();
        double[] nums = calculations(amt);
        String str = "The total is $%.2f";
        if(state.equals("WI")) {
            str = "The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.";
        }
        System.out.printf(str, amt, nums[1], nums[2]);
    }
}



package BalanceParaentheses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the expession");

        Scanner in = new Scanner(System.in);
        String expession = in.nextLine();
        BalanceParentheses he = new BalanceParentheses();

        he.balanceParentheses(expession);
    }
}

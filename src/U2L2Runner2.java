import java.util.Scanner;

public class U2L2Runner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need for the home you are building?");
        int numOfPiecesOfLumber = s.nextInt();
        System.out.println("How many windows do you need?");
        int numOfWindows = s.nextInt();
        System.out.println("What is the tax rate for your area?");
        double taxRate = s.nextDouble();

        ConstructionPricer prices = new ConstructionPricer(11.5, 25.75, taxRate);
        double cost = prices.materialsCost(numOfPiecesOfLumber, numOfWindows);
        cost = Math.round(cost * 100);
        cost = (cost/100);
        double total = prices.totalWithTax(cost);

        System.out.println("Total Materials Cost: $" + cost);
        System.out.println("Grand Total After Tax: $" + total);

    }

}




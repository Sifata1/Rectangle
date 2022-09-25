import java.util.Scanner;
public class U2L2Runner2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need for the home you are building?");
        int numOfPiecesOfLumber = s.nextInt();
        System.out.println("How many windows do you need?");
        int numOfWindows = s.nextInt();
        System.out.println("What is the tax rate for your area?");
        double taxRate = s.nextDouble();

        double costOfLumber = 11.5;
        double costOfWindow = 25.75;
        ConstructionPricer costMats = new ConstructionPricer(11.5, 25.75);

        System.out.println("Total Materials Cost: " + costMats);



    }
}

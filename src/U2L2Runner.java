public class U2L2Runner {
   public static void main(String[] args)
   {
      Rectangle backyard1 = new Rectangle(150, 200); // These are the set lengths of the plots.
      Rectangle backyard2 = new Rectangle(100);
      Rectangle backyard3 = new Rectangle();

      backyard1.setWidth(125);
      backyard2.setWidth(125);
      backyard2.setLength(125);
      backyard3.setWidth(125);

      int perimeter = (backyard1.calculatePerimeter()) + (backyard2.calculatePerimeter()) + (backyard3.calculatePerimeter());
      System.out.println("The total area that will need seeding is " + perimeter);

      int area = (backyard1.calculateArea()) + (backyard2.calculateArea()) + (backyard3.calculateArea());
      System.out.println("The total area that will need seeding is " + area);

   }



   }


public class U2L2Runner {
   public static void main(String[] args) {
      Rectangle backyard1 = new Rectangle(150, 200); // These are the set lengths of the plots.
      Rectangle backyard2 = new Rectangle(100);
      Rectangle backyard3 = new Rectangle();

      backyard1.setWidth(125);
      backyard2.setWidth(125);
      backyard2.setLength(125);
      backyard3.setWidth(125);

      int backyard1Perimeter = ((backyard1.getLength() + backyard1.getWidth())*2); // This calculates the perimeters of each of the plots.
      int backyard2Perimeter = ((backyard2.getLength() + backyard2.getWidth())*2);
      int backyard3Perimeter = ((backyard3.getLength() + backyard3.getWidth())*2);

      int perimeter = (backyard1Perimeter) + (backyard2Perimeter) + (backyard3Perimeter); // This calculates the areas of the plots.
      System.out.println("The total length of fencing that will be needed is " + perimeter);

      int area = (backyard1.calculateArea()) + (backyard2.calculateArea()) + (backyard3.calculateArea());
      System.out.println("The total area that will need seeding is " + area);
      
   }

}
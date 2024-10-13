import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //problem1();
    problem2();
  }

  private static void problem1() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the raidus of the circle: ");
    double input = sc.nextDouble();

    Circle circ = new Circle(input);

    //System.out.println("A circle with a radius of " + input + " has a circumerence of " circ.getCircumference() + " and an area of " + circ.getArea());

    System.out.println("A A circle with a radius of" + input + " has a circumference of " + circ.getCircumference() + " and an area of " + circ.getArea());

  }

  private static void problem2() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number of sides: ");
    int input1 = sc.nextInt();

    System.out.println("Enter the side length: ");
    double input2 = sc.nextDouble();

    RegularPolygon shape = new RegularPolygon(input1, input2);

    System.out.println("Area with " + shape.getNumSides() + " sides: " + shape.getArea());
    
    shape.addSides(2);
    System.out.println("Area with " + shape.getNumSides() + " sides: " + shape.getArea());
  }
}

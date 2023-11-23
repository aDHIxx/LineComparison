import java.util.Scanner;

public class lineComp {
    private double x1, y1, x2, y2;
    public lineComp(double x1, double y1, double x2, double y2) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    /**
     * @name: equals
     * @return/ o/p: true if the lines are equal, false otherwise
     */

    public boolean equals(lineComp other) {
        return this.x1 == other.x1 && this.y1 == other.y1 && this.x2 == other.x2 && this.y2 == other.y2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Line 1: x1  y1: ");
        double x1Line1 = scanner.nextDouble();
        double y1Line1 = scanner.nextDouble();

        System.out.print("Line 1: x2  y2: ");
        double x2Line1 = scanner.nextDouble();
        double y2Line1 = scanner.nextDouble();

        lineComp line1 = new lineComp(x1Line1, y1Line1, x2Line1, y2Line1);

        System.out.print("Line 2: x1  y1: ");
        double x1Line2 = scanner.nextDouble();
        double y1Line2 = scanner.nextDouble();

        System.out.print("Line 2: x2  y2: ");
        double x2Line2 = scanner.nextDouble();
        double y2Line2 = scanner.nextDouble();

        lineComp line2 = new lineComp(x1Line2, y1Line2, x2Line2, y2Line2);

        if (line1.equals(line2)) {
            System.out.println("Lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }

        scanner.close();
    }
}

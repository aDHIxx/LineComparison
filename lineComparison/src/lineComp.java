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
     * @name: calculateLength
     * @return/ o/p: Length of the line.
     */
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * @name: compareTo
     * @i/p: other - the other line
     * @return/ o/p: 0 if  equal, +ve no if line1 is greater, -ve no if line2 is greater.
     */

    public int compareTo(lineComp line2) {
        double thisLength = calculateLength();
        double line2Length = line2.calculateLength();
        return Double.compare(thisLength, line2Length);
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

        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("Lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater");
        } else {
            System.out.println("Line 2 is greater");
        }

        scanner.close();
    }
}

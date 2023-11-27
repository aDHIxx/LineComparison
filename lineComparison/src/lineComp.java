import java.util.Scanner;

/*
 * @name: Point
 * @i/p: x and y coordinates
 * @return/ o/p: Point object with x and y coordinates
 */
class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters for x and y

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Override equals method for Point
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }
}
/*
 * @name: Line
 * @i/p: startPoint and endPoint
 * @return/ o/p: Line object with startPoint and endPoint
 */
class Line {
    private Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Getter methods for startPoint and endPoint

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    // Method to calculate the length of the line
    public double calculateLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }

    // Override equals method for Line
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return startPoint.equals(line.startPoint) && endPoint.equals(line.endPoint);
    }
    /*
     * @name: compareTo
     * @i/p: otherLine - the other line
     * @return/ o/p: 0 if  equal, +ve no if line1 is greater, -ve no if line2 is greater.
     */
    public int compareTo(Line otherLine) {
        double thisLength = calculateLength();
        double otherLineLength = otherLine.calculateLength();
        return Double.compare(thisLength, otherLineLength);
    }
}
public class lineComp {
    private double x1, y1, x2, y2;
    public lineComp(double x1, double y1, double x2, double y2) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    /*
     * @name: calculateLength
     * @return/ o/p: Length of the line.
     */
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /*
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

        Point startPoint1 = readPoint(scanner, "Line 1: Starting point (x y): ");
        Point endPoint1 = readPoint(scanner, "Line 1: Ending point (x y): ");
        Line line1 = new Line(startPoint1, endPoint1);

        Point startPoint2 = readPoint(scanner, "Line 2: Starting point (x y): ");
        Point endPoint2 = readPoint(scanner, "Line 2: Ending point (x y): ");
        Line line2 = new Line(startPoint2, endPoint2);

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

    /*
     * @name: readPoint
     * @i/p: scanner - Scanner object to read input from console
     * prompt - prompt to be displayed to user
     * @return/ o/p: Point object with x and y coordinates
     */
    private static Point readPoint(Scanner scanner, String prompt) {
        System.out.print(prompt);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        return new Point(x, y);
    }
}

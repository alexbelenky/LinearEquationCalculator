public class LinearEquation {
    private int Coord1X;
    private int Coord1Y;
    private int Coord2X;
    private int Coord2Y;
    private double m;
    private double b;

    public LinearEquation(int cord11int, int cord12int, int cord21int, int cord22int) {
        this.Coord1X = cord11int;
        this.Coord1Y = cord12int;
        this.Coord2X = cord21int;
        this.Coord2Y = cord22int;
        m = ((double) (Coord2Y - Coord1Y) /  (Coord2X - Coord1X));
        b = (Coord1Y - (m * Coord1X));
    }

    public void lineInfo() {
        System.out.println("\nThe two points are: (" + Coord1X + ", " + Coord1Y + ") and (" + Coord2X + ", " + Coord2Y + ")");
        System.out.println("The equation of the line between these points is: " + returnFormula());
        System.out.println("The slope of this line is: " + m);
        System.out.println("The y-intercept of the line is: " + b);
        System.out.println("The distance between the two points is: " + distanceBetweenPoints());
        double pairWithX = Double.parseDouble(LinearEquationLogic.askQuestion("\nEnter a value for x: "));
        System.out.println("\nThe point on the line is " + returnCoordWithX(pairWithX));
    }

    public String returnFormula() {
        if (b != 0) {
            return "y = " + m + "x" + " + " + b;
        }
        return "y = " + m + "x";
    }

    public double distanceBetweenPoints() {
        return (double) Math.round(((Math.sqrt(Math.pow((Coord2X - Coord1X), 2) + Math.pow((Coord2Y - Coord1Y), 2))) * 100)) / 100;
    }

    public String returnCoordWithX(double x) {
        double y = (m * x) + b;
        return "(" + x + ", " + y + ")";
    }
}

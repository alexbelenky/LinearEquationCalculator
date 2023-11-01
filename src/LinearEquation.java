public class LinearEquation {
    private int Coord1X;
    private int Coord1Y;
    private int Coord2X;
    private int Coord2Y;
    private String slope;
    private double m;
    private double b;

    public LinearEquation(int cord11int, int cord12int, int cord21int, int cord22int) {
        this.Coord1X = cord11int;
        this.Coord1Y = cord12int;
        this.Coord2X = cord21int;
        this.Coord2Y = cord22int;
        slope();
        yIntercept();
    }

    public void lineInfo() {
        if (Coord1Y == Coord2Y) {
            System.out.println("The equation of the line between these points is: " + equation());
            System.out.println("The slope of this line is: " + m);
            System.out.println("The y-intercept of the line is: " + b);
            System.out.println("The distance between the two points is: " + distance());
        } else if (Coord1X == Coord2X) {
            System.out.println("\nThe points are on horizontal line. x = " + Coord1X);
        } else {
            System.out.println("\nThe two points are: (" + Coord1X + ", " + Coord1Y + ") and (" + Coord2X + ", " + Coord2Y + ")");
            System.out.println("The equation of the line between these points is: " + equation());
            System.out.println("The slope of this line is: " + m);
            System.out.println("The y-intercept of the line is: " + b);
            System.out.println("The distance between the two points is: " + distance());
        }
    }

    public String equation() {
        if (Coord1Y == Coord2Y) {
            return "y = " + b;
        } else {
            if (Math.abs(slope()) == 1 && b > 0) {
                return "y = " + "x" + " + " + b;
            } else if (Math.abs(slope()) == 1 && b < 0) {
                return "y = " + "x" + " - " + b;
            }  else if (Math.abs(slope()) == 1 && b == 0) {
                return  "y = " + "x";
            } else if (b == 0) {
                return "y = " + slope + "x";
            }  else if (b > 0) {
                return "y = " + slope + "x" + " + " + b;
            } else {
                double absB = Math.abs(b);
                return "y = " + slope + "x" + " - " + absB;
            }
        }
    }
    public double distance() {
        return roundedToHundredth((Math.sqrt(Math.pow((Coord2X - Coord1X), 2) + Math.pow((Coord2Y - Coord1Y), 2))));
    }

    public double yIntercept() {
        b = roundedToHundredth(((Coord1Y - (m * Coord1X))));
        return b;
    }

    public double slope() {
        int numerator = (Coord2Y - Coord1Y);
        int denominator = (Coord2X - Coord1X);
        if (((double) numerator / denominator) == (int) ((double) numerator / denominator)) {
            slope = String.valueOf(numerator / denominator);
        } else {
            slope = numerator + "/" + denominator;
        }
        m = (double) numerator / denominator;
        return m;
    }

    public String coordinateForX(double x) {
        double y = (m * x) + b;
        return "(" + x + ", " + y + ")";
    }

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }
}

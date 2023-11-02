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

    public String lineInfo() {
        if (Coord1Y == Coord2Y) {
            String verticalLine = "\nThe equation of the line between these points is: " + equation();
            verticalLine += standardForm();
            verticalLine += pointSlope();
            verticalLine += ("\nThe slope of this line is: " + m);
            verticalLine += ("\nThe y-intercept of the line is: " + b);
            verticalLine += ("\nThe distance between the two points is: " + distance());
            return verticalLine;
        } else if (Coord1X == Coord2X) {
            return "\nThe points are on horizontal line. x = " + Coord1X;
        } else {
            String normalEquat = "\nThe two points are: (" + Coord1X + ", " + Coord1Y + ") and (" + Coord2X + ", " + Coord2Y + ")";
            normalEquat += ("\nThe equation of the line between these points is: " + equation());
            normalEquat += standardForm();
            normalEquat += pointSlope();
            normalEquat += ("\nThe slope of this line is: " + m);
            normalEquat += ("\nThe y-intercept of the line is: " + b);
            normalEquat += ("\nThe distance between the two points is: " + distance());
            return normalEquat;
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

    public String standardForm() {
        String stForm = "\nThe standard form of the equation is: ";
        if (Math.abs(m) != m) {
            double absM = Math.abs(m);
            stForm += absM + "x + y " + " = " + b;
            return stForm;
        }
        stForm += m + "x + y " + " = " + b;
        return stForm;
    }

    public String pointSlope() {
        String psForm = "\nThe point slope form of the equation is: ";
        if (Math.abs(b) != b) {
            double y = Math.abs(b);
            psForm += "y + " + y + " = " + m + "x";
            return psForm;
        } else {
            psForm += "y - " + b + " = " + m + "x";
            return psForm;
        }
    }

    public String altForms() {
        String forms = standardForm();
        forms += pointSlope();
        return forms;
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

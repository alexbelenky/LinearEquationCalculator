public class LinearEquation {
    private int Coord1X;
    private int Coord1Y;
    private int Coord2X;
    private int Coord2Y;

    public LinearEquation(int cord11int, int cord12int, int cord21int, int cord22int) {
        this.Coord1X = cord11int;
        this.Coord1Y = cord12int;
        this.Coord2X = cord21int;
        this.Coord2Y = cord22int;
    }

    public String returnFormula() {
        int m = ((Coord2Y - Coord1Y) / (Coord2X - Coord1X));
        int b = (Coord1Y - (2 * (Coord1X)));
        if (b != 0) {
            String formula = "y = " + m + "x" + " + " + b;
            return formula;
        }
        String formula = "y = " + m + "x";
        return formula;
    }
}

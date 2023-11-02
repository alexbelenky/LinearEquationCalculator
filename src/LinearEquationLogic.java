import java.util.Scanner;

public class LinearEquationLogic {
    public LinearEquationLogic() { }

    public void start() {
        getCoordinates();
    }

    public void getCoordinates() {
        String ifContinue = "y";
        while (ifContinue.equals("y")) {
            String Coordinate1 = turnCoordinateToString(askQuestion("Enter Coordinate 1 (x, y): "));
            int Coord1Int1 = Integer.parseInt(Coordinate1.substring(0, Coordinate1.indexOf(",")));
            int Coord1Int2 = Integer.parseInt(Coordinate1.substring(Coordinate1.indexOf(",") + 1));
            String Coordinate2 = turnCoordinateToString(askQuestion("Enter Coordinate 2 (x, y): "));
            int Coord2Int1 = Integer.parseInt(Coordinate2.substring(0, Coordinate2.indexOf(",")));
            int Coord2Int2 = Integer.parseInt(Coordinate2.substring(Coordinate2.indexOf(",") + 1));
            LinearEquation coord = new LinearEquation(Coord1Int1, Coord1Int2, Coord2Int1, Coord2Int2);
            System.out.println(coord.lineInfo());
            double pairWithX = Double.parseDouble(askQuestion("\nEnter a value for x: "));
            System.out.println("\nThe point on the line is " + coord.coordinateForX(pairWithX));
            if (!askQuestion("\nWould you like to enter another pair of coordinates? y/n: ").equals("y")) {
                ifContinue = "n";
            }
        }
        System.out.println("\nThank you for using the slope calculator, goodbye!");
    }

    public String askQuestion(String ques) {
        Scanner scan = new Scanner(System.in);
        System.out.print(ques);
        return scan.nextLine();
    }


    public String turnCoordinateToString(String str) {
        int firstInt = Integer.parseInt(str.substring(1, str.indexOf(",")));
        String coordinateInts = Integer.toString(firstInt);
        int secondInt = Integer.parseInt(str.substring(str.indexOf(",") + 2, str.length() - 1));
        coordinateInts += "," + secondInt;
        return (coordinateInts);
    }

}

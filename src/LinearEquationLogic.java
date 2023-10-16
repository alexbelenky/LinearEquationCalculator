import java.util.Scanner;

public class LinearEquationLogic {
    public LinearEquationLogic() { }

    public void start() {
        getCoordinates();
    }

    public void getCoordinates() {
        String Coordinate1 = turnCoordinateToString(askQuestion("Enter Coordinate 1 (x, y): "));
        String Coordinate2 = turnCoordinateToString(askQuestion("Enter Coordinate 2 (x, y): "));
        LinearEquation(Integer.parseInt(Coordinate1.substring(0, Coordinate1.indexOf(","))), Integer.parseInt(Coordinate1.substring(Coordinate1.substring(Coordinate1.indexOf(",") + 1))), );

    }

    public static String askQuestion(String ques) {
        Scanner scan = new Scanner(System.in);
        System.out.print(ques);
        return scan.nextLine();
    }

    //This method can be better but is ok for now
    public String turnCoordinateToString(String str) {
        int firstInt = Integer.parseInt(str.substring(1, str.indexOf(",")));
        String coordinateInts = Integer.toString(firstInt);
        int secondInt = Integer.parseInt(str.substring(str.indexOf(",") + 2, str.length() - 1));
        coordinateInts += "," + secondInt;
        return (coordinateInts);
    }

}

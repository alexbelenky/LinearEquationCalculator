import java.util.Scanner;

public class LinearEquationLogic {
    public LinearEquationLogic() { }

    public void start() {
        getCoordinates();
    }

    public void getCoordinates() {
        int test = turnCoordinateToInt(askQuestion("Enter Coordinate 1 (x, y): "));
        int test2 = turnCoordinateToInt(askQuestion("Enter Coordinate 2 (x, y): "));
        System.out.println(test);
        System.out.println(test2);
    }

    public static String askQuestion(String ques) {
        Scanner scan = new Scanner(System.in);
        System.out.print(ques);
        return scan.nextLine();
    }

    //This method can be better but is ok for now
    public int turnCoordinateToInt(String str) {
        int firstInt = Integer.parseInt(str.substring(1, str.indexOf(",")));
        String coordinateInts = Integer.toString(firstInt);
        int secondInt = Integer.parseInt(str.substring(str.indexOf(",") + 2, str.length() - 1));
        coordinateInts += secondInt;
        return Integer.parseInt(coordinateInts);
    }
}

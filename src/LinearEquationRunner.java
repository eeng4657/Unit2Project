import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {

        LinearEquation linear = new LinearEquation();
        Scanner cordOne = new Scanner(System.in);
        System.out.print("Enter your first (x,y) coordinate: ");
        String firstCord = cordOne.nextLine();
        String x1Str = firstCord.substring(0,firstCord.indexOf(","));
        String y1Str = firstCord.substring((firstCord.indexOf(",") + 1));
        // takes in 1st x,y string seperates into individual x and y values

        int x1 = Integer.valueOf(x1Str);
        int y1 = Integer.valueOf(y1Str);
        // x,y Strings converted to int variables

        Scanner cordTwo = new Scanner(System.in);
        System.out.print("Enter your second (x,y) coordinate: ");
        String secCord = cordTwo.nextLine();
        String x2Str = secCord.substring(0,secCord.indexOf(","));
        String y2Str = secCord.substring((secCord.indexOf(",") + 1));
        // takes in 2nd x,y string seperates into individual x and y values

        int x2 = Integer.valueOf(x2Str);
        int y2 = Integer.valueOf(y2Str);
        // 2nd x,y Strings converted to int variables

        System.out.println("Slope: " + linear.slope(x1,y1,x2,y2));
        System.out.println("Y-Intercept: " + linear.yIntercept(x1,y1,x2,y2));
        System.out.println("Equation: " + linear.equation(x1,y1,x2,y2));
        System.out.println("Distance between x coordinates: " + linear.xDiff(x1,x2));
        System.out.println("Distance between y coordinates: " + linear.yDiff(y1,y2));
        // print all methods for first two x,y coordinates

        Scanner cordThr = new Scanner(System.in);
        System.out.println("Enter your third x coordinate: ");
        String xCord = cordThr.nextLine();
        // takes in 3rd x string

        int x3 = Integer.valueOf(xCord);
        // 3rd x String converted to int variables

        System.out.println(linear.equationRunner(x3));
    }
}

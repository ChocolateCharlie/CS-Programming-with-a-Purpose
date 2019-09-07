/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/7/2019
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371.0;
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double xsin = Math.sin((x2 - x1) / 2.0);
        double ysin = Math.sin((y2 - y1) / 2.0);
        double sqrt = Math.sqrt(xsin * xsin + Math.cos(x1) * Math.cos(x2) * ysin * ysin);
        double distance = 2.0 * r * Math.asin(sqrt);

        System.out.println(distance + " kilometers");
    }
}

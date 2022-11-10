public class LinearEquation 
{
    public LinearEquation( ){ }

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public double slope(double x1,double y1,double x2,double y2)
    {
        return Math.round((y2 - y1) / (x2 - x1) * 100) / 100;
    }

    public double yIntercept(double x1,double y1,double x2,double y2)
    {
        return Math.round((y1 - (slope(x1,y1,x2,y2) * x1)) * 100) / 100;
    }

    public String equation(double x1,double y1,double x2,double y2)
    {
        return "y=" + slope(x1,y1,x2,y2) + "x+" + yIntercept(x1,y1,x2,y2);
    }

    public double xDiff(double x1,double x2)
    {
        return x2 - x1;
    }

    public double yDiff(double y1,double y2)
    {
        return y2 - y1;
    }

    public String equationRunner(double x) 
    {
        double y = ((slope(x1,y1,x2,y2) * x) + yIntercept(x1,y1,x2,y2));
        return "(" + x + "," + y + ")";
    }
}

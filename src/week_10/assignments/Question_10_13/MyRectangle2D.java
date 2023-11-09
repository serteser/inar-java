package week_10.assignments.Question_10_13;

public class MyRectangle2D {
    private double x;
    private double y;

    private double width;
    private double height;

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        double widthLeft = this.x - (width / 2);
        double widthRight = this.x + (width / 2);
        double heightUp = this.y + (height / 2);
        double heightDown = this.y - (height / 2);
        return ((widthLeft <= x && x <= widthRight) && (heightDown <= y && y <= heightUp));

    }

    public boolean contains(MyRectangle2D r) {
        double bigRightX = x + (width / 2);
        double bigRightUpY = y + (height / 2);
        double bigRightDownY = y - (height / 2);
        double bigLeftX = x - (width / 2);
        double bigLeftUpY = y + (height / 2);
        double bigLeftDownY = y - (height / 2);

        double smallRightX = r.getX() + (r.getWidth() / 2);
        double smallRightUpY = r.getY() + (r.getHeight() / 2);
        double smallRightDownY = r.getY() - (r.getHeight() / 2);
        double smallLeftX = r.getX() - (r.getWidth() / 2);
        double smallLeftUpY = r.getY() + (r.getHeight() / 2);
        double smallLeftDownY = r.getY() - (r.getHeight() / 2);

        return (bigRightX > smallRightX && bigRightUpY > smallRightUpY && bigRightDownY < smallRightDownY && bigLeftX < smallLeftX && bigLeftUpY > smallLeftUpY && bigLeftDownY < smallLeftDownY);
    }

    public boolean overlaps(MyRectangle2D r) {

        double bigDown = y - (height / 2);
        double smallDown = r.getY() + (r.getHeight() / 2);
        double bigUp = y + (height / 2);
        double smallUp = r.getY() - (r.getHeight() / 2);
        double bigRight = x + (width / 2);
        double smallRight = r.getX() - (r.getWidth() / 2);
        double bigLeft = x - (width / 2);
        double smallLeft = r.getX() + (r.getWidth() / 2);
        return (!(bigUp < smallUp || bigDown > smallDown || bigRight < smallRight || bigLeft > smallLeft) ^ !contains(r));
    }

    public MyRectangle2D getRectangle(double[][] points) {
        double upY = getUpY(points); // the upmost point at y-axis
        double lowY = getLowY(points); // the lowermost point at y-axis
        double rightX = getRightX(points); // the rightmost point at x-axis
        double leftX = getLeftX(points); // the leftmost point at x-axis
        double width = rightX - leftX;
        double height = upY - lowY;
        double x = (width / 2) + leftX;
        double y = (height / 2) + lowY;
        return new MyRectangle2D(x, y, width, height);

    }

    public double getRightX(double[][] p) {
        double maxValue = p[0][0];
        for (int row = 1; row < p.length; row++) {
            if (maxValue < p[row][0]) {
                maxValue = p[row][0];
            }
        }
        return maxValue;
    }

    public double getLeftX(double[][] p) {
        double minValue = p[0][0];
        for (int row = 1; row < p.length; row++) {
            if (minValue > p[row][0]) {
                minValue = p[row][0];
            }
        }
        return minValue;
    }

    public double getUpY(double[][] p) {
        double maxValue = p[0][1];
        for (int row = 1; row < p.length; row++) {
            if (maxValue < p[row][1]) {
                maxValue = p[row][1];
            }
        }
        return maxValue;
    }

    public double getLowY(double[][] p) {
        double minValue = p[0][1];
        for (int row = 1; row < p.length; row++) {
            if (minValue > p[row][1]) {
                minValue = p[row][1];
            }
        }
        return minValue;
    }

}

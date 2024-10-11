package isp.lab3.exercise2;

public class Rectangle {
    private static int length;
    private static int width;
    private static String color;

    public Rectangle() {
        length=15;
        width=20;
        color="green";
    }
    public static int getLength() {
        return length;
    }

    public static int getWidth() {
        return width;
    }

    public static String getColor() {
        return color;
    }
    public static int getPerimeter() {
        return length+width;
    }
    public static int getArea() {
        return length*width;
    }
}

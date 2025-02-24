public class RectangleClass {
    private double length;
    private double width;

    RectangleClass(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        if(length < 0.0 || length > 20.0)
            throw new IllegalArgumentException("Length must be > 0.0 and less than 20.0");
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        if(width < 0.0 || width > 20.0)
            throw new IllegalArgumentException("Width must be > 0.0 and less than 20.0");
        this.width = width;
    }

    double perimeter(double length, double width){
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    double area(double length, double width){
        double area = length * width;
        return area;
    }
}

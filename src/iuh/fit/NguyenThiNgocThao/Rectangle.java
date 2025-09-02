/**
 * 
 */
package iuh.fit.NguyenThiNgocThao;

/**
 * @author Nguyen Thi Ngoc Thao
 * @version 1.0
 */

public class Rectangle {
    // Khai báo biến instance
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    // Getter & Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Tính diện tích
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width +
               ", perimeter=" + getPerimeter() +
               ", area=" + getArea() + "]";
    }
}
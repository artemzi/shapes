package com.marakana;

/**
 * Created by azinoviev on 25.11.13.
 */
public class Rectangle {
    protected int width;
	protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int side) {

        this.width = this.height = side;
    }

    public int getArea() {
        int area = this.width * this.height;
        return area;
    }

    public int getPerimeter() {
        int perimeter = 2 * (this.width * this.height);
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (height != rectangle.height) return false;
        if (width != rectangle.width) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }
}

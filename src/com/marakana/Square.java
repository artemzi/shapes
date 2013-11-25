package com.marakana;

/**
 * Created by azinoviev on 25.11.13.
 */
public class Square extends Rectangle {
    private int width, height;

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

    public Square(int side) {
        super(side);
        this.height = this.width = side;
    }

    @Override
    public int getArea() {
        return super.getArea();
    }

    @Override
    public int getPerimeter() {
        return super.getPerimeter();
    }
}

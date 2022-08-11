package model;

import java.awt.*;

public class Circle {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                '}';
    }
}

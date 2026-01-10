package entidades;

import enums.ShapeColors;

public abstract class Shape {
    private ShapeColors color;

    public Shape() {
    }

    public Shape(ShapeColors color) {
        this.color = color;
    }
    
    public ShapeColors getColor() {
        return color;
    }
    
    public void setColor(ShapeColors color) {
        this.color = color;
    }

    public abstract double area();
}

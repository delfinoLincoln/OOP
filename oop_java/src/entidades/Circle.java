package entidades;

import entidades_enums.ShapeColors;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(ShapeColors color, Double radius) {
        super(color);
        this.radius = radius;
    }
    
    public Double getRadius() {
        return radius;
    }
    
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }
}

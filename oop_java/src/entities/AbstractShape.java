package entities;

import enums.ShapeColors;

public abstract class AbstractShape implements Shape{
    
    private ShapeColors color;

    public AbstractShape() {
    }

    public AbstractShape(ShapeColors color) {
        this.color = color;
    }

    public ShapeColors getColor() {
        return color;
    }

    public void setColor(ShapeColors color) {
        this.color = color;
    }   
}
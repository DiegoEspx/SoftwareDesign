package Herencia3;

public class Square extends Rectangle {
    private double side;

    public Square() {
        setLength(side);
        setWidth(side);
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(); 
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setLength(side); 
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        side = width;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        side = length;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString().replace("Rectangle[", "") + "side=" + side + "]";
    }
}

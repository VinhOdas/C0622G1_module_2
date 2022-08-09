package ss7_abstract_class_interface.exercise.interface_colorable.model;


public class Square extends Rectangle implements Colorable {
    public Square(double side) {
        super(side,side);
    }

    public Square(){
        super(1.0,1.0);
    }

    public Square(double side, String color, boolean filled) {
        super(side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public String toString(){
        return String.format("A Square with side= %f\n which is a subclass of %s",getSide(),super.toString());
    }


    @Override
    public String howToColor() {
        return " Color all four sides..";
    }
}

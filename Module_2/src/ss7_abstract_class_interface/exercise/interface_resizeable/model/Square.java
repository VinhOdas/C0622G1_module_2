package ss7_abstract_class_interface.exercise.interface_resizeable.model;


public class Square extends Rectangle  {
    public Square(double side) {
        super(side,side);
    }
    public Square(){
        super(1.0,1.0);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public String toString(){
        return String.format("A Square with side= %f",getSide()," which is a subclass of %s",super.toString());
    }

    @Override
    public void resize(double percent) {

    }
}

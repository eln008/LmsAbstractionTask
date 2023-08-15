public class Class1 extends Shape{

    public Class1(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3, side4);
    }

    @Override
    public double getPerimeter() {
        return  (getSide1()+getSide2()+getSide3()+getSide4());
    }
}

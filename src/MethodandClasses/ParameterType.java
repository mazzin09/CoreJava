package MethodandClasses;

class StandardType{
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    void setDimension(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}
public class ParameterType {
    public static void main(String[] args) {
        StandardType standard1 = new StandardType();
        StandardType standard2 = new StandardType();
        double vol;

        standard1.setDimension(5,6,10);
        standard2.setDimension(8,4,12);

        vol = standard1.volume();
        System.out.println("Volume :" + vol);

        vol = standard2.volume();
        System.out.println("Volume :" + vol);
    }
}

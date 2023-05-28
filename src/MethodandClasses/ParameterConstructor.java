package MethodandClasses;


class RemovingTwoMethod{
    double width;
    double height;
    double depth;

    RemovingTwoMethod(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;
    }


}
public class ParameterConstructor {
    public static void main(String[] args) {
        RemovingTwoMethod rm = new RemovingTwoMethod(10,20,35);
        RemovingTwoMethod rm1 = new RemovingTwoMethod(15,12,32);
        double vol;

        vol = rm.volume();
        System.out.println("Volume :" + vol);

        vol = rm1.volume();
        System.out.println("Volume :" + vol);
    }
}

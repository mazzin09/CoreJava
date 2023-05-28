package MethodandClasses;

class BoxConstructorOverload{
double height;
double width;
double depth;

    BoxConstructorOverload(double w, double h, double d){
        height = h;
        width = w;
        depth = d;
    }

    BoxConstructorOverload(){
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxConstructorOverload(double res){
        width = height = depth = res;
    }

    double volume(){
        return width * depth * height;
    }
}
public class ConstructorOverload {
    public static void main(String[] args) {
        BoxConstructorOverload boxConstructor = new BoxConstructorOverload(12, 10, 22);
        BoxConstructorOverload boxConstructor1 = new BoxConstructorOverload();
        BoxConstructorOverload boxConstructor2 = new BoxConstructorOverload(24);

        double vol;

        System.out.println("=============================================");

        vol = boxConstructor.volume();
        System.out.println("Volume for three parameter : " + vol);

        vol = boxConstructor1.volume();
        System.out.println("Volume for no parameter : " + vol);

        vol = boxConstructor2.volume();
        System.out.println("Volume for single parameter : " + vol);
    }
}

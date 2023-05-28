package MethodandClasses.CollectionFramework.Generics;

public class Box<T> {
    T container;

    public Box(T container){
        this.container = container;
    }

    public void selectType(){
        if(container instanceof String){
            System.out.println("Length of " + container + ": " + ((String) container).length());
        }
        else if(container instanceof Integer) {
            System.out.println("Integer value: " + container);
        }
    }

    public Object getValue(){
        return this.container;
    }
}

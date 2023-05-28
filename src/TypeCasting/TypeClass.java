package TypeCasting;

class Sport{
     void message(){
        System.out.println("All for one.");
    }
}

class Football extends Sport{
    @Override
     void message(){
        System.out.println("Rise as one");
    }
}

public class TypeClass {
    public static void main(String[] args) {
        // Creating a Parent class object
        // but referencing it to a Child class
    Sport sport = new Football();
    sport.message();
    }
}

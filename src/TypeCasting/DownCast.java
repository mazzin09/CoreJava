package TypeCasting;

class Member{
    void chat(){
        System.out.println("Hello! We can chat.");
    }
}

class Admin extends Member{
    void addUsers(){
        System.out.println("We can add members.");
    }
}

public class DownCast {
    public static void main(String[] args) {
        // Upcast
    Member ram = new Admin();
    Admin shyam = new Admin();
    Admin r1 = (Admin) ram;
//    r1.addUsers();
//
//    ((Admin) ram).addUsers();

    Member nimesh = new Member();
    ((Admin) nimesh).addUsers();
        // Downcast
//    Member m = (Member) member;
//    m.addUsers();
    }
}

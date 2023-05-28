//package MethodandClasses.ExceptionHandling;
//
//
//class AccountInvalid extends Exception {
//
//}
//
//public class ThrowDemo {
//    public static String getAccount(int id) throws AccountInvalid{
//        if(id==0){
//            throw new AccountInvalid();
//        }
//        return String.valueOf(id);
//    }
//
//    public static int getSum(int id) throws AccountInvalid{
//        getAccount(id);
//        return 1;
//    }
//    public static void main(String[] args){
//        getSum(1);
//        int balance = 100;
//        int withdrawal = 200;
//        try{
//            if(balance<withdrawal){
//                throw new Exception("Insufficient balance");
//            }
//            balance = balance - withdrawal;
//            System.out.println("Remaining balance is: " + balance);
//        }
//      catch (Exception e){
//            e.printStackTrace();
//      }
//    }
//}

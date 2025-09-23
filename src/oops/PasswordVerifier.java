package oops;

import java.util.Scanner;

class Password1{
    String password() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String verifier = scanner.nextLine();
        return verifier;
    }
}
class Password2 {
    String passwordagain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password again");
        String verifier2 = scanner.nextLine();
        return verifier2;
    }
}
class PasswordChecker{
    String passwordfromp1;
    String passwordfromp2;
    void collectfrompassword1(){
        Password1 p1  = new Password1();
        passwordfromp1 = p1.password();
        }
        void collectfrompassword2(){
        Password2 p2 = new Password2();
        passwordfromp2 = p2.passwordagain();
        }
        void comaprepasswords(){
        //if(passwordfromp1 == passwordfromp2)//
            if(passwordfromp1 .equals(passwordfromp2)){
                System.out.println("Password match");
        }else{
            System.out.println("password doesn't match");
        }
    }

}

public class PasswordVerifier {
    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker();
        pc.collectfrompassword1();
        pc.collectfrompassword2();
        pc.comaprepasswords();
    }

}

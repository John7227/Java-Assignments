/*Ask for username and password from the user
if the username is admin and the password is 1234 print access granted 
Otherwise print access denied which will be declared*/


import java.util.Scanner;

public class NestedIf {
     public static void main(String[] args) {

	String realUserName = admin;
	int realPassword 1234;

	System.out.print("Enter Username: ");
	String userName = input.nextLine();	

	System.out.print("Enter Password: ");
	int password = input.nextInt();

	if (userName.equals(realUserName)) {
		if (password == realPassword) {
	    System.out.println("Access Granted");
	}
	}	
	else {
	    System.out.println("Access Denied");
	}
	

    }

}
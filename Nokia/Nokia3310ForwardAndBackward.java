import java.util.Scanner;

public class Nokia3310ForwardAndBackward {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

int listOfMenuFunctionsChoice;

do {	String listOfMenuFunctions = """
List Of Menu Functions

1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM services
0. Exit

""";

	System.out.print(listOfMenuFunctions);
	System.out.print("Enter Main Menu: ");
	listOfMenuFunctionsChoice = input.nextInt();

	switch(listOfMenuFunctionsChoice) {

	case 1: System.out.println("Phone Book"); 
		String phoneBookMenu = """

1. Search
2. Service NOs
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b' card
8. Options
9. Speed dials
10. Voice tags
0. Exit

""";
	System.out.print(phoneBookMenu);
	System.out.print("Enter Phone Book: ");
	int phoneBookMenuChoice = input.nextInt();

	switch(phoneBookMenuChoice) {
	case 1: System.out.println("Search"); break;
	case 2: System.out.println("Service NOs"); break;
	case 3: System.out.println("Add name"); break;
	case 4: System.out.println("Erase"); break;
	case 5: System.out.println("Edit"); break;
	case 6: System.out.println("Assign tone"); break;
	case 7: System.out.println("Send b' tone"); break;
	case 8: System.out.println("Options"); 

int optionsMenuChoice;
do {
		String optionsMenu = """

1. Type of view
2. Memory status
0. Exit

""";
	System.out.print(optionsMenu);
	System.out.print("Enter Option: ");
	optionsMenuChoice = input.nextInt();


	switch(optionsMenuChoice) {
	case 1: System.out.println("Type of view"); break;
	case 2: System.out.println("Memory status"); break;
	case 0: System.out.println("Exit"); break;
	default: System.out.println("Invalid input");

}
}while (optionsMenuChoice != 0);
break;
	case 9: System.out.println("Speed dials"); break;
	case 10: System.out.println("Voice tags"); break;
	case 0: System.out.println("Exit"); break;
	default: System.out.println("Invalid input");

}

break;



	case 2: System.out.println("Messages"); 

int messageMenuChoice;

do {		String messageMenu = """

1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Simileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Service command editor
0. Exit

""";
	System.out.print(messageMenu);
	System.out.print("Enter Message: ");
	messageMenuChoice = input.nextInt();

	switch(messageMenuChoice) {
	case 1: System.out.println("Write Messages"); break;
	case 2: System.out.println("Inbox"); break;
	case 3: System.out.println("Outbox"); break;
	case 4: System.out.println("Picture Messages"); break;
	case 5: System.out.println("Templates"); break;
	case 6: System.out.println("Simileys"); break;
	case 7: System.out.println("Message settings"); 
	
int messageSettingsMenuChoice;

do {	String messageSettingsMenu = """

1. Set1
2. Common
0. Exit

""";
	System.out.print(messageSettingsMenu);
	System.out.print("Enter Message Settings: ");
	messageSettingsMenuChoice = input.nextInt();

	switch(messageSettingsMenuChoice) {
	case 1: System.out.println("Set1"); 

int set1MenuChoice;

do {	String set1Menu = """

1. Message Centre number
2. Message Sentas
3. Message Validity
0. Exit

""";
	System.out.print(set1Menu);
	System.out.print("Enter Set1: ");
	set1MenuChoice = input.nextInt();

	switch(set1MenuChoice) {
	case 1: System.out.println("Message centre number"); break;
	case 2: System.out.println("Message Sentas"); break;
	case 3: System.out.println("Message Validity"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");
}
break;

}while(set1MenuChoice != 0);
	case 2: System.out.println("Common");
	case 0: System.out.println("Exit"); 

int commonMenuChoice;

do {		String commonMenu = """

1. Delivery reports
2. Reply via same centre
3. Character support
0. Exit

""";
	System.out.print(commonMenu);
	System.out.print("Enter Common: ");
	commonMenuChoice = input.nextInt();

	switch(commonMenuChoice) {
	case 1: System.out.println("Delivery reports"); break;
	case 2: System.out.println("Reply via same centre"); break;
	case 3: System.out.println("Characters support"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
}while (commonMenuChoice != 0);
break;

}

}while(messageSettingsMenuChoice != 0);

break;
	case 8: System.out.println("Info settings"); break;
	case 9: System.out.println("Voice mailbox number"); break;
	case 10: System.out.println("Service command editor"); break;
	case 0: System.out.println("Exit"); break;
	default: System.out.println("Invalid input");



}

}while (messageMenuChoice != 0);

break;

	case 3: System.out.println("Chat"); break;
	case 4: System.out.println("Call Register"); 
	
int callRegisterMenuChoice;

do{	String callRegisterMenu = """

1. Missed calls
2. Received calls
3. Dailded calls
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepared credit
0. Exit

""";
	System.out.print(callRegisterMenu);
	System.out.print("Call Register: ");
	callRegisterMenuChoice = input.nextInt();

	switch(callRegisterMenuChoice) {
	case 1: System.out.println("Missed calls"); break;
	case 2: System.out.println("Received cals"); break;
	case 3: System.out.println("Dailed calls"); break;
	case 4: System.out.println("Erase recent call lists"); break;
	case 5: System.out.println("Show call duration"); 

int showCallDurationMenuChoice;
		
do {	String showCallDurationMenu = """

1. Last call duration
2. All calls duration
3. Received calls duration
4. Dailled calls duration
5. Clear timers
0. Exit

""";
	
	System.out.print(showCallDurationMenu);
	System.out.print("Enter Show Call Duration: ");
	showCallDurationMenuChoice = input.nextInt();

	switch(showCallDurationMenuChoice) {
	case 1: System.out.println("Last call duration"); break;
	case 2: System.out.println("All calls duration"); break;
	case 3: System.out.println("Received calls duration"); break;
	case 4: System.out.println("Dailed calls duration"); break;
	case 5: System.out.println("Clear timers"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
}while (showCallDurationMenuChoice != 0);

break;
	case 6: System.out.println("Show call costs"); 
		
int showCallCostsMenuChoice;

do {	String showCallCostsMenu = """

1. Last call cost
2. All calls cost
3. Clear counters
0. Exit

""";

	System.out.print(showCallCostsMenu);
	System.out.print("Enter Show Call Costs: ");
	showCallCostsMenuChoice = input.nextInt();

	switch(showCallCostsMenuChoice) {
	case 1: System.out.println("Last call cost"); break;
	case 2: System.out.println("All calls cost"); break;
	case 3: System.out.println("Clear counters"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
} while(showCallCostsMenuChoice != 0);
break;
	case 7: System.out.println("Call cost settings"); 
		
int callCostSettingsMenuChoice;

do {	String callCostSettingsMenu = """

1. Call cost limit
2. Show cost in
0. Exit

""";
	System.out.print(callCostSettingsMenu);
	System.out.print("Enter Call Cost Settings: ");
	callCostSettingsMenuChoice = input.nextInt();
	
	switch(callCostSettingsMenuChoice) {
	case 1: System.out.println("Call cost limit"); break;
	case 2: System.out.println("Show cost in"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");

}
} while(callCostSettingsMenuChoice != 0);

break;
	case 8: System.out.println("Prepared credit"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
}while (callRegisterMenuChoice != 0);
break;
	case 5: System.out.println("Tones"); 
	
int tonesMenuChoice;

do {	String tonesMenu = """

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver
0. Exit

""";
	System.out.print(tonesMenu);
	System.out.print("Enter Tone: ");
	tonesMenuChoice = input.nextInt();

	switch(tonesMenuChoice) {
	case 1: System.out.println("Ringing tone"); break;
	case 2: System.out.println("Ringing volume"); break;
	case 3: System.out.println("Incoming call alert"); break;
	case 4: System.out.println("Composer"); break;
	case 5: System.out.println("Message alert"); break;
	case 6: System.out.println("Keypad tones"); break;
	case 7: System.out.println("Warning and game tones"); break;
	case 8: System.out.println("Vibrating alert"); break;
	case 9: System.out.println("Screen saver"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
}while (tonesMenuChoice != 0);

break;


	case 6: System.out.println("Settings"); 

int settingsMenuChoice;

do {		String settingsMenu = """

1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
0. Exit

""";
	System.out.print(settingsMenu);
	System.out.print("Enter Setting: ");
	settingsMenuChoice = input.nextInt();

	switch(settingsMenuChoice) {
	case 1: System.out.println("Call settings"); 

int callSettingsMenuChoice;

do{		String callSettingsMenu = """

1. Automatic redial 
2. Speed dialing
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer
0. Exit

""";
	System.out.print(callSettingsMenu);
	System.out.print("Enter Settings: ");
	callSettingsMenuChoice = input.nextInt();

	switch(callSettingsMenuChoice) {
	case 1: System.out.println("Automatic redial"); break;
	case 2: System.out.println("Speed dialing"); break;
	case 3: System.out.println("Call waiting options"); break;
	case 4: System.out.println("Own number sending"); break;
	case 5: System.out.println("Phone line in use"); break;
	case 6: System.out.println("Automatic answer"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");

}
}while (callSettingsMenuChoice != 0);
break;
	case 2: System.out.println("Phone settings"); 

int phoneSettingsMenuChoice;

do{		String phoneSettingsMenu = """

1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights
6. Confirm SIM service actions
0. Exit

""";
	System.out.print(phoneSettingsMenu);
	System.out.print("Enter Phone Settings: ");
	phoneSettingsMenuChoice = input.nextInt();

	switch(phoneSettingsMenuChoice) {
	case 1: System.out.println("Language"); break;
	case 2: System.out.println("Cell info display"); break;
	case 3: System.out.println("Welcome note"); break;
	case 4: System.out.println("Network selection"); break;
	case 5: System.out.println("Lights"); break;
	case 6: System.out.println("Confirm SIM service actions"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");

}
}while (phoneSettingsMenuChoice != 0);
break;
	case 3: System.out.println("Security settings"); 

int securitySettingsMenuChoice;

do{		String securitySettingsMenu = """

1. PIN code request
2. Call barring service
3. Fixed dialing
4. Closed user group
5. Phone security
6. Change access codes
0. Exit

""";
	System.out.print(securitySettingsMenu);
	System.out.print("Enter Security Settings: ");
	securitySettingsMenuChoice = input.nextInt();

	switch(securitySettingsMenuChoice) {
	case 1: System.out.println("PIN code request"); break;
	case 2: System.out.println("Call barring service"); break;
	case 3: System.out.println("Fixed dialing"); break;
	case 4: System.out.println("Closed user group"); break;
	case 5: System.out.println("Phone security"); break;
	case 6: System.out.println("Change access codes"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
}while (securitySettingsMenuChoice != 0);

break;
	case 4: System.out.println("Restore factory settings"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");


}
}while (settingsMenuChoice != 0);

break;
	case 7: System.out.println("Call Divert"); break;
	case 8: System.out.println("Games"); break;
	case 9: System.out.println("Calculator"); break;
	case 10: System.out.println("Reminders"); break;
	case 11: System.out.println("Clock"); 
	
int clockMenuChoice;

do {	String clockMenu = """

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
0. Exit

""";
	System.out.print(clockMenu);
	System.out.print("Enter Clock: ");
	clockMenuChoice = input.nextInt();

	switch(clockMenuChoice) {
	case 1: System.out.println("Alarm clock"); break;
	case 2: System.out.println("Clock settings"); break;
	case 3: System.out.println("Date setting"); break;
	case 4: System.out.println("Stopwatch"); break;
	case 5: System.out.println("Countdown timer"); break;
	case 6: System.out.println("Auto update of date and time"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");

}
}while (clockMenuChoice != 0);

break;
	case 12: System.out.println("Profiles"); break;
	case 13: System.out.println("SIM services"); break;
	case 0: System.out.println("Exit");
	default: System.out.println("Invalid input");

    }

}while(listOfMenuFunctionsChoice != 0);

}

}
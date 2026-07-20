import java.util.Scanner;

public class NokiaMenu3310 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	String mainMenu = """
Main Menu

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


""";

	System.out.println(mainMenu);
	int PhoneBook = input.nextInt();

	switch(PhoneBook) {

	    case 1: System.out.println("Phone book");
		String phoneBook = """

1. Search
2. Service Nos
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b' card
8. Options
9. Speed dials
10. Voice tags

""";
	  System.out.println(phoneBook);
	  int phoneBokList = input.nextInt();

		     switch(phoneBokList) {
			    case 2: System.out.println("Search"); break;
			    case 3: System.out.println("Service Nos"); break;
			    case 4: System.out.println("Add name"); break;
			    case 5: System.out.println("Erase"); break;
			    case 6: System.out.println("Edit"); break;
			    case 7: System.out.println("Assign tone"); break;
			    case 8: System.out.println("Send b' card"); break;
			    case 9: System.out.println("Options"); break;

			         String Options = """

1. Types of views
2. Memory status

""";

	                    System.out.println(Options);
	                    break;
			    case 10: System.out.println("Speed dials"); break;
			    default: System.out.println("Invalid Input");


	                    
		      }
	      	      break;

			
	  case 2: System.out.println("Messages");
	       String messages = """

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

""";

	  System.out.println(messages);
	  int messagesList = input.nextInt();

	    switch (messagesList) {
			case 1: System.out.println("Write messages"); break;
			case 2: System.out.println("Inbox"); break;
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture messages"); break;
			case 5: System.out.println("Templates"); break;
			case 6: System.out.println("Simileys"); break;
		        case 7: System.out.println("Message Settings");
			    String messageSettings = """

1. Set
2. Common

""";

	    System.out.println(messageSettings);
	    int messageSettingsList = input.nextInt();

				switch (messageSettingsList) {
	
						case 1: System.out.println("Set");
			  		  	    String set = """

1. Message centre number
2. Message sent as
3. Message Validity

""";

	    					System.out.println(set);
	    				    	    break;

						case 2: System.out.println("Common");
							String common = """
									
1. Delivery reports
2. Reply via same centre
3. Character support

""";
						System.out.println(common);
						    break;

			       }
			    break;

		        case 8: System.out.println("Info settings"); break;
		        case 9: System.out.println("Voice mailbox number"); break;
		        case 10: System.out.println("Service command editor"); break;
		   }

	case 3: System.out.println("Chat"); break;
	case 4: System.out.println("Call Register");
	    String callRegister = """

1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepared credit

""";

	System.out.println(callRegister);
	int callRegisterList = input.nextInt();

			switch (callRegisterList) {

								case 5: System.out.println("Show Call Duration");
						   		     String showCallDuration = """
1. Last call duration
2. All calls duration
3. Receieved calls duration
4. Dialled calls duration
5. Clear timers

""";

								System.out.println(showCallDuration);
								   break;
						case 6: System.out.println("Show Calls Costs");
						    String showCallsDuration = """

1. Last call cost
2. All calls cost
3. Clear counters

""";
						System.out.println(showCallsDuration);
						   break;
				    case 7: System.out.println("Call Cost Settings");
					String callCostSettings = """

1. Call cost limit
2. Show costs in

""";
				    System.out.println(callCostSettings);
				       break;		
				
			}

	case 5: System.out.println("Tones");
	    String tones = """

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver

""";
	System.out.println(tones);
	    break;

	case 6: System.out.println("Settings");
	    String settings = """

1. Call settings
2. Phone settings
3. Security settings
4. Restore fectory settings

""";
	System.out.println(settings);
	int settingsList = input.nextInt();

		switch (settingsList) {

							case 1: System.out.println("Call Settings");
						 	    String callSettings = """

1. Automatic redial
2. Speed dialing
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer

""";

							System.out.println(callSettings);
							    break;


						case 2: System.out.println("Phone Settings");
						    String phoneSettings = """

1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights
6. Confirm SIM service actions

""";
	
						System.out.println(phoneSettings);
						    break;


				case 3: System.out.println("Security Settings");
				    String securitySettings = """

1. PIN code request
2. Call barring service
3. Fixed dialing
4. Closed user group
5. Phone security
6. Change access codes

""";

				System.out.println(securitySettings);
				    break;

		}
	case 7: System.out.println("Call divert"); break;
	case 8: System.out.println("Games"); break;
	case 9: System.out.println("Calculator"); break;
	case 10: System.out.println("Reminders"); break;
	case 11: System.out.println("Clock");
	    String clock = """

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time

"""; 

	System.out.println(clock);
	break;
	    		default: System.out.println("Invalid option");


	case 12: System.out.println("Profiles"); break;
	case 13: System.out.println("SIM services"); break;

		
	  	     }


    }

}
import java.util.Scanner;

    public class Nokia{
      public static void main(String[]args){

 Scanner collector = new Scanner(System.in);

 System.out.println(" ☺️🤳️ Welcome to your Nokia phone, below is your Nokia menu map, which helps you navigate your new phone with ease and confidence!. Hope you find fun getting to know your new device!");

System.out.println("""

         >>>>>>>>>>>>>>>>>>>>> LIST OF MAIN MENU FUNCTIONS <<<<<<<<<<<<<<<<<<<<
                        
                                    1. Phone book📕️
                                    2. Messages 💬️
                                    3. Chat
                                    4. Call Register
                                    5. Tones
                                    6. Settings
                                    7. Call divert
                                    8. Games
                                    9. Calculator
                                    10.Reminders
                                    11.Clock
                                    12.Profiles
                                    13.SIM services

         🧩️Choose any option to get started....

     """);
int menuOptions = collector.nextInt();

System.out.println("Welcome to THE NOKIA SUB-MENU! Explore and see what's inside!");

switch(menuOptions) {

   case 1 -> {System.out.println(""" 
          
          Welcome to PHONE BOOK📕️ SUB-MENU! below are it's several options:


                                    1. Search
                                    2. Service Nos
                                    3. Add name
                                    4. Erase
                                    5. Edit
                                    6. Assign tone
                                    7. Send b'card
                                    8. Options
                                    9. Speed dials
                                    10.Voice tags

          Explore the options by choosing anyone you prefer..
"""); 
        int phoneBook = collector.nextInt();
         switch(phoneBook) {
                 case 1 -> { System.out.println("Welcome to the search bar, search displays mesasages direcetly\nchoose the search option below: \n 1. search");
                                int search = collector.nextInt();
                                switch(search){
                                    case 1 -> System.out.println("SEARCH");
                                    default-> System.out.println("Invalid option,pick the right option");
          }
          }
                 case 2 -> { System.out.println("Welcome to the Service Nos, Service Nos displays mesasages direcetly\nchoose the search option below: \n 1. Service Nos");
                                int service = collector.nextInt();
                                  switch(service){
                                     case 1 -> System.out.println("Service Nos"); 
                                     default-> System.out.println("Invalid option,pick the right option");
                 }
                 }    
                 case 3 -> {System.out.println("Welcome to the Add name bar, Add name displays mesasages direcetly\nchoose the search option below: \n 1. Add name");
                                 int addName = collector.nextInt();
                                  switch(addName){
                                     case 1 -> System.out.println("Add name"); 
                                     default-> System.out.println("Invalid option,pick the right option");
                }
                }
                 case 4 -> {System.out.println("Welcome to the Erase bar, Erase displays mesasages direcetly\nchoose the search option below: \n 1. Erase");
                                 int erase = collector.nextInt();
                                  switch(erase){
                                     case 1 -> System.out.println("Erase"); 
                                     default-> System.out.println("Invalid option,pick the right option");
                }
                }
                 case 5 -> {System.out.println("Welcome to the Edit bar, Edit displays mesasages direcetly\nchoose the search option below: \n 1. Edit");
                                 int edit = collector.nextInt();
                                  switch(edit){
                                     case 1 -> System.out.println("Edit");
                                        default-> System.out.println("Invalid option,pick the right option");
                }
                }
                 case 6 -> {System.out.println("Welcome to the edit bar, Assign tone displays mesasages direcetly\nchoose the search option below: \n 1. Assign tone");
                                 int assignTone = collector.nextInt();
                                  switch(assignTone){
                                     case 1 -> System.out.println("Assign tone");
                                        default-> System.out.println("Invalid option,pick the right option");
                }
                }
                 case 7 -> {System.out.println(" Welcome to the edit bar, Send b'card displays mesasages direcetly\nchoose the search option below: \n 1. Send b'card ");
                                 int sendbCards = collector.nextInt();
                                  switch(sendbCards){
                                     case 1 -> System.out.println("Send b'card");
                                        default-> System.out.println("Invalid option,pick the right Send b'card");
                }
                }
                 case 8 -> {System.out.println("""
        
           The Option item has 2 sub-options below which displays messages directly and have no sub-option:
        
                                     1.Type of view
                                     2.Memory status

 """);
                                 int options = collector.nextInt();
                                  switch(options) {
                                     case 1 -> System.out.println("Type of view");
                                       case 2 -> System.out.println("Memory status");
                                                        default-> System.out.println("Invalid option,pick the right Send b'card");
                }
                }
                 case 9 -> {System.out.println(" Welcome to the Speed Dial item, Send b'card displays mesasages direcetly\nchoose the search option below: \n 1. Speed Dial ");
                                   int speedDial = collector.nextInt();
                                  switch(speedDial) {
                                     case 1 -> System.out.println("speedDial");
                                       case 2 -> System.out.println("speedDial");
                                        default-> System.out.println("Invalid option,pick the right Send b'card");
}
}
                 case 10-> {System.out.println(" Welcome to the Voice tags item, Voice tags item displays mesasages direcetly\nchoose the search option below: \n 1.Voice tags item ");

                                   int VoiceTagsItem = collector.nextInt();
                                      switch(VoiceTagsItem) {
                                        case 1 -> System.out.println("Voice tags item");
                                          case 2 -> System.out.println("Voice tags item");
                                            default-> System.out.println("Invalid option,pick the right Send b'card");
                                            }
                                            }

                default-> System.out.println("Invalid option,pick the any of the displayed options");








}//phonebook




}//caseone





  case 2 -> {System.out.println(""" 
                                    Want to send a message?💭️ you're in the right section! 

                                    explore the messaging options below:
                                                1. Write messages💬️
                                                2. Inbox📥️
                                                3. Outbox📤️
                                                4. Picture messages🤳️
                                                5. Templates 🍤️
                                                6. Smileys🤩️

                                    Get on it right away! your loved ones can't wait to hear from you!🥰️ """);

                                    int messages = collector.nextInt(); 
                       
                     switch(messages){
                              case 1 -> {System.out.println(" Write and send a message by clicking on the option below: \n 1. Write messages");
                                    int writeMessages = collector.nextInt();
                                    switch(writeMessages){
                                    case 1 -> System.out.println("Write Messages");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                 }
                                 }
                              case 2 -> {System.out.println(" Check your inbox by clicking on the option below: \n 1. Inbox");
                                    int inbox = collector.nextInt();
                                    switch(inbox){
                                    case 1 -> System.out.println("Inbox");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }


                               case 3 -> {System.out.println(" Access Output📤️ by clicking on the option below: \n 1. Inbox");
                                    int output = collector.nextInt();
                                    switch(output){
                                    case 1 -> System.out.println("output");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }

                               case 4 -> {System.out.println(" Send picture messages by clicking on the option below: \n 1. Inbox");
                                    int pictureMessages = collector.nextInt();
                                    switch(pictureMessages){
                                    case 1 -> System.out.println("pictureMessages");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");

                                }
                                }
                              case 5 -> {System.out.println(" Access templates by clicking on the option below: \n 1. Inbox");
                                    int templates = collector.nextInt();
                                    switch(templates){
                                    case 1 -> System.out.println("templates");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }


                              case 6 -> {System.out.println(" Access Smileys☺️🥰️🤩️ by clicking on the option below: \n 1. Inbox");
                                    int smileys = collector.nextInt();
                                    switch(smileys){
                                    case 1 -> System.out.println("smileys");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
           
                                }
                                }



                              case 7 -> {System.out.println(""" 
                                    Welcome to the Message Settings Section, choose any of the option below:

                                            1. Set 1^2
                                            2. Common^3
""");                              
                                    int messageSettings = collector.nextInt();
                                    //System.out.println((messageSettings > 2)? invalid option : );
                                         
                                          switch(messageSettings){
                                             case 1 -> {System.out.println("""
                                                Connect with the Nokia's center here, by chossing any of the options: below:
                                                     1. Message centre number
                                                     2. Messages sent as
                                                     3. Message validity

""");
                                                        int set2 = collector.nextInt();

                                                            switch(set2){

                                                            case 1 -> {System.out.println(" Reach out to the Nokia's message center here, by choosing the option(s) below: \n 1. Message Center Number");
                                                           int centerNumber = collector.nextInt();
                                                          switch(centerNumber){
                                                            case 1 -> System.out.print("Message centre number");
                                                              default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                         }
                                                         }
                                                            case 2 -> {System.out.println(" Tell us how to identify that you reached out to us by choosing the option(s) below: \n 2. Messages sent as");
                                                           int messagesSentas = collector.nextInt();
                                                            switch(messagesSentas){
                                                               case 1 -> System.out.print("Messages Sent as");
                                                                 default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                         }
                                                         }


                                                         case 3 -> {System.out.println(" Check the validity of message sent by choosing any the option(s) below: \n 1. Message Validity");
                                                            int messageValidity = collector.nextInt();
                                                             switch(messageValidity){
                                                               case 1 -> System.out.print("Message Validity\n");
                                                             default -> System.out.println("Invalid input, click on the avalaible option(s)");     

                                                        }
                                                        }
                                            default -> System.out.println("Invalid input, click on the avalaible option(s)");                                                                    


}



}
}
}//End of set

// start common from here 

                 
                                        }
                                        }
}//menuOptions
}//method
} //class



                            




//the case brace covers everyother print out under case 1 and the same apllies to all other cases and sub underneath them
// If a nested switch case is more than one,


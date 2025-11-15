import java.util.Scanner;

    public class Nokia{
      public static void main(String[]args){

 Scanner collector = new Scanner(System.in);

 System.out.println(" ☺️🤳️ Welcome to your Nokia phone, below is your Nokia menu map, which helps you navigate your new phone with ease and confidence!. Hope you find fun getting to know your new device!");

System.out.println("""

         >>>>>>>>>>>>>>>>>>>>> LIST OF MAIN MENU FUNCTIONS <<<<<<<<<<<<<<<<<<<<
                        
                                    1. Phone book
                                    2. Messages
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
                                 int typeOfView = collector.nextInt();
                                  switch(typeOfView) {
                                     case 1 -> System.out.println("Type of view");
                                       case 2 -> System.out.println("Type of view");
                                        default-> System.out.println("Invalid option,pick the right Send b'card");
}
}
                 case 9 -> System.out.println("Option 1 - 7,9,10, has no sub-options; explore further with option 8");
                 case 10-> System.out.println("Option 1 - 7,9,10, has no sub-options; explore further with option 8");


//the case brace covers everyother print out under case 1 and the same apllies to all other cases and sub underneath them
// If a nested switch case is more than one,

//}//switch service in case 2
//}//case 2 phonebook
}//search case 
//}// switch search in case 1
//}// case 1 phonebook
 //}//phonebook
}//case 1 menu       
}//menuoptions



} 
    }

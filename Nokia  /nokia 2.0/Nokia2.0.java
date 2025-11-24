import java.util.Scanner;

    public class Nokia2.0 {
      public static void main(String[]args){

 Scanner collector = new Scanner(System.in);

int menuOptions = -1;

//while (menuOptions != 0){
NokiaFunction.phonebook(menuOptions);

 System.out.println("""

           ☺️🤳️ Welcome to your Nokia phone, below is your Nokia menu map, 
           which helps you navigate your new phone with ease and confidence!.
           Hope you find fun getting to know your new device!
 """);

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

                               press 0 to exit

         🧩️Choose any option to get started....

     """);
 menuOptions = collector.nextInt();

System.out.println("Welcome to THE NOKIA SUB-MENU! Explore and see what's inside!");

switch(menuOptions) {

   case 1 -> {
        int phoneBook = -1;

        while (phoneBook != 88){
        
          System.out.println(""" 
          
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

                                press 88 to exit

          Explore the options by choosing anyone you prefer..
        """); 
         phoneBook = collector.nextInt();
         switch(phoneBook) {
        
                        case 1 ->  {
                            int search = -1;
                            while(search != 00) {
                            System.out.println("""
                                    Welcome to the search bar, search displays mesasages directly
                                    choose the search option below:
                                         1. search
                                 Press 00 to exit
                                """);
                             search = collector.nextInt();
                             switch(search){
                             case 1 -> System.out.println("SEARCH");
                             default-> System.out.println("Invalid option,pick the right option");
                        }//loop          
                        }
                        }
                        case 2 -> {
                            int service = -1;
                            while(service != 000) {
                            System.out.println("""
                            Welcome to the Service Nos, Service Nos displays mesasages directly
                            choose the search option below:
                                    1. Service Nos
                               Press 000 to exit
                            """);  
                            service = collector.nextInt();
                            switch(service){
                            case 1 -> System.out.println("Service Nos displayed"); 
                            default-> System.out.println("Invalid option,pick the right option");
                         }
                         }
                         }//loop    
                        case 3 -> {

                            int addName = -1;
                            while(addName != 0000){
                            System.out.println("""
                                Welcome to the Add name bar, Add name displays mesasages direcetly
                                choose the search option below: 
                                    1. Add name
                                Press 0000 to exit
                                """);
                                  addName = collector.nextInt();
                                  switch(addName){
                                  case 1 -> System.out.println("Add name"); 
                                  default-> System.out.println("Invalid option,pick the right option");
                        }
                        }
                        }//loop
                       case 4 -> {
                            int erase = -1;
                            while(erase != 00000) {
                            System.out.println("""
                                Welcome to the Erase bar, Erase displays mesasages direcetly
                                choose the search option below:
                                1. Erase
                                  Press 00000 to exit
                               """);
                                 erase = collector.nextInt();
                                 switch(erase){
                                 case 1 -> System.out.println("Erase"); 
                                 default-> System.out.println("Invalid option,pick the right option");
                        }
                        }
                        }//loop
                        case 5 -> {
                            int edit = -1;
                            while(edit != 01) {
                            System.out.println("""
                                Welcome to the Edit bar, Edit displays mesasages direcetly
                                choose the search option below:
                                    1. Edit
                                Press 01 to exit
                                """);
                                 edit = collector.nextInt();
                                 switch(edit){
                                 case 1 -> System.out.println("Edit");
                                 default-> System.out.println("Invalid option,pick the right option");
                        }
                        }
                        }//loop
                         case 6 -> {
                            int assignTone = -1;
                            while(assignTone != 02) {
                            {System.out.println("""
                                Welcome to the assign tone bar, Assign tone displays mesasages direcetly
                                choose the search option below: 
                                    1. Assign tone
                                 Press 02 to exit
                                """);
                                  assignTone = collector.nextInt();
                                  switch(assignTone){
                                  case 1 -> System.out.println("Assign tone");
                                          default-> System.out.println("Invalid option,pick the right option");
                        }                         
                        }
                        }
                        }

                        case 7 -> {
                            int sendbCards = -1;
                            while(sendbCards  != 03) {
                            System.out.println(""" 
                                Welcome to the edit bar, Send b'card displays mesasages direcetly
                                choose the search option below: 
                                1. Send b'card 
                                 press 03 to exit
                                """);
                                  sendbCards = collector.nextInt();
                                  switch(sendbCards){
                                  case 1 -> System.out.println("Send b'card");
                                  default-> System.out.println("Invalid option,pick the right Send b'card");
                        }
                        }
                        }//loop

                        case 8 -> {
                         int options = -1;
                         while (options != 04){
                         System.out.println("""
        
                           The Option item has 2 sub-options below which displays messages directly 
                           and have no sub-option:
        
                                     1.Type of view
                                     2.Memory status
                                        press 04 to exit

                                    """);
                                  options = collector.nextInt();
                                  switch(options) {
                                  case 1 -> System.out.println("Type of view");
                                  case 2 -> System.out.println("Memory status");
                                  default-> System.out.println("Invalid option,pick the right Send b'card");
                        }
                        }//loop
                        }
                         case 9 -> {
                         int speedDial = -1;
                         while(speedDial  != 05) { 
                         System.out.println("""
                         Welcome to the Speed Dial item, Send b'card displays mesasages direcetly
                         choose the search option below: 
                            1. Speed Dial 
                                
                                    press 05 to exit
                            """);
                                  speedDial = collector.nextInt();
                                  switch(speedDial) {
                                  case 1 -> System.out.println("speedDial");
                                  case 2 -> System.out.println("speedDial");
                                  default-> System.out.println("Invalid option,pick the right Send b'card");
                        }
                        }
                        }//loop
                          case 10-> {
                          int VoiceTagsItem = -1;
                          while(VoiceTagsItem != 06) { 
                          System.out.println("""
                            Welcome to the Voice tags item, Voice tags item displays mesasages direcetly
                            choose the search option below:
                                1.Voice tags item "
                                 
                              press 06 to exit
                            """);

                                   VoiceTagsItem = collector.nextInt();
                                   switch(VoiceTagsItem) {
                                   case 1 -> System.out.println("Voice tags item");
                                   case 2 -> System.out.println("Voice tags item");
                                   default-> System.out.println("Invalid option,pick the right Send b'card");
                        }
                        }
                        }//loop

                default-> System.out.println("Invalid option,pick the any of the displayed options");







            }//phonebook

            }//while loop

            }//caseone





  case 2 -> { 
                        int messages = -1;
                        while(messages != 11) {
                        System.out.println(""" 
                                    Want to send a message?💭️ you're in the right section! 
                                    explore the messaging options below:
                                                1. Write messages💬️
                                                2. Inbox📥️
                                                3. Outbox📤️
                                                4. Picture messages🤳️
                                                5. Templates 🍤️
                                                6. Smileys🤩️
                                                7. Message Setting🪛️
                                                8. Info service📬️
                                                9. Voice mailbox number📮️
                                                10.Service command editor
                                            press 11 to exit

                                    Get on it right away! your loved ones can't wait to hear from you!🥰️ 
                                """);

                     messages = collector.nextInt();  
                     switch(messages){
                              case 1 -> {
                                   int writeMessages = -1;
                                   while(writeMessages  != 12){
                                   System.out.println("""
                                        Write and send a message by clicking on the option below:
                                          1. Write messages
                                        press 12 to exit
                                """);
                                    writeMessages = collector.nextInt();
                                    switch(writeMessages){
                                    case 1 -> System.out.println("Write Messages");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                 }
                                 }
                                 }//loop
                              case 2 -> { 
                                    int  inbox = -1;
                                    while(inbox != 13){
                                    System.out.println("""
                                    Check your inbox by clicking on the option below:
                                            1. Inbox
                                        Press 13 to go exit
                                """);
                                    inbox = collector.nextInt();
                                    switch(inbox){
                                    case 1 -> System.out.println("Inbox");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }
                                }//loop


                               case 3 -> {
                                    int  output = -1;
                                    while(output != 14){
                                    System.out.println(""" 
                                      Access Output📤️ by clicking on the option below:
                                           1. Inbox
                                        Press 14 to go access message-menu
                                    """);
                                    output = collector.nextInt();
                                    switch(output){
                                    case 1 -> System.out.println("output");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }
                                }//loop

                               case 4 -> {
                                    int  pictureMessages = -1;
                                    while(pictureMessages != 15){
                                    System.out.println("""
                                    Send picture messages by clicking on the option below:
                                          1. Inbox
                                        Press 15 to go back to message-menu
                                    """);
                                    pictureMessages = collector.nextInt();
                                    switch(pictureMessages){
                                    case 1 -> System.out.println("pictureMessages");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");

                                }
                                }
                                }//loop
                              case 5 -> {
                                    int  templates = -1;
                                    while(templates != 16){
                                    System.out.println(""" 
                                    Access templates by clicking on the option below:
                                         1. Inbox
                                     Press 16 to go back to message menu
                                   """);
                                    templates = collector.nextInt();
                                    switch(templates){
                                    case 1 -> System.out.println("templates");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }
                                }//loop


                              case 6 -> { 
                                    int  smileys = -1;
                                    while(smileys != 17){
                                    System.out.println(""" 
                                    Access Smileys☺️🥰️🤩️ by clicking on the option below: 
                                         1. Inbox
                                    Press 17 to go back to message-menu
                                   """);
                                    smileys = collector.nextInt();
                                    switch(smileys){
                                    case 1 -> System.out.println("smileys");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
           
                                }
                                }
                                }//loop


                              case 7 -> {
                                    int  messageSettings = -1;
                                    while(messageSettings != 18){
                                    System.out.println(""" 
                                    Welcome to the Message Settings Section, choose any of the option below:

                                            1. Set 1^2
                                            2. Common^3
                                        Press 18 to go back to Messagemenu
                                      """);                              
                                        messageSettings = collector.nextInt();
                                 
                               switch(messageSettings){
                               case 1 -> {
                                     int  set2 = 1;
                                     while(set2 != 19){
                                     System.out.println("""
                                     Connect with the Nokia's center here, by chossing any of the options: below:
                                            1. Message centre number
                                            2. Messages sent as
                                            3. Message validity
                                        Press 19 to go back to message-menu 
                                      """);
                                        set2 = collector.nextInt();
                                    switch(set2){
                                       case 1 -> {
                                            int centerNumber = 1;
                                            while( centerNumber != 20){
                                            System.out.println(""" 
                                            Reach out to the Nokia's message center here, by choosing the option(s) below:
                                                1. Message Center Number
                                             Press 20 to exit
                                         """);
                                           centerNumber = collector.nextInt();
                                            switch(centerNumber){
                                            case 1 -> System.out.print("Message centre number");
                                            default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                         
                                                         }
                                                         }
                                                         }//loop
                                                            
                                         case 2 -> {
                                            int messagesSentas = 1;
                                            while(messagesSentas != 21){
                                            System.out.println(""" 
                                            Tell us how to identify that you reached out to us by choosing the option(s) below:
                                                2. Messages sent as
                                              Press 21 to exit
                                            """);
                                             messagesSentas = collector.nextInt();
                                             switch(messagesSentas){
                                             case 1 -> System.out.print("Messages Sent as");
                                             default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                         }
                                                         }
                                                         }//loop
    
                                          case 3 -> {
                                            int messageValidity = 1;
                                            while(messageValidity != 22){
                                            System.out.println(""" 
                                            Check the validity of message sent by choosing any the option(s) below:
                                                1. Message Validity
                                             Press 22 to exit
                                           """);
                                             messageValidity = collector.nextInt();
                                             switch(messageValidity){
                                             case 1 -> System.out.print("Message Validity");
                                             default -> System.out.println("Invalid input, click on the avalaible option(s)");     
                                                   

                                                         }
                                                         }  
                                                         }//loop                                                               

                                                            default -> System.out.println("Invalid input, click on the avalaible option(s)");                 
                                                        
                                                         }
                                                         }
                                                         }//set2 loop
                                            
                                      case 2 -> {
                                            int common = 1;
                                            while(common != 23){
                                            System.out.println(""" 
                                            Choose the options to access common setting:

                                                 1. Delivery reports
                                                 2. Reply via same centre
                                                 3. Character support
                                                    Press 23 to exit
                                             """ );

                                             common = collector.nextInt();
                                             switch(common){
                                             case 1 -> {
                                                    int delivery  = 1;
                                                    while(delivery != 24){
                                                    System.out.println(""" 
                                                    Send a 📩️Delivery Report, by choosing the option(s) below:
                                                         1. Delivery report 
                                                    Press 24 exit
                                             """);
                                                    delivery = collector.nextInt();
                                                    switch(delivery){
                                                    case 1 -> System.out.print("delivery");
                                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                             }
                                                             }
                                                             }//delivery loop
                                                case 2 -> {
                                                    int reply   = 1;
                                                    while(reply  != 25){
                                                    System.out.println(""" 
                                                    Send a reply to our center here by choosing the option(s) below:
                                                           1. Reply via same centre 
                                                      Press 25 to exit
                                                     """);
                                                    reply = collector.nextInt();
                                                    switch(reply){
                                                    case 1 -> System.out.print("reply");
                                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                               }
                                                               }
                                                               }//loop
                                                                        
                                                  case 3 -> {
                                                    int support   = 1;
                                                    while(support != 26){
                                                    System.out.println(""" 
                                                    Reach out to our support center here by choosing the option(s) below:
                                                            1.Character support
                                                        Press 26 to exit
                                                    """);
                                                    support = collector.nextInt();
                                                    switch(support){
                                                    case 1 -> System.out.print("support");
                                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                                }
                                                                }
                                                                }//loop

                                                                     
                                                    default -> System.out.println("Invalid input, click on the options displayed");
                                            
                                                                }//common loop
                                                                }//system
                                                                }//switch common

                                        }//switch message setting
                                        }//sub case 7
                                        }//while loop

                                                 
                                            case 8 -> {
                                                int infoService  = 1;
                                                while(infoService != 27){
                                                System.out.println(""" 
                                                To receive info service, choose the option(s) below:
                                                    1. Info service
                                                Press 27 to exit
                                                """);
                                                 infoService = collector.nextInt();
                                                 switch(infoService){
                                                 case 1 -> System.out.print("infoService");
                                                 default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                   }
                                                   }
                                                   }//loop





                                             case 9 -> {
                                                int  voiceMailboxNumber  = 1;
                                                while(voiceMailboxNumber != 28){
                                                System.out.println(""" 
                                                To access Nokia's Voice mailbox number, choose the option(s) below:
                                                    1.Voice mailbox number
                                                 Press 28 to exit                    
                                                """);
                                                voiceMailboxNumber = collector.nextInt();
                                                switch(voiceMailboxNumber){
                                                case 1 -> System.out.print("Voice mailbox number");
                                                default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                   }
                                                   }
                                                   }//loop

                                             case 10 -> {
                                                int serviceCommandEditor = 1;
                                                while(serviceCommandEditor != 29){
                                                System.out.println(""" 
                                                To access Nokia's Service command editor, choose the option(s) below:
                                                    1.Service command editor
                                                  Press 29 to exit
                                                 """);
                                                 serviceCommandEditor = collector.nextInt();
                                                 switch(serviceCommandEditor){
                                                 case 1 -> System.out.print("Service command editor");
                                                 default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                   }
                                                   }
                                                   }//loop

                                                 default -> System.out.println("Invalid input, click on the avalaible option(s)");




                                            }//switch messages
                                            }//case 2
                                            }//while loop
                                            



  case 3 -> {
                                    int chat = 1;
                                    while(chat != 30){
                                    System.out.println(""" 
                                    Want to have fun chatting with friends, family and other loved ones? 
                                    Woohoo! Nokia got you covered!📲️🤸‍♀️️ 
                                    choose the option(s) below:
                                             1.Voice mailbox number
                                        Press 30 to exit
                                    """);
                                                
                                     chat = collector.nextInt();
                                     switch(chat){
                                     case 1 -> System.out.print("chat");
                                     default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                           }
                                     //default -> System.out.println("Invalid input, click on the avalaible option(s)");       

                                     
                                           }//case 3
                                           }//loop
                                         




  case 4 -> {
                                    int callRegister = 1;
                                    while(callRegister != 30){
                                    System.out.println(""" 
                                    Access your CALL REGISTER, find missed calls and dialed calls📞️📲️ 
                                                           choose the option(s) below:
                                                            1. Missed calls
                                                            2. Received calls
                                                            3. Dialed numbers
                                                            4. Erase recent call lists
                                                            5. Show call duration
                                                            6. Show call costs
                                                            7. Call cost settings
                                                            8. Prepaid credit
                                                     Press 30 to exit
                                          """);
                                     callRegister = collector.nextInt();
                                     switch(callRegister){
                                           
                                            case 1 -> {

                                                int missedCalls = 1;
                                                while(missedCalls != 31){
                                                System.out.println("""
                                                Check missed calls here, choose the option(s) 
                                                    1. Missed calls
                                                 Press 30 to exit
                                             """);
                                                 missedCalls = collector.nextInt();
                                                 switch(missedCalls){
                                                 case 1 -> System.out.println("Missed Calls");

                                              
                                                    }
                                                    }
                                                    }//loop
                                            case 2 -> {

                                                int receivedCalls = 1;
                                                while(receivedCalls != 31){
                                                System.out.println("""
                                                Check for received calls here, choose the option(s) 
                                                 1. Received calls
                                                Press 31 to exit
                                              """);
                                                receivedCalls = collector.nextInt();
                                                     switch(receivedCalls){
                                                     case 1 -> System.out.println("receivedCalls");

                                                    }
                                                    }
                                                    }//loop

                                            case 3 -> {
                                                int dialedNumbers = 1;
                                                while(dialedNumbers != 5){
                                                System.out.println("""
                                                Check for received calls here, choose the option(s) 
                                                    1. Received calls
                                                Press 5 to exit
                                                """);

                                                dialedNumbers = collector.nextInt();
                                                     switch(dialedNumbers){
                                                     case 1 -> System.out.println("Dialed numbers");

                                                    }
                                                    }
                                                    }//loop

                                            case 4 -> {
                                                int eraseRecentCalls = 1;
                                                while(eraseRecentCalls != 6){
                                                System.out.println("""
                                                Erase recent call lists, choose the option(s)
                                                    1. Erase recent call lists
                                                Press 6 to exit
                                                """);
                                                eraseRecentCalls = collector.nextInt();
                                                switch(eraseRecentCalls){
                                                case 1 -> System.out.println("Erase Recent Calls");

                                                    }
                                                    }
                                                    }//loop

                                            case 5 -> {
                                                int callDuration = 1;
                                                while(callDuration != 7){
                                                System.out.println(""" 
                                                        Erase recent call lists, choose the option(s):
                                                          1. Last call duration
                                                          2. All calls’ duration
                                                          3. Received calls’ duration
                                                          4. Dialled calls’ duration
                                                          5. Clear timers
""");
                                                 callDuration = collector.nextInt();
                                                 switch(callDuration){
                                                       case 1 -> {
                                                            int lastCallDuration = 1;
                                                            while(lastCallDuration != 8){
                                                            System.out.println("""
                                                            To display call duration, choose the option(s) 
                                                                1. Last call duration
                                                              Press 8 to exit
                                                            """);
                                                            lastCallDuration = collector.nextInt();
                                                            switch(lastCallDuration){
                                                            case 1 -> System.out.println("Last Call Duration");
                                                            
                                                        }
                                                        }
                                                        }//loop
                                                       case 2 -> {
                                                            int allCallDuration = 1;
                                                            while(allCallDuration != 9){
                                                            System.out.println("""
                                                            To  All calls’ duration, choose the option(s) 
                                                                 1. All calls’ duration
                                                                Prss 9 o exit
                                                            """);
                                                            allCallDuration = collector.nextInt();
                                                            switch(allCallDuration){
                                                            case 1 -> System.out.println(" All calls’ duration");
                                                            
                                                        }
                                                        }
                                                        }//loop
                                                       case 3 -> {   
                                                            int receivedCallDuration = 1;
                                                            while(receivedCallDuration != 10){
                                                            System.out.println("""
                                                            To know Received calls’ duration, choose the option(s) 
                                                                 1.Received calls’ duration
                                                            Press 10 to exit
                                                            Press 
                                                            """);
                                                            receivedCallDuration = collector.nextInt();
                                                            switch(receivedCallDuration){
                                                                case 1 -> System.out.println(" Received calls’ duration");
                                                                
                                                        }
                                                        }
                                                        }//loop
                                                    
                                                        case 4 -> {
                                                            int dialedCallDuration = 1;
                                                            while(dialedCallDuration != 11){
                                                            System.out.println("""
                                                            To know Dialled calls’ duration, choose the option(s) 
                                                                 1.Dialled calls’ duration
                                                                Press 11 to exit
                                                            """);
                                                            dialedCallDuration = collector.nextInt();
                                                            switch(dialedCallDuration){
                                                            case 1 -> System.out.println(" Dialled calls’ duration");
                                                            
                                                        }
                                                        }
                                                        }//loop

                                                        case 5 -> {
                                                            int dialedCallDuration = 1;
                                                            while(dialedCallDuration != 12){
                                                            System.out.println("""
                                                            To Clear timers, choose the option(s) 
                                                                1.Dialled calls’ duration
                                                                Press 12 to exit
                                                            """);
                                                            dialedCallDuration = collector.nextInt();
                                                            switch(dialedCallDuration){
                                                            case 1 -> System.out.println(" Dialled calls’ duration");
                                                            
                                                        }
                                                        }
                                                        }//loop
                                    }//switch erase  
                                    }//case sub 5
                                    }//loop
                                                    
                                        
                                          case 6 -> {

                                                    int cost = 1;
                                                    while(cost != 12){
                                                    System.out.println(""" 
                                                            💰️Want to know how much your calls cost? recent call lists,
                                                              choose any option that suits you:
                                                                1. Last call cost
                                                                2. All calls’ cost
                                                                3. Clear counters
                                                            Press 12 To exit
                                                     """);    
                                                        cost = collector.nextInt();
                                                        switch(cost){
                                                         case 1 -> {
                                                                int lastcost = 1;
                                                                while(lastcost != 2){
                                                                System.out.println("""
                                                                To display last call cost, choose the option(s) 
                                                                    1. Last call cost
                                                                   Press 2 to exit
                                                                """);
                                                                 lastcost = collector.nextInt();
                                                                 switch(lastcost){
                                                                 case 1 -> System.out.println("Last Call Cost");
                                                          
                                                            }
                                                            }
                                                            }//loop
                                                    
                                                         
                                                         case 2 -> {
                                                                int allCallCost = 1;
                                                                while(allCallCost != 3){
                                                                System.out.println("""
                                                                To know All calls’ Cost, choose the option(s)
                                                                 2. All Call's Cost"
                                                                Press 3 to exit
                                                              """);
                                                                allCallCost = collector.nextInt();
                                                                switch(allCallCost){
                                                                case 1 -> System.out.println(" All Calls’ Cost");
                                                            
                                                            }
                                                            }
                                                            }//loop
                                                         case 3 -> {
                                                                int clearCounters = 1;
                                                                while(clearCounters != 4){
                                                                System.out.println("""
                                                                To Clear counters, choose the option(s) 
                                                                    1.Clear counters
                                                                  Press 4 to exit
                                                              """);
                                                                clearCounters = collector.nextInt();
                                                                switch(clearCounters){
                                                                case 1 -> System.out.println("Clear counters");
                                                            
                                                            }
                                                            }
                                                            }//loop

                                      //default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                                
                                                    
                                                }//switch cost
                                                }//case sub 6
                                                }//loop



                                              case 7 -> {
                                                        int costSetting = 1;
                                                        while(costSetting != 13){
                                                        System.out.println(""" 
                                                            💰️For call cost setting,choose any option that suits you:
                                                                1. Call cost limit
                                                                2. Show costs in
                                                            Press 13 to exit
                                                      """);    
                                                        costSetting = collector.nextInt();
                                                        switch(costSetting){
                                                        case 1 -> {

                                                                int costLimit = 1;
                                                                while(costLimit != 2){
                                                                System.out.println("""
                                                                To display Call cost limit, choose the option(s)
                                                                    1. Call cost limit
                                                                Press 2 to exit
                                                                """);            
                                                                costLimit = collector.nextInt();
                                                                switch(costLimit){
                                                                  case 1 -> System.out.println("Call cost limit");
                                                              
                                                        }
                                                        }
                                                        }//loop
                                                    
                                                         
                                                         case 2 -> {
                                                                int  callCostIn = 1;
                                                                while(callCostIn != 3){
                                                                System.out.println("""
                                                                To Show costs in, choose the option(s) 
                                                                    2. Show costs in
                                                                  Press 3 to exit
                                                                """);
                                                                                                                 
                                                                callCostIn = collector.nextInt();
                                                                switch(callCostIn){
                                                                case 1 -> System.out.println("Show costs in");
                                                            
                                                        }
                                                        }
                                                        }//loop

                                                }//switch call setting
                                                }//case sub 7
                                                }//loop



                                                 case 8 -> {

                                                    int preparedCredit  = 1;
                                                    while(preparedCredit  != 4){
                                                    System.out.println(""" 
                                                     You have reached the prepared credit section! 
                                                     Nokia got your prepared credit covered!📲️🤸‍♀️️ 
                                                           choose the option(s) below:
                                                           1.prepared credit 
                                                        Press 4 to exit
                                                                     """);
                                                
                                                    preparedCredit = collector.nextInt();
                                                    switch(preparedCredit){
                                                    case 1 -> System.out.println("prepared credit");
                                                    //default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                      }
                                                      }//loop
                                                      }//case 8
                                            }//switch Register                                                       
                                            }//case 4
                                            }//loop 4
                                            //case 5 begins here


  



    case 5 -> {System.out.println(""" 
                                    Do you want to CUSTOMIZE your phone to suit you? want your VOLUME, CALL TONES and GRAPHICS show your style? \n choose an option right away!!📞️📲️ 
                                              choose the option(s) below:
                                                        1. Ringing tone
                                                        2. Ringing volume
                                                        3. Incoming call alert
                                                        4. Composer
                                                        5. Message alert tone
                                                        6. Keypad tones
                                                        7. Warning and game tones
                                                        8. Vibrating alert
                                                        9. Screen saver
                                          """);



                     int tones = collector.nextInt(); 
                       
                     switch(tones){
                              case 1 -> {System.out.println(" Change your Ringing Tone by clicking on the option below: \n 1.  Ringing Tone");
                                    int ringingTones = collector.nextInt();
                                    switch(ringingTones){
                                    case 1 -> System.out.println(" Ringing Tone");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                 }
                                 }
                              case 2 -> {System.out.println(" Adjust your Ringing volume by clicking on the option below: \n 1. Ringing volume");
                                    int volume = collector.nextInt();
                                    switch(volume){
                                    case 1 -> System.out.println("Ringing volume");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }


                               case 3 -> {System.out.println(" want to receive Incoming call alert? choose from the option below: \n 1.Incoming call alert");
                                    int callAlert = collector.nextInt();
                                    switch(callAlert){
                                    case 1 -> System.out.println("Incoming call alert");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }

                               case 4 -> {System.out.println("  Access Composer by clicking on the option below: \n 1.  Composer");
                                    int composer = collector.nextInt();
                                    switch(composer){
                                    case 1 -> System.out.println("Composer");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");

                                }
                                }
                              case 5 -> {System.out.println(" set your phone to receive Message alert tone by clicking on the option below: \n 1. Message alert tone");
                                    int alertTone = collector.nextInt();
                                    switch(alertTone){
                                    case 1 -> System.out.println("Message alert tone set!");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }


                              case 6 -> {System.out.println(" set your phone to have Keypad tones by clicking on the option below: \n 1. Keypad tones");
                                    int keypadTone = collector.nextInt();
                                    switch(keypadTone){
                                    case 1 -> System.out.println("Keypad tones set!");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
           
                                }
                                }
                              case 7 -> {System.out.println(" Show ⚠️Warning and 🎮️game tones by clicking on the option below: \n 1.  Warning and game tones");
                                    int warningGameTone = collector.nextInt();
                                    switch(warningGameTone){
                                    case 1 -> System.out.println(" Warning and game tones set!");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                }
                                }


                              case 8 -> {System.out.println(" set your phone to Vibrating alert by clicking on the option below: \n 1. Vibrating alert");
                                    int vibratingAlert = collector.nextInt();
                                    switch(vibratingAlert){
                                    case 1 -> System.out.println("Vibrating alert set");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
           
                                }
                                }
                              case 9 -> {System.out.println(" want your favorite picture to be your Screen saver?🙋‍♀️️ choose the option below: \n 1. Screen saver");
                                    int screenSaver = collector.nextInt();
                                    switch(screenSaver){
                                    case 1 -> System.out.println("Screen saver set");
                                    default -> System.out.println("Invalid input, click on the avalaible option(s)");
           
                                }
                                }




                          }//switch tones           
                          }//CASE 5


 //case 6 starts here
         


      case 6 -> {System.out.println(""" 
                                    adjust your phone Settings here \n choose an option to get started📞️📲️ 
                                              :
                                                        1. Call settings
                                                        2. Phone settings
                                                        3. Security settings
                                                        4. Restore factory settings
                                                        
                                          """);
                     int setting = collector.nextInt(); 
                       
                     switch(setting){
                              case 1 -> {System.out.println(""" 
                                    adjust your CALL SETTING here \n explore the options below: 📞️📲️ 
                                              :
                                                        1. Automatic redial
                                                        2. Speed dialling
                                                        3. Call waiting options
                                                        4. Own number sending
                                                        5. Phone line in use
                                                        6. Automatic answer 
                                                        
                                          """);
                                  
                                           int callSetting = collector.nextInt();
                                                        switch(callSetting){
                                                           case 1 -> {System.out.println("To use Automatic redial, choose the option(s) \n 1. Automatic redial");
                                                               int automaticRedial = collector.nextInt();
                                                                switch(automaticRedial){
                                                                  case 1 -> System.out.println("Automatic redial");
                                                          
                                                    }
                                                    }
                                                    
                                                         
                                                         case 2 -> {System.out.println("To use Speed dialling as a feature, choose the option(s) below: \n 1. Speed dialling");
                                                         int speedDialling = collector.nextInt();
                                                            switch(speedDialling){
                                                                case 1 -> System.out.println("Speed dialling");
                                                            
                                                    }
                                                    }

                 
                                                         case 3 -> {System.out.println("To access Call waiting options as a feature, choose the option(s) below: \n 1. Call waiting options");
                                                         int callWaitingOptions = collector.nextInt();
                                                            switch(callWaitingOptions){
                                                                case 1 -> System.out.println("Call waiting options");
                                                            
                                                    }
                                                    }

                                                         case 4 -> {System.out.println("To access  'Own number sending' as a feature, choose the option(s) below: \n 1.  Own number sending");
                                                         int ownNumber = collector.nextInt();
                                                            switch(ownNumber){
                                                                case 1 -> System.out.println(" Own number sending");
                                                            
                                                    }
                                                    }
                                                        case 5 -> {System.out.println("To access  'Phone line in use' as a feature, choose the option(s) below: \n 1.  Phone line in use");
                                                         int lineInUse = collector.nextInt();
                                                            switch(lineInUse){
                                                                case 1 -> System.out.println("Phone line in use set!");
                                                            
                                                    }
                                                    }
                                                        case 6 -> {System.out.println("To access  'Automatic answer' as a feature, choose the option(s) below: \n 1.   Automatic answer");
                                                         int automaticAnswer = collector.nextInt();
                                                            switch(automaticAnswer){
                                                                case 1 -> System.out.println(" Automatic answer set!");
                                                            
                                                    }
                                                    }



                                                 }//case 1 under switch setting

                                                }//switch call setting

                                                case 2 -> {System.out.println(""" 
                                                      adjust your PHONE SETTING here \n explore the options below: 📞️📲️ 
                                              :
                                                        1. Language
                                                        2. Cell info display
                                                        3. Welcome note
                                                        4. Network selection
                                                        5. Lights 2
                                                        6. Confirm SIM service action
                                                                                                                
                                          """);
                                  
                                           int phoneSetting = collector.nextInt();
                                                        switch(phoneSetting){
                                                           case 1 -> {System.out.println("To change Language, choose the option(s) below: \n 1. Language");
                                                               int language = collector.nextInt();
                                                                switch( language){
                                                                  case 1 -> System.out.println("Language");
                                                          
                                                    }
                                                    }
                                                    
                                                         
                                                         case 2 -> {System.out.println("To use Cell info display as a feature, choose the option(s) below: \n 1. Cell info display");
                                                         int cellInfoDisplay = collector.nextInt();
                                                            switch(cellInfoDisplay){
                                                                case 1 -> System.out.println("Cell info display");
                                                            
                                                    }
                                                    }

                 
                                                         case 3 -> {System.out.println("To access Welcome note options as a feature, choose the option(s) below: \n 1. Welcome note");
                                                         int callWaitingOptions = collector.nextInt();
                                                            switch(callWaitingOptions){
                                                                case 1 -> System.out.println("Welcome note");
                                                            
                                                    }
                                                    }

                                                         case 4 -> {System.out.println("To access  'Network selection' as a feature, choose the option(s) below: \n 1.  Network selection");
                                                         int networkSelection = collector.nextInt();
                                                            switch( networkSelection){
                                                                case 1 -> System.out.println(" Own number sending");
                                                            
                                                    }
                                                    }
                                                        case 5 -> {System.out.println("To adjust Lights and brightness, choose the option(s) below: \n 1.  Lights 2");
                                                         int light = collector.nextInt();
                                                            switch(light){
                                                                case 1 -> System.out.println("Lights set!");
                                                            
                                                    }
                                                    }
                                                        case 6 -> {System.out.println("To Confirm SIM service action choose the option(s) below: \n 1. Confirm SIM service action");
                                                         int confirmSim = collector.nextInt();
                                                            switch(confirmSim){
                                                                case 1 -> System.out.println(" Confirm SIM service action");
                                                            
                                                    }
                                                    }
                                                }//case 1 phone setting

                                                }//switch phone  setting


                                       case 3 -> {System.out.println(""" 
                                                      adjust your SECURITY SETTING here \n explore the options below: 📞️📲️ 
                                              :
                                                        1. PIN code request
                                                        2. Call barring service
                                                        3. Fixed dialling
                                                        4. Closed user group
                                                        5. Phone security
                                                        6. Change access codes                          
                                          """);
                                  
                                           int securitySetting = collector.nextInt();
                                                        switch(securitySetting){
                                                           case 1 -> {System.out.println("To use  Call barring service, choose the option(s) below: \n 1. Call barring service");
                                                               int pinCodeRequest = collector.nextInt();
                                                                switch(pinCodeRequest){
                                                                  case 1 -> System.out.println("PIN code request");
                                                          
                                                    }
                                                    }
                                                    
                                                         
                                                         case 2 -> {System.out.println("To use Cell info display as a feature, choose the option(s) below: \n 1. Call barring service");
                                                         int callBarring = collector.nextInt();
                                                            switch(callBarring){
                                                                case 1 -> System.out.println("Call barring service");
                                                            
                                                    }
                                                    }

                 
                                                         case 3 -> {System.out.println("To access Fixed dialling feature, choose the option(s) below: \n 1. Fixed dialling");
                                                         int fixedDialing = collector.nextInt();
                                                            switch(fixedDialing){
                                                                case 1 -> System.out.println("Fixed dialling");
                                                            
                                                    }
                                                    }

                                                        case 4 -> {System.out.println("To access Closed user group feature, choose the option(s) below: \n 1. Closed user group");
                                                         int closedUserGroup = collector.nextInt();
                                                            switch(closedUserGroup){
                                                                case 1 -> System.out.println("Closed user group");
                                                            
                                                    }
                                                    }
                                                        case 5 -> {System.out.println("To  Phone security, choose the option(s) below: \n 1. Phone security ");
                                                         int phoneSecurity = collector.nextInt();
                                                            switch(phoneSecurity){
                                                                case 1 -> System.out.println("Phone security");
                                                            
                                                    }
                                                    }
                                                       case 6 -> {System.out.println("To  Change access codes , choose the option(s) below: \n 1. Change access codes ");
                                                         int accessCodes = collector.nextInt();
                                                            switch(accessCodes){
                                                                case 1 -> System.out.println("Change access codes");
                                                    }
                                                    }
                                                }//case 3 security setting

                                                }//switch security setting


                                    case 4 -> {System.out.println("To Restore Factory Setting, choose the option(s) below: \n 1. Restore Factory Setting");
                                                         int factorySetting = collector.nextInt();
                                                            switch(factorySetting){
                                                                case 1 -> System.out.println("Restore Factory Setting restored");
                                            }//switch factorysetting
                                            }//case 4 factory setting

   
                                        }//switch setting
                                   }//case 6

       case 7 -> {System.out.println("To divert calls, choose the option(s) below: \n 1. Divert Calls");
                                                         int divertCalls = collector.nextInt();
                                                            switch(divertCalls){
                                                                case 1 -> System.out.println("Divert Calls");
                                            }//switch divert calls
                                            }//case 7 DIVERTCALLS

       case 8 -> {System.out.println("🎮️🎲️🏓️ To play your favorite GAMES, choose the option(s) below: \n 1.GAMES");
                                                         int games = collector.nextInt();
                                                            switch(games){
                                                                case 1 -> System.out.println("GAMES");
                                            }//switch for games
                                            }//case 8 Games

       case 9 -> {System.out.println("🎮️To use the CALULATION, choose the option(s) below: \n 1. Calculator");
                                                         int calculation = collector.nextInt();
                                                            switch(calculation){
                                                                case 1 -> System.out.println("CALULATION");
                                            }//switch for games
                                            }//case 9 Calculation

       case  10 -> {System.out.println("⏰️To set REMINDERS, explore the option(s) below: \n 1. REMINDERS");
                                                         int reminders = collector.nextInt();
                                                            switch(reminders){
                                                                case 1 -> System.out.println("REMINDERS");
                                            }//switch for REMINDERS
                                            }//case 10 REMINDERS

       case 11 -> {System.out.println (""" 

                        🕣️ 🕰️TIME IS MONEY! set your CLOCK; yy/mm/dd, alarm, stopwatch and others! by exploring the options below:

                                    1. Alarm clock
                                    2. Clock settings
                                    3. Date setting
                                    4. Stopwatch
                                    5. Countdown timer
                                    6. Auto update of date and time """);
                          int clock = collector.nextInt();
                                                        switch(clock){
                                                           case 1 -> {System.out.println("To set Alarm clock, choose the option(s) below: \n 1. Alarm clock");
                                                               int alarmClock = collector.nextInt();
                                                                switch(alarmClock){
                                                                  case 1 -> System.out.println("Alarm clock");
                                                         
                                                    }
                                                    }
                                                    
                                                         
                                                         case 2 -> {System.out.println("To set your clock, use the Clock settings feature; choose the option(s) below: \n 1. Clock settings");
                                                         int clockSettings = collector.nextInt();
                                                            switch(clockSettings){
                                                                case 1 -> System.out.println(" Clock settings");
                                                            
                                                    }
                                                    }

                 
                                                         case 3 -> {System.out.println("use the Date setting feature to manually adjust date and time to reflect your location, choose the option(s) below: \n 1. Date setting");
                                                         int dateSetting = collector.nextInt();
                                                            switch(dateSetting){
                                                                case 1 -> System.out.println("Date setting");
                                                            
                                                   
                                                      }
                                                      }

                                                        case 4 -> {System.out.println("To access Stopwatch, choose the option(s) below: \n 1. Stopwatch");
                                                         int stopwatch = collector.nextInt();
                                                            switch(stopwatch){
                                                                case 1 -> System.out.println("Stopwatch");
                                                            
                                                    }
                                                    }
                                                        case 5 -> {System.out.println("To use Countdown timer, choose the option(s) below: \n 1.Countdown timer");
                                                         int countdownTimer = collector.nextInt();
                                                            switch(countdownTimer){
                                                                case 1 -> System.out.println("Countdown timer");
                                                            
                                                    }
                                                    }
                                                        case 6 -> {System.out.println("To automatically adjust dtate and time, choose the option(s) below: \n 1.Auto update of date and time");
                                                         int autoUpdateOfDateAndTime = collector.nextInt();
                                                            switch(autoUpdateOfDateAndTime){
                                                                case 1 -> System.out.println("Auto update of date and time");
                                                            
                                                    }
                                                    }

                                             }//switch for CLOCK
                                            }//case 11 CLOCK

// case 12 starts here

        case 12 -> {
                int profiles = 1;
                while(profiles != 8){
                System.out.println("""
                To set Profiles, choose the option(s) below: 
                    1. Profiles
                 Press 8 to exit
                """);
                profiles = collector.nextInt();
                switch(profiles){
                case 1 -> System.out.println("Profiles");
            }//case 12
            }// switch profiles in case 12
            }//loop

// case 13 starts here

        case 13 -> {
                int simServices = 1;
                while(simServices!= 9){
                System.out.println("""
                To get access SIM Services, choose the option(s) below: 
                 1. SIM Services
                Press 9 to exit
                """);
                simServices = collector.nextInt();
                switch(simServices){
                case 1 -> System.out.println("SIM Services");
            }//case 13
            }// switch profiles in case 13
            }//loop


}//main/first switch



}//menuOptions
}//method
} //class



                            




//the case brace covers everyother print out under case 1 and the same apllies to all other cases and sub underneath them
// If a nested switch case is more than one,


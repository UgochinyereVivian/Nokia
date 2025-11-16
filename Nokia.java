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
                                                8. Info service📬️
                                                9. Voice mailbox number📮️
                                                10.Service command editor

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
                                            
                                                case 2 -> {System.out.println(""" 
                                                            Choose the options to access common setting:

                                                                                1. Delivery reports
                                                                                2. Reply via same centre
                                                                                3. Character support
                                                            """ );
                                                                    int common = collector.nextInt();
                                                                    switch(common){
                                                                        case 1 -> {System.out.println(""" 
                                                                                        Send a 📩️Delivery Report, by choosing the option(s) below:
                                                                                                            1. Delivery report 
                                                                     """);
                                                                    int delivery = collector.nextInt();
                                                                      switch(delivery){
                                                                        case 1 -> System.out.print("delivery");
                                                                          default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                                     }
                                                                     }
                                                                        case 2 -> {System.out.println(""" 
                                                                                        Send a reply to our center here by choosing the option(s) below:
                                                                                                            1. Reply via same centre 
                                                                     """);
                                                                    int reply = collector.nextInt();
                                                                      switch(reply){
                                                                        case 1 -> System.out.print("reply");
                                                                          default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                                     }
                                                                     }
                                                                        
                                                                        case 3 -> {System.out.println(""" 
                                                                                        Reach out to our support center here by choosing the option(s) below:
                                                                                                            1.Character support
                                                                     """);
                                                                    int support = collector.nextInt();
                                                                      switch(support){
                                                                        case 1 -> System.out.print("support");
                                                                          default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                                     }
                                                                     }

                                                                     
                                                                      default -> System.out.println("Invalid input, click on the options displayed");
                                            
                                                                }//system
                                                                }//switch common
}//switch message setting
}//sub case 7

                                                 
                                                  case 8 -> {System.out.println(""" 
                                                                                 To receive info service, choose the option(s) below:
                                                                                                     1. Info service
                                                                     """);
                                                                    int infoService = collector.nextInt();
                                                                      switch(infoService){
                                                                        case 1 -> System.out.print("infoService");
                                                                          default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                   }
                                                   }




                                                  case 9 -> {System.out.println(""" 
                                                                                 FOR access to Nokia's Voice mailbox number, choose the option(s) below:
                                                                                                     1.Voice mailbox number
                                                                     """);
                                                                    int infoService = collector.nextInt();
                                                                      switch(infoService){
                                                                        case 1 -> System.out.print("Voice mailbox number");
                                                                          default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                   }
                                                   }

                                                  case 10 -> {System.out.println(""" 
                                                                                 FOR access to Nokia's Service command editor, choose the option(s) below:
                                                                                                     1.Service command editor
                                                                     """);
                                                                    int serviceCommandEditor = collector.nextInt();
                                                                      switch(serviceCommandEditor){
                                                                        case 1 -> System.out.print("Service command editor");
                                                                          default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                   }
                                                   }

                                                 default -> System.out.println("Invalid input, click on the avalaible option(s)");




                                            }//switch messages
                                            }   //case 2



            case 3 -> {System.out.println(""" 
                                              want to have fun chatting with friends, family and other loved ones? woohoo! Nokia got you covered!📲️🤸‍♀️️ 
                                                           choose the option(s) below:
                                                           1.Voice mailbox number
                                                                     """);
                                                
                                              int chat = collector.nextInt();
                                                    switch(chat){
                                                    case 1 -> System.out.print("chat");
                                                    //default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                              }
                                              

                                       //default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                         }//case 3
                                         




           case 4 -> {System.out.println(""" 
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
                                          """);
                                         int callRegister = collector.nextInt();
                                         switch(callRegister){
                                            case 1 -> {System.out.println("Check for missed calls here, choose the option(s) \n 1. Missed calls");
                                                 int missedCalls = collector.nextInt();
                                                     switch(missedCalls){
                                                     case 1 -> {System.out.println("Missed Calls");

                                                    }
                                                    }
                                                    }
                                            case 2 -> {System.out.println("Check for received calls here, choose the option(s) \n 1. Received calls");
                                                 int receivedCalls = collector.nextInt();
                                                     switch(receivedCalls){
                                                     case 1 -> {System.out.println("receivedCalls");

                                                    }
                                                    }
                                                    }

                                            case 3 -> {System.out.println("Check for received calls here, choose the option(s) \n 1. Received calls");
                                                 int dialedNumbers = collector.nextInt();
                                                     switch(dialedNumbers){
                                                     case 1 -> {System.out.println("Dialed numbers");

                                                    }
                                                    }
                                                    }
                                            case 4 -> {System.out.println("Erase recent call lists, choose the option(s) \n 1. Erase recent call lists");
                                                 int eraseRecentCalls = collector.nextInt();
                                                     switch(eraseRecentCalls){
                                                        case 1 -> {System.out.println("Erase Recent Calls");

                                                    }
                                                    }
                                                    }

                                            case 5 -> {System.out.println(""" 
                                                        Erase recent call lists, choose the option(s):
                                                          1. Last call duration
                                                          2. All calls’ duration
                                                          3. Received calls’ duration
                                                          4. Dialled calls’ duration
                                                          5. Clear timers
""");
                                                 int erase = collector.nextInt();
                                                     switch(erase){
                                                       case 1 -> {System.out.println("To display call duration, choose the option(s) \n 1. Last call duration");
                                                         int lastCallDuration = collector.nextInt();
                                                            switch(lastCallDuration){
                                                                case 1 -> System.out.println("Last Call Duration");
                                                            
                                                    }
                                                    }
                                                       case 2 -> {System.out.println("To  All calls’ duration, choose the option(s) \n 1. All calls’ duration");
                                                         int allCallDuration = collector.nextInt();
                                                            switch(allCallDuration){
                                                                case 1 -> System.out.println(" All calls’ duration");
                                                            
                                                    }
                                                    }
                                                       case 3 -> {System.out.println("To know Received calls’ duration, choose the option(s) \n 1.Received calls’ duration");
                                                         int receivedCallDuration = collector.nextInt();
                                                            switch(receivedCallDuration){
                                                                case 1 -> System.out.println(" Received calls’ duration");
                                                            
                                                    }
                                                    }
                                                    
                                                        case 4 -> {System.out.println("To know Dialled calls’ duration, choose the option(s) \n 1.Dialled calls’ duration");
                                                         int dialedCallDuration = collector.nextInt();
                                                            switch(dialedCallDuration){
                                                                case 1 -> System.out.println(" Dialled calls’ duration");
                                                            
                                                    }
                                                    }

                                                        case 5 -> {System.out.println("To Clear timers, choose the option(s) \n 1.Dialled calls’ duration");
                                                         int dialedCallDuration = collector.nextInt();
                                                            switch(dialedCallDuration){
                                                                case 1 -> System.out.println(" Dialled calls’ duration");
                                                            
                                                    }
                                                    }
                                    }//switch erase  
                                    }//case sub 5
                                                    
                                        
                                          case 6 -> {System.out.println(""" 
                                                            💰️Want to know how much your calls cost? recent call lists,choose any option that suits you:
                                                                1. Last call cost
                                                                2. All calls’ cost
                                                                3. Clear counters
                                                """);    
                                                        int cost = collector.nextInt();
                                                        switch(cost){
                                                           case 1 -> {System.out.println("To display last call cost, choose the option(s) \n 1. Last call cost");
                                                               int lastcost = collector.nextInt();
                                                                switch(lastcost){
                                                                  case 1 -> System.out.println("Last Call Cost");
                                                          
                                                    }
                                                    }
                                                    
                                                         
                                                         case 2 -> {System.out.println("To know All calls’ Cost, choose the option(s) \n 2. All Call's Cost");
                                                         int allCallCost = collector.nextInt();
                                                            switch(allCallCost){
                                                                case 1 -> System.out.println(" All Calls’ Cost");
                                                            
                                                    }
                                                    }
                                                         case 3 -> {System.out.println("To Clear counters, choose the option(s) \n 1.Clear counters");
                                                         int clearCounters = collector.nextInt();
                                                            switch(clearCounters){
                                                                case 1 -> System.out.println("Clear counters");
                                                            
                                                    }
                                                    }

                                      //default -> System.out.println("Invalid input, click on the avalaible option(s)");
                                                                
                                                    
}//switch cost
}//case sub 6



                                              case 7 -> {System.out.println(""" 
                                                            💰️For call cost setting,choose any option that suits you:
                                                                1. Call cost limit
                                                                2. Show costs in
                                                """);    
                                                        int costSetting = collector.nextInt();
                                                        switch(costSetting){
                                                           case 1 -> {System.out.println("To display Call cost limit, choose the option(s) \n 1. Call cost limit");
                                                               int costLimit = collector.nextInt();
                                                                switch(costLimit){
                                                                  case 1 -> System.out.println("Call cost limit");
                                                          
                                                    }
                                                    }
                                                    
                                                         
                                                         case 2 -> {System.out.println("To Show costs in, choose the option(s) \n 2. Show costs in");
                                                         int callCostIn = collector.nextInt();
                                                            switch(callCostIn){
                                                                case 1 -> System.out.println("Show costs in");
                                                            
                                                    }
                                                    }


                                                }//switch call setting
                                                }//case sub 7
}//switch Register                                                       
}//case 4
//
//





                                         
                                      //  }
 
                                   //}

}//menuOptions
}//method
} //class



                            




//the case brace covers everyother print out under case 1 and the same apllies to all other cases and sub underneath them
// If a nested switch case is more than one,


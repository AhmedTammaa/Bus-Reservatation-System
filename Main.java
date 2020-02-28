import java.io.*;
import java.util.Scanner;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
public class Main 
{
       public static String Destination(int c){
       switch(c)
               {
           case 1:
               return "Alexandria";
           case 2:
               return "Sharm El-Sheikh";
           case 3:
               return "Dahab";    
           case 4:
               return "Hurghada";
            default:
               return "Aswan";         
                }
        }
    
    
       
       
       public static void AddressMenuDisplay(){
            System.out.println("Enter the location");
            System.out.println("1. Alexandria");
            System.out.println("2. Sharm El-Sheikh");
            System.out.println("3. Dahab");
            System.out.println("4. Hurghada");
            System.out.println("5. Aswan");
       }
       
    public static void Login() throws IOException
    {
             Passenger passenger = new Passenger();
             Scanner scan = new Scanner (System.in); 
             Ticket ticket;
            try{
                FileWriter fstream = new FileWriter("Data.txt");
                    try (BufferedWriter out = new BufferedWriter(fstream)) {
                        
                        System.out.println("Enter User name: ");
                        String user_name = scan.nextLine();
                        passenger.setUsername(user_name);
                        
                        System.out.println("Enter Password: ");
                        String password = scan.nextLine();
                        passenger.setPassword(password);
                        /*
                        if ("admin".equals(user_name) && "1234".equals(password))
                        {
                            Admin();
                        }else{
                            AddressMenuDisplay();
                        }*/
                        
                        if("abdo".equals(user_name) && "12345".equals(password)){
                            System.out.println("Login Successfully...");
                            AddressMenuDisplay();
                        }else {
                            System.out.println("Login Failed...");
                            return;
                        }
                        
                        int menu_choice = scan.nextInt();
                        
                        String destination = Destination(menu_choice);
                    
                    ticket.setDestination(destination);
                        
                        System.out.println("Enter the date: ");
                        String date_of_arriving = scan.nextLine();
                        ticket.setDateOfLeaving(date_of_arriving);
                        passenger.bookingDetails();
                }
        }
            catch (IOException e)
            {
                System.err.println("Error: " + e.getMessage());
            } 
}
    

    public static void Register() throws IOException 
    {
        Scanner scan = new Scanner (System.in); 
        Ticket ticket = new Ticket();
        
        
            //try{
                //FileOutputStream database = new FileOutputStream("Data.txt");
                //ObjectOutputStream object_ostream = new ObjectOutputStream(database);
               // for(int i = 0; i < 50; i++){
                    
                    System.out.println("Enter your credit card: ");
                    long cc = scan.nextLong();
                    scan.skip("\n");
                    
                    System.out.println("Enter the First name: ");
                    String fname = scan.nextLine();
                    
                    System.out.println("Enter the Last name: ");
                    String lname = scan.nextLine();
                    
                    System.out.println("Enter your mail: ");
                    String mail = scan.nextLine();
                    
                    System.out.println("Enter your Phone number: ");
                    String phone = scan.nextLine();
                    
                    System.out.println("Enter your User name: ");
                    String username = scan.nextLine();
                    
                    System.out.println("Enter your Password: ");
                    String password = scan.nextLine();
                    
                    System.out.println("Enter your national id: ");
                    long ssn = scan.nextLong();
                    
                    System.out.println("Enter your age: ");
                    int age = scan.nextInt();
                    
                    AddressMenuDisplay();
                   
                    int menu_choice = scan.nextInt();
                        
                    String destination = Destination(menu_choice);
                    ticket.setDestination(destination);

                    Passenger passenger = new Passenger(cc, fname, lname, mail, phone, ssn, age, username, password, destination);
                    
                    //object_ostream.writeObject(passanger);
                    
                //} //object_ostream.close();
            
        }
            /*catch (IOException e) 
            {
                  System.err.println("Error: " + e.getMessage());
            } */      
   /* 
    public static void Admin()
    {
        Admin A = new Admin();
        A.status();
    }
    */
    public static void main(String[] args) throws Exception
    {
        
        Scanner scan = new Scanner (System.in); 
        System.out.println("1. Login ");
        System.out.println("2. Resgister ");
        int c = scan.nextInt();
        if(c == 1){
            //note: login can be vertified by creating an array of passengers, but for simplisity reasons it will be left out until we build a DB. 
            Login();
        }
        else{
            Register();
        }  
        //this object will be created normally;
        Bus b = new Bus(20,"Helwan");
        Bus b2 = new Bus(201);
        //this object will throw exception because the id is exist;
        Bus b3 = new Bus(201);
    }   
}

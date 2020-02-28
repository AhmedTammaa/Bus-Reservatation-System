import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Admin extends Person 
{
	private int incomeOfTheDay;
	Person person;
	Bus B;
        Ticket ticket;      
        Passenger passenger[] = new Passenger[50];
        
        Admin() 
         {
             incomeOfTheDay = 0;
         }
	
	 Admin(int iOTD,String f , String l, String mai,String phn,int ni, int Age)
        {
            incomeOfTheDay = iOTD;
            person.fname = f;
            person.lname = l;
            person.mail = mai;
            person.phone_number = phn;
            person.national_id = ni;
            person.age = Age;
	}
         
	public void ChangeFname(String newFname)
        {
            person.setFname(newFname);
        }
        public void ChangeLname(String newLname)
        {
            person.setLname(newLname);
        }
        public void ChangeMail(String newMail)
        {
            person.setMail(newMail);
        }
        public void ChangePhoneNumber(String newPhoneNumber)
        {
           person.setPhoneNumber(newPhoneNumber);
        }
        public void ChangeDestination(String new_destination)
        {
            ticket.setDestination(new_destination);
        }   
        
	public void deleteAccount()
        {
           
            
        }
	
       public void status()
        {
             try
             {
                   FileInputStream Data = new FileInputStream("Data.txt");
                 try (ObjectInputStream o = new ObjectInputStream(Data)) 
                 {
                     String strLine;
                     while ((strLine = o.toString()) != null)
                     {
                         System.out.println (strLine);
                     }
                 }
            }
             catch (IOException e)
                {
                    System.err.println("Error: " + e.getMessage());
                }
	
	
       }      

}

public class Person 
{
	
    String fname;
    String lname;
    String mail;
    String phone_number;
    long national_id ;
    int age;
    String userName;
    String password;

    public Person()
    {
            fname = " ";
            lname = " ";
            mail = " ";
            phone_number = " ";
            national_id = 0;
            age = 0;
            userName = " ";
            password = " ";
    }

    public Person(String f , String l, String mai,String phn,int ni, int Age, String UN, String pa)
    {
            fname = f;
            lname = l;
            mail  = mai;
            phone_number = phn;
            national_id = ni;
            age = Age;
            userName = UN;
            password = pa;
    }

   
                      /* Setters */
    public void setFname(String f) {
        fname=f;
    }
    public void setLname(String l){lname = l;}
    public void setMail(String m){ mail = m;}
    public void setPhoneNumber(String phn){ phone_number = phn;}
    public void setNationalId(int i ){national_id = i;}
    public void setAge(int Age){age = Age;}
    public void setUsername(String UN){userName = UN;}
    public void setPassword(String pa){password = pa;}

                    /* getters */
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public String getMail(){return mail;}
    public String getPhoneNumber(){return phone_number;}
    public long getNationalId(){return national_id;}
    public int getAge(){return age;}
    public String getUsername(){return userName;}
    public String getPassword(){return password;}
}	

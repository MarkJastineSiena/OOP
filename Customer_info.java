/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


//Class for user information
public class Customer_info {
   
  public String cust_name;
  public String cust_section;
  private int cust_ID;
  private String[][] acc = {	{"ian", "12345"},
								      {"justine","56789"},
							      	{"jet","33333"},
							      	{"vincent","17351"}
	                        };
   //constructor overloading
  public Customer_info(String name, String section, int ID) {
    this.cust_name = name;
    this.cust_section =section ;
    this.cust_ID = ID;
  }
  //constructor overloading
	  public Customer_info(String name, int ID){
		  
		  String S_ID = Integer.toString(ID);
		  if(name == acc[0][0])acc[0][1] = S_ID;
		  else if(name == acc[1][0])acc[1][1] = S_ID;
		  else if(name == acc[2][0])acc[2][1] = S_ID;
		  else if(name == acc[3][0])acc[3][1] = S_ID;
		  this.cust_ID = ID;
	  }
	  
	 //method overloading
	 boolean accountLogin(int logAgain){
		 if(logAgain == 1){
			 return false;
		 }
		return true;
	 }
	 //method overloading
	   boolean accountLogin(String Sname, int ID){
	   String S_ID = Integer.toString(ID);
	   String name = Sname.toLowerCase();
		   if(name.equals(acc[0][0]) && S_ID.equals(acc[0][1])){
			   System.out.println("Login Successfully!\n");
			   return true;}
		   
		   else if(name.equals(acc[1][0]) && S_ID.equals(acc[1][1])){
			   System.out.println("Login Successfully!\n");
			   return true;}
		   
			   else  if(name.equals(acc[2][0]) && S_ID.equals(acc[2][1])){
				   System.out.println("Login Successfully!\n");
				   return true;}
		   
				   else  if(name.equals(acc[3][0]) && S_ID.equals(acc[3][1])){
					   System.out.println("Login Successfully!\n");  
					   return true;}
				   else{System.out.println("Incorrect name or password.\n");
				   return false;}
		    
			  }
	  
  //encapsulation
  void setID(int cust_ID){
      this.cust_ID= cust_ID;
  }
  
  int getID(){
      return this.cust_ID;
  }


}

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

  public Customer_info(String name, String section, int ID) {
    this.cust_name = name;
    this.cust_section =section ;
    this.cust_ID = ID;
  }
  
  //encapsulation
  void setID(int cust_ID){
      this.cust_ID= cust_ID;
  }
  
  int getID(){
      return this.cust_ID;
  }


}

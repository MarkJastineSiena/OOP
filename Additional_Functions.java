/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;



//method overloading
public class Additional_Functions {
    public int method(int a, int b){
        return a * b;
    }
    public int method(int c, int d,int e){
        return ((c * d) + 0);
    }
    
    //method for promo
    public void promo() {
        System.out.println("    Before this transaction ends we have a surprise for you");
        System.out.println("    Since you purchace more than ₱80 you can choose 1 drink for free."+ '\n');
        System.out.println("    Here is your choices:");
        System.out.println("        1. Lemon Juice");
        System.out.println("        2. Watermelon Soda");
        System.out.println("        3. Cold Choco Milk");
        System.out.println("        4. Soya Milk");
        System.out.println("        5. Strawberry Juice "+ '\n');
  }
}

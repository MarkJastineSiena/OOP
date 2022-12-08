
package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Additional_Functions add = new Additional_Functions();
        lunch_function lf = new lunch_function(); //inheritance
        merienda_function mf = new merienda_function(); //inheritance
        System.out.println("Console Based Canteen Ordering System " + '\n');
        
        System.out.print("Please enter Customer name: ");
        String c_name = s.nextLine();  
        System.out.print("Please enter Customer section: " );
        String c_section = s.nextLine();  
        System.out.print("Please enter Customer ID: " );
        int c_ID = s.nextInt(); 
        System.out.println();
         //CUSTUMER INFO INSTANCE
        Customer_info cust = new Customer_info(c_name,c_section,c_ID);
        cust.setID(c_ID);
        int final_id = cust.getID();
        
        System.out.println("What to buy?");
        System.out.println("Choose from the following" + '\n' + "   1 - Breakfast Foods" 
                           + '\n' + "   2 - Lunch Foods" + '\n' + "   3 - Merienda Foods" + '\n');
        
        System.out.print("Your Option?  ");
        int option = s.nextInt();
        System.out.println();
        
 
        switch (option) {
         case 1:
          System.out.println("                          Breakfast Foods Items" + '\n' + '\n');
          
          System.out.println("      --Soup--            ⤞Item Code                --Drinks--          ⤞Item Code");
          System.out.println("Lugaw             ₱15          1            Water 350ml         ₱15         6");
          System.out.println("Lugaw W/ egg      ₱25          2            Water 1000ml        ₱30         7");
          System.out.println("Champolado        ₱20          3            Soya Milk           ₱20         8");
          System.out.println("Sopas             ₱20          4            Coffee              ₱10         9");
          System.out.println("Ramen Noodles     ₱30          5            Hot juice           ₱7          10");
          System.out.println();
          System.out.println("      --Biscuits--         ⤞Item Code ");
          System.out.println("Rebesco           ₱7          11"      );
          System.out.println("Choco Mucho       ₱8          12 "     );
          System.out.println("Fita              ₱7          13 "     );
          System.out.println("Fudgee Bar        ₱7          14 "     );
          System.out.println("Nissin Wafer      ₱3          15" +'\n');
          
          Scanner case1 = new Scanner(System.in);
         
           ArrayList<Integer> morning_price = new ArrayList<Integer>();
           morning_price.add(0);morning_price.add(15);morning_price.add(25);morning_price.add(20);morning_price.add(20);morning_price.add(30);
           morning_price.add(15);morning_price.add(30);morning_price.add(20);morning_price.add(10);morning_price.add(7);
           morning_price.add(7);morning_price.add(8);morning_price.add(7);morning_price.add(7);morning_price.add(3);
           
          System.out.println();
          System.out.println("Lets start your morning with a soup.. ");
                System.out.print("  Please item code: ");
                int mi = case1.nextInt(); 
                int mi1 = morning_price.get(mi);//price
                System.out.print("  Please enter item quantity: ");
                int mq = case1.nextInt(); 
                int msoup= add.method(mi1,mq);
                System.out.println(msoup);
                
           System.out.println();
           System.out.println("For your drinks.. ");
                System.out.print("  Please enter item code: ");
                int md = case1.nextInt(); 
                int md1 = morning_price.get(md);//price
                System.out.print("  Please enter item quantity: ");
                int mdq = case1.nextInt(); 
                int mdrinks = add.method(md1,mdq,0);
                System.out.println(mdrinks);
                
            System.out.println();
            System.out.println("Moving to Biscuits.. ");
                System.out.print("  Please enter item code ");
                int mb = case1.nextInt(); 
                int mb1 = morning_price.get(mb);//price
                System.out.print("  Please enter item quantity: ");
                int mbq = case1.nextInt(); 
                int mbiscuit= add.method(mb1,mbq,0);
                System.out.println(mbiscuit);
                
        System.out.println();
        System.out.println("FULL INFO.. ");
        System.out.println(" Custumer name: " + c_name );
        System.out.println(" Custumer section: " + c_section);
        System.out.println(" Custumer ID: " + c_ID);
        System.out.println();
        int total =  msoup + mdrinks + mbiscuit;
        System.out.println("Total Price: ₱" + total);
        System.out.print("Please enter your Bill: ₱");
        int bill = s.nextInt();
        int change= bill - total;
        System.out.println("Here is your change: ₱" + change + '\n');
        System.out.print("--    Thank you  --");
        break;

        case 2:
          System.out.println("                                  Lunch Foods Items" + '\n'+'\n');
          
          System.out.println("      --Carbs--             ⤞Item Code                --Drinks--          ⤞Item Code");
          System.out.println("Rice              ₱10          1            Water 350ml         ₱15         6");
          System.out.println("Pasta             ₱25          2            Water 1000ml        ₱30         7");
          System.out.println("Carbonara         ₱30          3            Magnolia            ₱15         8");
          System.out.println("Spaghetti         ₱25          4            Zesto               ₱8          9");
          System.out.println("Pancit            ₱20          5            Chuckie             ₱25         10");
          System.out.println();
          System.out.println("      --Biscuits--         ⤞Item Code ");
          System.out.println("Rebesco           ₱7          11"      );
          System.out.println("Choco Mucho       ₱8          12 "     );
          System.out.println("Fita              ₱7          13 "     );
          System.out.println("Fudgee Bar        ₱7          14 "     );
          System.out.println("Nissin Wafer      ₱3          15" +'\n');
          
          Scanner case2 = new Scanner(System.in);
          
           ArrayList<Integer> lunch_price = new ArrayList<Integer>();
           lunch_price.add(0);lunch_price.add(10);lunch_price.add(25);lunch_price.add(30);lunch_price.add(25);lunch_price.add(20);
           lunch_price.add(15);lunch_price.add(30);lunch_price.add(15);lunch_price.add(8);lunch_price.add(25);
           lunch_price.add(7);lunch_price.add(8);lunch_price.add(7);lunch_price.add(7);lunch_price.add(3);
           
           System.out.println();
           System.out.println("For your carbs.. ");
                System.out.print("  Please item code: ");
                int lc = case2.nextInt(); //lc means lunch code
                int lc1 = lunch_price.get(lc);//price
                System.out.print("  Please enter item quantity: ");
                int lq = case2.nextInt(); //lq means lunch quantity
                int lcarb= lf.method(lc1,lq); //method na ito is galing sa inheritance(lunch_function.java)
                System.out.println(lcarb);
            System.out.println();
          
            System.out.println("How about your drinks? ");
                System.out.print("  Please enter item code: ");
                int ld = case2.nextInt(); 
                int ld1 = lunch_price.get(ld);//price
                System.out.print("  Please enter item quantity: ");
                int ldq = case2.nextInt(); 
                int ldrinks = lf.method(ld1,ldq,0);
                System.out.println(ldrinks);
                
            System.out.println();
            System.out.println("Moving to Biscuits.. ");
                System.out.print("  Please enter item code ");
                int lb = case2.nextInt(); 
                int lb1 = lunch_price.get(lb);//price
                System.out.print("  Please enter item quantity: ");
                int bq = case2.nextInt(); 
                int lbiscuit= lf.method(lb1,bq,0);
                System.out.println(lbiscuit);
                
        System.out.println();
        System.out.println("FULL INFO.. ");
        System.out.println(" Custumer name: " + c_name );
        System.out.println(" Custumer section: " + c_section);
        System.out.println(" Custumer ID: " + c_ID);
        System.out.println();
        int lunch_total =  lcarb + ldrinks + lbiscuit;
        System.out.println("Total Price: ₱" + lunch_total);
        System.out.print("Please enter your Bill: ₱");
        int l_bill = s.nextInt();
        int l_change= l_bill - lunch_total;
        System.out.println("Here is your change: ₱" + l_change + '\n');
        System.out.print("--    Thank you  --");
          break;
          
        case 3:
         System.out.println("                             Merienda Foods Items"+'\n'+'\n');
         
          System.out.println("       --Merienda--            ⤞Item Code                      --Drinks--            ⤞Item Code");
          System.out.println("Puto               ₱10              1               Water 350ml              ₱15         6");
          System.out.println("Bananaque          ₱15              2               Water 1000ml             ₱30         7");
          System.out.println("Turon              ₱5               3               Lemonade                 ₱15         8");
          System.out.println("CornDog            ₱25              4               Buko Juice               ₱10         9");
          System.out.println("Potato Roll        ₱20              5               Mango Shake              ₱25         10");
          System.out.println();
          System.out.println("      --Snacks--               ⤞Item Code ");
          System.out.println("Oreo               ₱10             11"      );
          System.out.println("Dowee Donut        ₱15             12 "     );
          System.out.println("Re-cheese          ₱12             13 "     );
          System.out.println("Piattos            ₱15             14 "     );
          System.out.println("Nova               ₱15             15" +'\n');
          
           Scanner case3 = new Scanner(System.in);
           
           ArrayList<Integer> merienda_price = new ArrayList<Integer>();
           merienda_price.add(0);merienda_price.add(10);merienda_price.add(15);merienda_price.add(5);merienda_price.add(25);merienda_price.add(20);
           merienda_price.add(15);merienda_price.add(30);merienda_price.add(15);merienda_price.add(10);merienda_price.add(25);
           merienda_price.add(10);merienda_price.add(15);merienda_price.add(12);merienda_price.add(15);merienda_price.add(15);
           
           System.out.println();
           System.out.println("Your Merienda Please.. ");
                System.out.print("  Please item code: ");
                int mc = case3.nextInt(); //mc means merienda code
                int mc1 = merienda_price.get(mc);//price
                System.out.print("  Please enter item quantity: ");
                int mer_q = case3.nextInt(); //mq means merienda quantity
                int merienda= mf.method(mc1,mer_q); //method na ito is galing sa inheritance(merienda_function.java)
                System.out.println(merienda);
                System.out.println();
           
           System.out.println("How about your drinks? ");
                System.out.print("  Please enter item code: ");
                int mer_d = case3.nextInt(); 
                int mer_d1 = merienda_price.get(mer_d);//price
                System.out.print("  Please enter item quantity: ");
                int mer_dq = case3.nextInt(); 
                int mer_drinks = mf.method(mer_d1,mer_dq,0);
                System.out.println(mer_drinks);
                
            System.out.println();
            System.out.println("Moving to Biscuits.. ");
                System.out.print("  Please enter item code ");
                int mer_b = case3.nextInt(); 
                int mer_b1 = merienda_price.get(mer_b);//price
                System.out.print("  Please enter item quantity: ");
                int mer_bq = case3.nextInt(); 
                int merbiscuit= lf.method(mer_b1,mer_bq,0);
                System.out.println(merbiscuit);
                
        System.out.println();
        System.out.println("FULL INFO.. ");
        System.out.println(" Custumer name: " + c_name );
        System.out.println(" Custumer section: " + c_section);
        System.out.println(" Custumer ID: " + c_ID);
        System.out.println();
        int merienda_total =  merienda + mer_drinks + merbiscuit;
        System.out.println("Total Price: ₱" + merienda_total);
        System.out.print("Please enter your Bill: ₱");
        int m_bill = s.nextInt();
        int m_change= m_bill - merienda_total;
        System.out.println("Here is your change: ₱" + m_change + '\n');
        System.out.print("--    Thank you  --");
        break;
        }
    }

    private static boolean calc(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

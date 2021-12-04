package ljy;

import java.util.Scanner;



public class a {

   public static void main(String[] args) {
      int cokeCount = 0;
      int ciderCount = 0;
      int milkCount = 0;
      String[] nameOfProduct = new String[100];
      
      boolean lastMoney = false;
      
      Scanner sc = new Scanner(System.in);
      
      int total_money = sc.nextInt();
      int cnt = sc.nextInt();
      
      for (int i = 0; i < cnt; i++)
         nameOfProduct[i] = sc.next();
      
      for (int i = 0; i < cnt; i++) {
         if (nameOfProduct[i].equals("Coke")) {
            total_money -= 500;
            if (total_money < 0) {
               total_money += 500;
               lastMoney = true;
               continue;
            }
            else if (total_money == 0) {
               if (i < 5)
                  lastMoney = true;
               cokeCount++;
               break;
            }
            cokeCount++;
         }
         if (nameOfProduct[i].equals("Cider")) {
            total_money -= 400;
            if (total_money < 0) {
               total_money += 400;
               lastMoney = true;
               continue;
            }
            else if (total_money == 0) {
               if (i < 5) 
                  lastMoney = true;
               ciderCount++;
               break;
            }
            ciderCount++;
         }
         if (nameOfProduct[i].equals("Milk")) {
            total_money -= 350;
            if (total_money < 0) {
               total_money += 350;
               lastMoney = true;
               continue;
            }
            else if (total_money == 0) {
               if (i < 5)
                  lastMoney = true;
               milkCount++;
               break;
            }
            milkCount++;
         }
      }
      
      System.out.println(cokeCount + " " + ciderCount + " " + milkCount);
      System.out.println(total_money);
      if (lastMoney == true)
         System.out.println("Not Enough Money");
      
   }
}
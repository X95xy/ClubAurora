package ArrayList;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class HandleComplementaryPasses {
   @SuppressWarnings("rawtypes")
   Scanner in = new Scanner(System.in);
   private Stack he = new Stack<ComplementaryPasses>();

   public void handleComplementaryPasses() {
      System.out.println(
            "1. Redeem complementary passes; 2. Display all the redeemed complementary passes; 3. Display the last redeemed complementary pass; 4. Undo any of the redeemed complementary pass; 5. QUIT");

      int u;
      do {
         u = in.nextInt();
         switch (u) {
            case 1:
               System.out.println(" how many passes needs to be redeemed.");
               int q = in.nextInt();
               redeemComplementaryPasses(q);
               break;
            case 2:
               displayComplementaryPasses();
               break;
            case 3:
               displayLastRedeemedComplementaryPass();
               break;
            case 4:
               undoRedeemedComplementaryPass();
               break;
            case 5:
               System.out.println("You will be out of the program");
               break;
            default:
               break;
         }
      } while (u != 5);
   }

   // the end of the method

   @SuppressWarnings("unchecked")
   public void redeemComplementaryPasses(int o) {

      do {
         if (this.he.size() >= 10) {
            System.out.println("Invalid operation. All the passes have been redeemed");

         } else {
            in.nextLine();
            System.out.println("Enter the ID of the peopel ");
            String ID = in.nextLine();
            System.out.println("Enter the Level of the people ");
            String level = in.nextLine();
            he.push(new ComplementaryPasses(ID, level));

         }
      } while (he.size() < 10);
   }

   /////////

   public void displayComplementaryPasses() {
      Iterator hehe = this.he.iterator();
      hehe.forEachRemaining(hh -> {
         System.out.println(hh.toString());

      });

   }//

   public void displayLastRedeemedComplementaryPass() {

      System.out.println("The top most of the stack " + he.peek().toString());

   }/////////

   @SuppressWarnings("unchecked")
   public void undoRedeemedComplementaryPass() {

      try (Scanner in = new Scanner(System.in)) {
         System.out.println("Enter the ID of the people you want to remove ");
         String ID = in.nextLine();
         Iterator<ComplementaryPasses> h = he.iterator();
         h.forEachRemaining(k -> {

            if (k.getPassID().equals(ID)) {
               System.out.println("The ID you want to find is in the stack");
               h.remove();
               return;
            } else {

               System.out.println("There is no element in the stack ");
               return;
            }
         });
      }

   }////////////

}

package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
  Scanner in = new Scanner(System.in);
  @SuppressWarnings("rawtypes")
  Queue performances = new LinkedList<Performance>();

  public void handlePerformances() {
    int i = 0;
    do {
      System.out.println("1. Add performances; 2. Display all the performances; 3. Start the performances; 4. QUIT.");
      System.out.println("you had better add a element first");
      i = in.nextInt();

      switch (i) {

        case 1:
          System.out.println(" how many performances must be added");
          int choice = in.nextInt();

          addPerformances(choice);
          break;
        case 2:
          displayPerformances();
          break;
        case 3:
          startPerformance();
          break;
        case 4:
          break;

        default:
          System.out.println("Invalid choice ,Please enter sa vaild choice ");
          break;
      }
    } while (i != 4);

  }

  // the end of the method;

  @SuppressWarnings("unchecked")
  public void addPerformances(int y) {

    for (int i = 0; i < y; i--) {

      System.out.println("Enter the ID of the performances queue");

      String ID = in.nextLine();
      System.out.println("Enter the Name of the performance queue");
      String name = in.nextLine();
      System.out.println("Enter the name of the performance queue ");
      String LeadName = in.nextLine();
      System.out.println("Enter the group of the performance ");
      char group = in.nextLine().charAt(0);

      performances.offer(new Performance(ID, name, LeadName, group));

    }
  }

  //////////// {

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void displayPerformances() {

    Iterator hhh = performances.iterator();

    System.out.println(performances);

    ;

  }//////

  public void startPerformance() {

    System.out.println("The first element in the stack is" + performances.poll());

  }
}

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    File file = new File("input.txt");   // FIX 1
    Scanner sc = new Scanner(file);

    int dial = 50;      
    int count = 0;               // FIX 3

    while (sc.hasNextLine()) {
      String line = sc.nextLine();       // example: "R802"

      // Get direction (L or R)
      char direction = line.charAt(0);   // FIX 2

      // Get number part ("802")
      int amount = Integer.parseInt(line.substring(1)); // FIX 4 & 7

      // Apply turn
      if (direction == 'L') {
        dial = (dial - amount) % 100;
      } else {
        dial = (dial + amount) % 100;
      }

      if (dial == 1)
      {
        count++;
      }
    }

    System.out.println("The password is " + count);
    sc.close();
  }
}

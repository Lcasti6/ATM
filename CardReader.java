import java.util.Scanner;
public class CardReader {
  public void init() {
    System.out.println("CardReader.init"); 
  }

  public static String readCard() {
    Scanner insert = new Scanner(System.in);
    return insert.nextLine();
  }

  
}
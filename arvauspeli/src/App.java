import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    String oikeaNimi = "Janne";
    String input;



    System.out.println("Arvaa nimi?");
    input = in.nextLine();

    if (input.equals(oikeaNimi))
    {
    System.out.println("Oikein! Oikea nimi on " + oikeaNimi);
    
    }



    

    }
}

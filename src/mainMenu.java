import java.util.Scanner;
public class mainMenu implements menu{
    int selection;

    public int displayOptions(){
        System.out.println("MAIN MENU");
        return 0;
    }
    public String getInput(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
}

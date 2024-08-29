import java.util.Scanner;

public class characterCreationMenu implements menu {
    public int displayOptions(){
        System.out.println("Character creation MENU");
        return 0;
    }
    public String getInput(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
}

import java.util.Scanner;
public class battleMenu implements menu{
    int selection;

    public int displayOptions(){
        System.out.println("BATTLE!!!");
        return 0;
    }
    public String getInput(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public void enemyHeader() throws Exception {
        System.out.println("not implemented yet, try installing MS-DOS 6.1");
        throw new Exception("not implemented");
    }
}

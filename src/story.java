public class story {
    int qouteCounter;
    difficulty level = difficulty.EASY;

    public void storyBuilder(int dialogue,difficulty playerDifficulty){
        //INIT PARAMS
        qouteCounter = dialogue;
        level = playerDifficulty;
        //other subroutines
        System.out.println("initializing program...story builder"+System.lineSeparator());
    }

    public void storyDisplay(){
        switch (qouteCounter){
            case 1:
                System.out.println("Welcome to le' arche de tus monde");

            case 2:

        }
    }

    public void storySaveInterrupt(){

    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    //TODO (18): Declare an integer instance variable called playerScore
    private int playerScore;

    //TODO (19): Declare a boolean instance variable called isLeft
    private boolean isLeft;

    //TODO (20): Declare a boolean instance variable called scoreChanged
    private boolean scoreChanged;

    /**
     * This makes it show at the top
     * of the window the players score
     * is set to zero.
     *          
     * @param there is a boolean parameter
     * @return nothing is being returned
     */
    //TODO (21): Declare a constructor for Score that has a boolean parameter called onLeft
    public Score(boolean onLeft)
    {
        //TODO (22): Initialize playerScore to be 0
        playerScore = 0;
        //TODO (23): Initialize isLeft to be the value from the onLeft parameter
        isLeft = onLeft;
        //TODO (32): Make a method call to displayScore
        displayScore();
    }

    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param there are no parameters
     * @return nothing is being returned
     */
    public void act() 
    {
        // Add your action code here.
        //TODO (33): If the score has changed...
        if(scoreChanged == true)
        {   
            //TODO (34): Display the score
            displayScore();
        }
    }    

    /**
     * This makes it show the players
     * score at the top of the window.
     *          
     * @param there ar no perameters
     * @return nothing is being returned
     */
    //TODO (24): Declare a method called displayScore that does not return anything and has no parameters
    private void displayScore()
    {
        //TODO (25): Inside the method, declare a local GreenfootImage variable called display
        GreenfootImage display;
        //TODO (26): If the Score is on the left...
        if(isLeft == true)
        {
            /**TODO (27): Initialize the display variable to a new GreenfootImage object
             *        that uses playerScore changed to a String (use Integer.toString()),
             *        a font size of 30, any color for the font color (this will be 
             *        player one's color and you will need to remember what color you chose 
             *        for other parts of this program), and BLACK for the background color
             */
            display = new GreenfootImage(Integer.toString(playerScore),30,Color.WHITE,Color.BLACK);
        }
        //TODO (28): Otherwise...
        else
        {
            /**TODO (29): Initialize the display variable to a new GreenfootImage object
             *         that uses playerScore changed to a String, a font size of 30, 
             *         a new color for the font color (this will be player two's color and 
             *         you will need to remember what color you chose for other parts of this program) 
             *         and BLACK for the background color
             */
            display = new GreenfootImage(Integer.toString(playerScore),30,Color.GRAY,Color.BLACK);
        }
        //TODO (30): Set the image of the Score class to the display image
        setImage(display);
        //TODO (31): The score is now updated and the display will not need to be changed. Change the value for the variable that stores this info
        scoreChanged = false;
    }
    /**
     * This makes it so the score gets changed
     * whenever somebody gets a point.
     *          
     * 
     * @param there are no parameters
     * @return nothing is being returned
     */
    //TODO (35): Declare a public method called countScore that does not return anything and has no parameters
    public void countScore()
    {
        //TODO (36): Inside the method, increase playerScore by 1 (increment the playerScore)
        playerScore ++;
        //TODO (37): The score has now changed. Change the variable that stores this info
        scoreChanged = true;
    }
    /**
     * This makes it so it returns the player 
     * score when the game resets.
     * 
     * @param there are no parameters        
     * @return there is an integer value being returned
     */
    //TODO (38): Declare a public method called getScore that returns an integer value and has no parameters
    public int getScore()
    {
        //TODO (39): Inside the method, return the score for the scoreboard
        return playerScore;
    }
    
}

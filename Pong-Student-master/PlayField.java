/**
 * TODO (132): Fill out an appropriate assignment comment block
 * Name: Chase
 * Course: Software Development
 * Teacher: Mr. Hardman
 * Last date modifyed: December 2nd 2018
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayField extends World
{
    //TODO (1): Declare a boolean instance variable called startGame that is initialized to false
    private boolean startGame = false;

    //TODO (2): Declare a Ball instance variable called theBall
    private Ball theBall;

    //TODO (3): Declare a Score instance variable called player1Score
    private Score player1Score;

    //TODO (4): Declare a Score instance variable called player2Score
    private Score player2Score;

    /**
     * This method makes how big the game will be
     * and also initializes the playing field method.
     *  
     * @param there are no parameters
     * @return nothing is being returned
     */
    //TODO (5): Declare a default constructor for PlayField
    public PlayField()
    {
        //TODO (6): Use the superclass' constructor to create a world with 800 by 600 cells with a cell size of 1x1 pixels
        super(800,600,1);
        //TODO (15): Make a method call to the initializePlayingField method
        initializePlayingField();
    }

    /**
     * This method makes the background black
     * and draws two rectangles on the background.
     * It also shows a text that says "press space
     * bar to begin".
     * 
     * @param there are no parameters
     * @return nothing is being returned
     */
    //TODO (7): Declare a method called initializePlayingField that does not return anything and has no parameters
    public void initializePlayingField()
    {
        //TODO (8): Set the color of the background of the world to BLACK
        getBackground().setColor(Color.BLACK);
        //TODO (9): Fill a rectangle on the background starting at (0,0) and having a width of the width of the world and a height of the height of the world
        getBackground().fillRect(0, 0, getWidth(), getHeight());
        //TODO (10): Set the color of the background to GRAY (You may change this later)
        getBackground().setColor(Color.GRAY);
        //TODO (11): Fill a rectangle on the background starting at (halfway across the screen, 0) and having a width of 4 and a height of the height of the world
        getBackground().fillRect(getWidth()/2,0,4,getHeight());
        //TODO (14): Make a method call to addPlayersAndObjects
        addPlayersAndObjects();
        //TODO (12): Show text stating that the player should "press the space bar to begin play" at an x location of 200 and a y location of 550
        showText(" press the space bar to begin " , 200, 550);
    }

    /**
     * This method adds objects such as the
     * ball, the two paddles, and adds both
     * players score.
     * 
     * @param there are no parameters
     * @return nothing is being returned
     */
    //TODO (13): Declare a method called addPlayersAndObjects that does not return anything and has no parameters
    public void addPlayersAndObjects()
    {
        //TODO (54): Initialize the theBall variable to a new Ball object
        theBall = new Ball();
        //TODO (40): Initialize the player1Score variable to a new Score object with an appropriate parameter value
        player1Score = new Score(true);  
        //TODO (41): Initialize the player2Score variable to a new Score object with an appropriate parameter value
        player2Score = new Score(false);
        //TODO (55): Add the theBall object in the middle of the world
        addObject(theBall,getWidth()/2,getHeight()/2);
        //TODO (124): Add a new Paddle for player one using an appropriate parameter value at a x location of 10 and a y location of the middle of the height of the world
        addObject(new Paddle(true),10,getHeight()/2);
        //TODO (125): Add a new Paddle for player two using an appropriate parameter value at a x location of 10 pixels less than the width of the world and a y location of the middle of the height of the world
        addObject(new Paddle(false),getWidth()-10, getHeight()/2);
        //TODO (42): Add the player1Score object at an x location of 200 and a y location of 50
        addObject(player1Score,200,50);
        //TODO (43): Add the player2Score object at an x location of 200 pixels less than the width of the world and a y location of 50
        addObject(player2Score,getWidth() - 200,50);

    }
    /**
     * The act method starts the game and 
     * also checks to see who won the game.
     *  
     * @param there are no parameters
     * @return nothing is being returned   
     */
    //TODO (61): Declare the act method for the PlayField class
    public void act() 
    {
        //TODO (62): If the game has not started...
        if(startGame == false)
        {
            //TODO (63): Use a method to check if the space bar key has been pressed 
            checkKeyPressed();
        }
        //TODO (80): Otherwise...
        else
        {
            //TODO (81): Use a method to check if a player has won
            checkWin(); 
        }
    }

    /**
     * This method makes it so when you
     * press the space bar the games starts
     * and removes the text.
     *           
     * @param there are no parameters
     * @return nothing is being returned
     */
    //TODO (56): Declare a method called checkKeyPress that does not return anything and has no parameters
    public void checkKeyPressed()
    {
        //TODO (57): Inside the method, you need to check if the space key has been pressed
        if(Greenfoot.isKeyDown("Space"))
        {
            //TODO (58): If the space bar has been pressed, the game has now started. Change the variable that stores that info
            startGame = true;
            //TODO (59): Remove the text that tells the player to press the space bar to begin. You can do this by displaying an empty string, "", at the same location
            showText("",200,550);
            //TODO (60): Set the velocity of theBall to be 5 pixels
            theBall.setVelocity(5);
        }
    } 

    /**
     * This method makes the scenario reset
     * and show the previous text that was there
     * before th game started.
     *            
     * 
     * @param there are no parameters
     * @return nothing is being returned
     */
    //TODO (64): Declare a public method called reset that does not return anything and has no parameters
    public void reset()
    {
        //TODO (65): Set the theBall variable to a new Ball object
        theBall = new Ball();
        //TODO (66): Add theBall in the middle of the world
        addObject(theBall,getWidth()/2,getHeight()/2);
        //TODO (67): Set the velocity of theBall to 0
        theBall.setVelocity(0);
        //TODO (68): Use the show text method to display that the user should Press the space bar to begin at an x location of 200 and a y location of 550
        showText(" press the space bar to begin ",200,550);
        //TODO (69): Set the startGame variable to false
        startGame = false;
    }

    /**
     * This method checks to see which
     * player has won and than shows a 
     * text saying which player won.
     *           
     * @param there are no parameters  
     * @return nothing is being returned     
     */
    //TODO (70): Declare a method called checkWin that does not return anything and has no parameters
    public void checkWin()
    {
        /**  TODO (71): Declare a local GreenfootImage variable called player1Win that
         *            is initialized to a new GreenfootImage object with "Player 1 Wins!" as the text, 
         *            45 as the font size, player one's color as the text color, and BLACK as the background color
         */
        GreenfootImage player1Win = new GreenfootImage(" Player 1 Wins! ", 45, Color.WHITE, Color.BLACK);
        /**  TODO (72): Declare a local GreenfootImage variable called player2Win that
         *            is initialized to a new GreenfootImage object with "Player 2 Wins!" as the text, 
         *            45 as the font size, player two's color as the text color, and BLACK as the background color
         */
        GreenfootImage player2Win = new GreenfootImage(" Player 2 Wins! ", 45, Color.GRAY, Color.BLACK);
        //TODO (73): Declare a local integer variable called player1Total that is initialized to the score of player one's scoreboard (use the getScore method)
        int player1Total = player1Score.getScore();
        //TODO (74): Declare a local integer variable called player2Total that is initialized to the score of player two's scoreboard
        int player2Total = player2Score.getScore();
        //TODO (75): The game is won if one of the players has a score of 7 or more. Write two conditional statements that will check this, one for each player
        if(player1Total == 7)
        {
            //TODO (76): In both conditional statements from the previous TODO, remove all objects (use null as the parameter for the removeObjects method)
            removeObjects (getObjects(null)); 
            //TODO (77): In both conditional statements, set the color of the background to BLACK
            getBackground().setColor(Color.BLACK);
            //TODO (78): In both conditional statements, fill a rectangle on the background that starts at (0,0) and has a width of the width of the world and a height of the height of the world
            getBackground().fillRect(0, 0, getWidth(), getHeight());
            //TODO (79): In both conditional statements, draw an image on the background that will show which player won in the exact center of the world (you should have GreenfootImage variables for this)
            getBackground().drawImage(player1Win, 250, getHeight()/2);
        }
        if(player2Total == 7)
        {
            removeObjects (getObjects(null));
            getBackground().setColor(Color.BLACK);
            getBackground().fillRect(0, 0, getWidth()/2, getHeight()/2);
            getBackground().drawImage(player2Win, getWidth()/2, getHeight()/2);
        }
    }
    //get trolled chase by aryan;
    /**
     * This method checks to see if the 
     * game has started or not.
     * 
     * @param there are no parameters       
     * @return there is a boolean being returned
     */
    //TODO (16): Declare a public method called getStarted that returns a boolean and has no parameters
    public boolean getStarted()
    {
        //TODO (17): Inside the method, return the variable that states whether the game has started or not
        return startGame;
    }
}

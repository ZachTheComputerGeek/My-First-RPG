package MiniGameProject.Characters;
import java.lang.reflect.Field;
import java.util.Random;

/**
 * This class will handle some of the various traders throughout the game, including shop keepers.
 * @author Zachary House
 * @version 04/10/18
 */
public class NPC_Friendly_Trader implements NPC_Friendly
{
    private String name;
    
    /** String array that stores all the possible dialogues of the game's traders
     * The first group ( allDialogues[0][x] ) will store the opening dialogues.
     * The second group ( allDialogues[1][x] ) will store the possible dialogues if the player purchases something and leaves.
     * The third group ( allDialogues[2][x] ) will store the possible dialogues if the player does not purchase anything and leaves.
     */
    private final String[][] allDialogues =
            { { "Hi!", "Hello there!", "Greetings!", "Welcome! Feel free to browse my wares!", "How can I help you?" }, 
              { "Good luck on your adventures", "Until next time", "Thanks for your business", "Goodbye", "Farewell" },
              { "Alright then", "See ya", "Come back with some coin next time", "If you'll excuse me, I've got a business to run", "Bye" } };
    
    Random r = new Random();
    
    public NPC_Friendly_Trader( String name )
    {
        this.name = name;
    }
    
    /** @return Returns the name of the (player's) character. */
    @Override
    public String getName()
    {
        return this.name;
    }
    
    /**
     * When the player activates this NPC, this method will provide a series of dialogue choices for them.
     * @return Returns a String of Dialogue choices for the player while talking to the NPC.
     */
    @Override
    public String[] talkToPlayer()
    {
        // Dialogue options not yet implemented, so here's a placeholder.
        return new String[0];
    }

    /**
     * This will close the dialogue between the player and the NPC.
     * @return Returns a phrase from the shop keeper depending on whether or not the player made a purchase.
     */
    @Override
    public String endDialogue()
    {
        // Basically, if the player buys something after talking to the shop keeper
        // and leaves, they get a happy farewell from the shop keeper.
        // ----------
        // If the player does not buy something after talking to the shop keeper
        // and leaves, then they get an unhappy dismissal from the shop keeper.
        
        // temporary condition/placeholder for when I actually implement this code
        // basically call a method that reutrns whether or not the player actually bought something
        int i = 0;
        if ( i == 0 /* replace this with a the condition: if the player bought something or not */ )
            // choose a random response
            return allDialogues[1][ r.nextInt( allDialogues[1].length ) ];
        else return allDialogues[2][ r.nextInt( allDialogues[2].length ) ];
    }
    
    /**
     * For testing purposes only.
     */
    @Override
    public void allDialogues()
    {
        // store all possible dialogues in a String
        for ( int i = 0; i < allDialogues.length; i++ )
        {
            if ( i == 0 )
                System.out.println( "----- Greetings -----" );
            else if ( i == 1 )
                System.out.println( "----- Closing With Purchase ----- " );
            else if ( i == 2 )
                System.out.println( "----- Closing Without Purchase -----" );
            // expand if more dialogue options become available
            for ( int j = 0; j < allDialogues[i].length; j++ )
                System.out.println( allDialogues[i][j] );
        }
    }
    
    public static void main(String[] args) {
        NPC_Friendly_Trader bob = new NPC_Friendly_Trader( "Bob" );
        bob.allDialogues();
    }
}
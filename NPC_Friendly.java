package MiniGameProject.Characters;


/**
 * This class will handle most of the friendly NPCs (non-playable characters) in the game.
 * @author Zachary House
 * @version 04/10/18
 */
public interface NPC_Friendly
{   
    /** @return Returns the name assigned to the character. This is not affected by character-name changes. */
    String getName();
    /** This method will handle all conversations between the player and friendly NPCs in the game.
     * @return Returns a String array containing the possible options one can choose from while talk to an NPC.
     */
    public String[] talkToPlayer();
    
    /**
     * For testing purposes only ~ Used to view all possible chat dialogues of an NPC.
     * @return Returns a String array containing all possible chat dialogues of an NPC.
     */
    public void allDialogues();
    
    /**
     * Used to provide an exit command when the player wants to stop talking to an NPC.
     * @return Returns a String with a closing phrase, such as, "Bye," "Farewell," or "See you later!"
     */
    public String endDialogue();
}

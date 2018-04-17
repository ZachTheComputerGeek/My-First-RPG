package MiniGameProject;

/**
 * This serves as a template for many of the items in the game.
 * @author Zachary House
 * @version 04/06/18
 */
public interface Item
{
    /** @return Returns the initial name assigned to the item. This is not affected by item-name changes. */
    String getInitialName();
    /** @return Returns the initial weight of the item. This is not affected by item enhancements and debuffs. */
    double getInitialWeight();
    /** @return Returns the description of the item. */
    String getDescription();
}
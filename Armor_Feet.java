package MiniGameProject.Items.Armor;

/**
 * This class will handle all armor pieces in the game that protect the feet.
 * @author Zachary House
 * @version 04/10/18
 */
public class Armor_Feet implements Armor
{
    /** The initial name given to the armor piece, cannot be changed. */
    private String initialName;
    /** The description of the armor piece. */
    private String description;
    /** The armor value of the armor piece. */
    private double armorRating;
    /** The initial weight given to the armor piece. */
    private double initialWeight;
    /** The current weight of the armor piece. */
    private double currentWeight;
    
    /**
     * Constructor that allows the creation of instances of Armor_ChestPlate.
     * @param name The initial name given to the armor piece, cannot be changed.
     * @param description The description of the armor piece.
     * @param armorRating The armor value of the armor piece.
     * @param weight The weight of the armor piece.
     */
    public Armor_Feet( String name, String description, double armorRating, double weight )
    {
        this.initialName = name;
        this.description = description;
        this.armorRating = armorRating;
        this.initialWeight = weight;
        this.currentWeight = weight;
    }
    
    @Override
    public String getInitialName()
    {
        return this.initialName;
    }

    @Override
    public double getInitialWeight()
    {
        return this.initialWeight;
    }
    
    public double getCurrentWeight()
    {
        return this.currentWeight;
    }

    @Override
    public String getDescription()
    {
        return this.description;
    }

    @Override
    public double getArmorRating()
    {
        return this.armorRating;
    }
}
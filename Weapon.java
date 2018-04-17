package MiniGameProject.Items.Weapons;
import MiniGameProject.Item;

/**
 * This class will handle most of the weapons in the game, excluding non-hand-equippable weapons like potions or tomes.
 * @author Zachary House
 * @version 04/06/18
 */
public abstract class Weapon implements Item
{
    /** The initial name given to the weapon, cannot be changed. */
    private String initialName;
    /** The name of the weapon, which can be changed in-game. */
    protected String currentName;
    /** The description of the weapon. */
    private String weaponDescription;
    /** The initial base damage value that is given to the weapon. */
    private double initialBaseDamage;
    /** The current base damage value of the weapon. */
    double currentBaseDamage;
    /** The initial weight given to the weapon, */
    private double initialWeight;
    /** The current weight of the weapon. */
    double currentWeight;
    
    /**
     * Constructor used to create an instance of Weapon.
     * @param name The name of the weapon, which can be changed in-game.
     * @param description The description of the weapon.
     * @param baseDamage The base damage value that is given to the weapon.
     * @param weight The weight of the weapon.
     */
    public Weapon( String name, String description, double baseDamage, double weight  )
    {
        this.initialName = name;
        this.currentName = name;
        this.weaponDescription = description;
        this.initialBaseDamage = baseDamage;
        this.currentBaseDamage = baseDamage;
        this.initialWeight = weight;
        this.currentWeight = weight;
    }

    @Override
    public String getInitialName()
    {
        return this.initialName;
    }
    /** @return Returns the current name of the item. This is affected by item-name changes. */
    public String getCurrentName()
    {
        return this.currentName;
    }

    @Override
    public double getInitialWeight()
    {
        return this.initialWeight;
    }

    /** @return Returns the current weight of the item. This is affected by various item enhancements and debuffs. */
    public double getCurrentWeight()
    {
        return this.currentWeight;
    }

    @Override
    public String getDescription()
    {
        return this.weaponDescription;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public void setCurrentBaseDamage(double currentBaseDamage) {
        this.currentBaseDamage = currentBaseDamage;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }
}
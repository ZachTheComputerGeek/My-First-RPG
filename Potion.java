package MiniGameProject.Items.Weapons;

import MiniGameProject.Item;

/**
 * Class that allows the creation of instances of Potion.
 * @author Zachary House
 * @version 04/09/18
 */
public class Potion implements Item
{
    /** The initial name given to the potion, cannot be changed. */
    private String initialName;
    /** The description of the potion. */
    private String potionDescription;
    /** The effect that the potion will have on its target. */
    private String potionEffect;
    
    /** The magnitude or extent of the effect of the potion. 
     * For example, Health Potions could heal either 5 or 10 Health Points ( HP ).
     * Another example, damage potions could deal 10 or 20 damage. */
    private double effectMagnitude;
    
    /** The amount of turns during which a potion's effect will take place. */
    private int effectDuration;
    /** The initial weight given to the potion. */
    private double weight;
    
//  The number representing how many of this potion there are in the inventory.
//  protected int numberOfPotionsInTheStack = 1;
    
    /** Constructor used to create an instance of Potion.
     * @param name The initial name given to the potion, cannot be changed.
     * @param description The description of the potion.
     * @param effect The effect that the potion will have on its target.
     * @param effectMagnitude The magnitude or extent of the effect of the potion.
     * @param effectDuration The amount of turns during which a potion's effect will take place.
     * @param weight The initial weight given to the potion. */
    public Potion( String name, String description, String effect, double effectMagnitude, int effectDuration, double weight)
    {
        this.initialName = name;
        this.potionDescription = description;
        this.potionEffect = effect;
        this.effectMagnitude = effectMagnitude;
        this.effectDuration = effectDuration;
        this.weight = weight;
    }
    
    @Override
    public String getInitialName()
    {
        return this.initialName;
    }

    @Override
    public String getDescription()
    {
        return this.potionDescription;
    }
    
    @Override
    public double getInitialWeight()
    {
        return this.weight;
    }
    
    /** @return Returns the effect of the potion. */
    public String getPotionEffect()
    {
        return this.potionEffect;
    }
    
    /** @return Returns the magnitude/extent of the effect of the potion. */
    public double getEffectMagnitude()
    {
        return this.effectMagnitude;
    }
    
    /** @return Returns the duration of the of the potion. */
    public int getEffectDuration()
    {
        return this.effectDuration;
    }
    
//    @Override
//    public int getAmount()
//    {
//        return this.numberOfPotionsInTheStack;
//    }
//    
//    /** @return Returns the O of the potion. */
//    public void increaseNumberOfPotions()
//    {
//        this.numberOfPotionsInTheStack++;
//    }
//    
//    /** @return Returns the O of the potion. */
//    public void decreaseNumberOfPotions()
//    {
//        this.numberOfPotionsInTheStack--;
//    }
    
}
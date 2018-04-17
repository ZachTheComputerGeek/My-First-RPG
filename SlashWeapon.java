package MiniGameProject.Items.Weapons;

/**
 * Class that allows the creation of instances of SlashWeapon.
 * @author Zachary House
 * @version 04/09/18
 */
public class SlashWeapon extends Weapon
{
    /** The "random" chance that an ability tied to this weapon will be activated. */
    double procChance;
    /** The special action, which is tied to the weapon, that can occur. */
    String ability;
    
    /**
     * Constructor use to create an instance of SlashWeapon.
     * @param name The name of the weapon, which can be changed in-game.
     * @param description The description of the weapon.
     * @param baseDamage The base damage value that is given to the weapon.
     * @param weight The weight of the weapon.
     * @param procChance The "random" chance that an ability tied to this weapon will be activated.
     * @param ability The special action which is tied to the weapon, that can occur.
     */
    public SlashWeapon(String name, String description, double baseDamage, double weight, double procChance, String ability)
    {
        super(name, description, baseDamage, weight );
        this.procChance = procChance;
        this.ability = ability;
    }
    
    /** @return Returns the "random" chance that an ability tied to this weapon will be activated. */
    public double getProcChance()
    {
        return procChance;
    }
    
    /** Changes the chance that the weapon's special ability has to occur.
     * @param procChance A percentage in decimal form that determines that frequency of the weapon's special ability occurring. */
    public void setProcChance(double procChance)
    {
        this.procChance = procChance;
    }
    
    /** @return Returns the special action of the weapon. */
    public String getAbility()
    {
        return ability;
    }
    
    /** Changes the special ability of the weapon.
     * @param ability The special action to be placed on the weapon. */
    public void setAbility(String ability)
    {
        this.ability = ability;
    }
}
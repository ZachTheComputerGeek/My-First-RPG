/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniGameProject;

/**
 * This class will handle this instance of Player and most of the stuff that directly involved it.
 * @author Zachary House
 * @version 04/06/18
 */
public class Player
{
    /** Name of the player */
    private String name, description = "What can I say? Hands, feet, face, flour, sugar, two eggs, and half a cup of milk.";
    /** Various stats pertaining to the player. */
    private int constitution, magick, strength, agility, intelligence;
    
    /**
     * Constructor that allows the creation of instances of Player.
     * @param name Name of the player
     * @param constitution Player stat that handles the amount of health points (HP) they have
     * @param magick Player stat that handles the amount of mana points (MP) they have
     * @param strength Player stat that handles the amount of melee attack damage they deal
     * @param agility Player stat that handles the amount of ranged attack damage they deal
     * @param intelligence Player stat that handles the amount of magical attack damage they deal
     */
    public Player( String name, int constitution, int magick, int strength, int agility, int intelligence )
    {
        this.name = name;
        this.constitution = constitution;
        this.magick = magick;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }
    
    /** @return Returns the name of the (player's) character. */
    public String getName()
    {
        return this.name;
    }
    
    /** @return Returns the description of the (player's) character. */
    public String getDescription()
    {
        return this.description;
    }
    
    /** @return Returns the value of the player's constitution stat. */
    public int getConstitution()
    {
        return constitution;
    }
    
    /** @return Returns the value of the player's magick stat. */
    public int getMagick()
    {
        return magick;
    }
    
    /** @return Returns the value of the player's strength stat. */
    public int getStrength()
    {
        return strength;
    }
    
    /** @return Returns the value of the player's agility stat. */
    public int getAgility()
    {
        return agility;
    }
    
    /** @return Returns the value of the player's intelligence stat. */
    public int getIntelligence()
    {
        return intelligence;
    }
}

package com.isep.rpg;

import java.util.LinkedList;
import java.util.List;

public abstract class Hero {
    public int lifePoints;
    public int armor;
    public int weaponDamage;
    private List<Potion,Food> LinkedList;
    public List<Potion>soin = LinkedList<>();
    public List<Food>soin2 = LinkedList<>();
    public Hero(int lifePoints,int armor,int weaponDamage){
        this lifePoints = lifePoints;
        this armor = armor;
        this weaponDamage = weaponDamage;

    public abstract void attack();
    public abstract void defend();
    public abstract void useConsumable(Consummable);

}

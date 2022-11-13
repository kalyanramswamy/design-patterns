package com.designpattern.structural.flyweight.potionExample.factoryMethod;

import com.designpattern.structural.flyweight.potionExample.enums.PotionType;
import com.designpattern.structural.flyweight.potionExample.potions.HealingPotion;
import com.designpattern.structural.flyweight.potionExample.potions.InvisibilityPotion;
import com.designpattern.structural.flyweight.potionExample.potions.Potion;
import com.designpattern.structural.flyweight.potionExample.potions.StrengthPotion;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class PotionFactory {

    private Map<PotionType, Potion> potionMap;

    public PotionFactory() {
        potionMap = new EnumMap<>(PotionType.class);
    }

    public Potion createPotion(PotionType potionType) {
        Potion potion = null;
        if(potionMap.containsKey(potionType)) {
            potion = potionMap.get(potionType);
        } else {
            switch (potionType) {
                case HEALING:
                    potion = new HealingPotion();
                    potionMap.put(PotionType.HEALING, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potionMap.put(PotionType.INVISIBILITY, potion);
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    potionMap.put(PotionType.STRENGTH, potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }
}

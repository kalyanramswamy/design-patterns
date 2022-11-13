package com.designpattern.structural.bridge;

import com.designpattern.structural.bridge.enchantment.SoulEatingEnchantment;
import com.designpattern.structural.bridge.wepons.AbstractWeapon;
import com.designpattern.structural.bridge.wepons.Sword;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
    public static void main(String[] args) {

        LOGGER.info("The knight receives an soulEating enchanted sword.");
        AbstractWeapon enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        LOGGER.info("The knight receives an flying enchanted hammer.");
        AbstractWeapon flyingSword = new Sword(new SoulEatingEnchantment());
        flyingSword.wield();
        flyingSword.swing();
        flyingSword.unwield();
    }
}

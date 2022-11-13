package com.designpattern.structural.bridge.wepons;

import com.designpattern.structural.bridge.enchantment.Enchantment;

public interface AbstractWeapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}

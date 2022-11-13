package com.designpattern.structural.bridge.enchantment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SoulEatingEnchantment.
 */
public class SoulEatingEnchantment implements Enchantment {

  private static final Logger LOGGER = LoggerFactory.getLogger(SoulEatingEnchantment.class);

  public void onActivate() {
    LOGGER.info("The item spreads bloodlust.");
  }

  public void apply() {
    LOGGER.info("The item eats the soul of enemies.");
  }

  public void onDeactivate() {
    LOGGER.info("Bloodlust slowly disappears.");
  }
}
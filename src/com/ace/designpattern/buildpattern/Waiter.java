// Copyright (c) 1998-2013 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2013-XX-XX, ace.li, creation
// ============================================================================
package com.ace.designpattern.buildpattern;

/**
 * @author ace.li
 *
 */
public class Waiter extends People{

    /**
     * @param name
     */
    public Waiter(final String name) {
        super(name);
    }

    /**
     * @param size
     * @param drink
     */
    public Drink getDrink(final String drinkName, final String size) {
        return DrinkBuildFactory.getDrinkBuild(drinkName).buildDrink(size);
    }


}

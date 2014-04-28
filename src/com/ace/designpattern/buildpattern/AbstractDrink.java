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
public abstract class AbstractDrink implements Drink {
    protected String drinkName;
    protected String drinkSize;

    public AbstractDrink(final String drinkName, final String drinkSize) {
        this.drinkName = drinkName;
        this.drinkSize = drinkSize;
    }

    protected void getdrink() {

    }

    @Override
    public String drinkName() {
        return this.drinkName;
    }

    @Override
    public String drinkSize() {
        return this.drinkSize;
    }

    @Override
    public void printInfo() {
        System.out.println("drinkName : " + this.drinkName
                + "\nsize : " + this.drinkSize + "\nThat's so good");
    }


}

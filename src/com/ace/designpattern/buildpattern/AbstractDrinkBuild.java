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
public abstract class AbstractDrinkBuild implements DrinkBuild {
    protected Drink drink;

    @Override
    public Drink buildDrink(final String size) {
        return build(size);
    }

    /**
     * @return
     */
    protected abstract Drink build(final String size);


}

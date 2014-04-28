// Copyright (c) 1998-2013 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2013-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.statepattern;

import com.ace.designpattern.buildpattern.AbstractDrink;

/**
 * @author Ace.Li
 *
 */
public class Tea extends AbstractDrink {

    /**
     * @param drinkName
     * @param drinkSize
     */
    public Tea(final String drinkName, final String drinkSize) {
        super(drinkName, drinkSize);
        getdrink();
    }



}

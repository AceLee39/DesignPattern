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
public class CoffeeBuild extends AbstractDrinkBuild {

    /* (non-Javadoc)
     * @see com.ace.designpattern.buildpattern.AbstractDrinkBuild#build(java.lang.String)
     */
    @Override
    protected Drink build(final String size) {
        return new Coffee(size);
    }

}

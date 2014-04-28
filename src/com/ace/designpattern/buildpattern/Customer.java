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
public class Customer extends People{

    /**
     * @param string
     */
    public Customer(final String name) {
        super(name);
    }

    /**
     * @param string
     * @param string
     */
    public Drink callWaiter(final Waiter waiter, final String drinkName, final String size) {
        System.out.println(name + " call " + waiter.getName());
        return waiter.getDrink(drinkName, size);
    }


}

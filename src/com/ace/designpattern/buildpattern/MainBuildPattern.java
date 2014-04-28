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
public class MainBuildPattern {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final Customer cust1 = new Customer("Mr.ace C");
        final Waiter waiter1 = new Waiter("ace W");
        final Drink tea = cust1.callWaiter(waiter1, "Tea", "L");
        tea.printInfo();
        System.out.println("I want a Coffee too!");
        final Drink coffee = cust1.callWaiter(waiter1, "Coffee", "S");
        coffee.printInfo();
    }

}

// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.observerpattern.game;

/**
 * @author Ace.Li
 *
 */
public class TestObserver {
    public static void main(final String[] args) {
        final AllyControlCenter acc = new ConcreteAllyControlCenter();
        final Observer ace = new Player("ace");
        final Observer frank = new Player("frank");
        final Observer camille = new Player("camille");
        acc.join(ace);
        acc.join(frank);
        acc.join(camille);
        camille.beAttacked(acc);

        final Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }
       );

    }
}

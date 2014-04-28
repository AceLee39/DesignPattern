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
public class ConcreteAllyControlCenter extends AllyControlCenter {

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.game.AllyControlCenter#notifyObserver()
     */
    @Override
    protected void notifyObserver(final String name) {
        for (final Observer player : players) {
            if(!player.getName().equalsIgnoreCase(name) && !"frank".equalsIgnoreCase(player.getName())) {
                player.help();
            }
        }
    }

}

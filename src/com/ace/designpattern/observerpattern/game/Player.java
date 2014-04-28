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
public class Player implements Observer {
    private String name;

    public Player(final String name) {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.game.Observer#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.game.Observer#setName()
     */
    @Override
    public void setName(final String name) {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.game.Observer#help()
     */
    @Override
    public void help() {
        System.out.println("hold no :" + this.name + ", I'm going to save you!");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.game.Observer#beAttacked(com.ace.designpattern.observerpattern.game.AllyControlCenter)
     */
    @Override
    public void beAttacked(final AllyControlCenter acc) {
        System.out.println("I'm attacking, help " + this.name);
        acc.notifyObserver(name);
    }

}

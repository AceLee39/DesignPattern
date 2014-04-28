// Copyright (c) 1998-2013 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2013-XX-XX, ace.li, creation
// ============================================================================
package com.ace.designpattern.adapterpattern;

/**
 * @author ace.li
 *
 */
public abstract class Player implements PlayerAction {
    protected String name;
    protected String location;

    public Player() {}

    public Player(final String name) {
        this.name = name;
    }

    public Player(final String name, final String location) {
        this(name);
        this.location = location;
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.adapterpattern.PlayerAction#attack()
     */
    @Override
    public void attack() {
        System.out.println(this.location+ " : " + name + " : attack");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.adapterpattern.PlayerAction#defense()
     */
    @Override
    public void defense() {
        System.out.println(this.location + " : " + name + " : defense");
    }
}

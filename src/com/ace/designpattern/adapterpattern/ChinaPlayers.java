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
public class ChinaPlayers extends Player {

    /**
     * @param string
     */
    public ChinaPlayers(final String name, final String location) {
        super(name);
        this.location = location;
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.adapterpattern.Player#attack()
     */
    @Override
    public void attack() {
        System.out.println(" : " + name + "进攻");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.adapterpattern.Player#defense()
     */
    @Override
    public void defense() {
        System.out.println("ForeignPlayers : " + name + "防守");
    }
}

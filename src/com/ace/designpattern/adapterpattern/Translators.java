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
public class Translators {
    PlayerAction playerAction;

    public Translators(final PlayerAction playerAction){
        this.playerAction = playerAction;
    }

    public void attack() {
        playerAction.attack();
    }

    public void defense() {
        playerAction.defense();
    }
}

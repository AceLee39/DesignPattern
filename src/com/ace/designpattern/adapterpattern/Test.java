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
public class Test {
    public static void main(final String[] args) {
        final PlayerAction bde = new Forwards("bde");
        bde.attack();
        final PlayerAction md = new Guards("md");
        md.attack();
        final PlayerAction ym = new ChinaPlayers("ym", "Center");
        final Translators translators = new Translators(ym);
        translators.defense();
    }
}

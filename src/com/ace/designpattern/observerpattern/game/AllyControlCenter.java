// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.observerpattern.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ace.Li
 *
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected List<Observer> players = new ArrayList<Observer>();
    /**
     * @return the allyName
     */
    public String getAllyName() {
        return allyName;
    }
    /**
     * @param allyName the allyName to set
     */
    public void setAllyName(final String allyName) {
        this.allyName = allyName;
    }

    public void join(final Observer player) {
        players.add(player);
    }

    public void quit(final Observer player) {
        players.remove(player);
    }

    protected abstract void notifyObserver(final String name);
}

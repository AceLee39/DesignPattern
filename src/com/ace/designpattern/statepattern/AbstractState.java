// Copyright (c) 1998-2013 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2013-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.statepattern;

/**
 * @author Ace.Li
 *
 */
public abstract class AbstractState implements State{
    protected GumballMachine gumballMachine;

    public AbstractState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.statepattern.State#insertQuarter()
     */
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.statepattern.State#ejectQuarter()
     */
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.statepattern.State#turnCrank()
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.statepattern.State#dispense()
     */
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}

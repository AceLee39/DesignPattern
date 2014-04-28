// Copyright (c) 1998-2013 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2013-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.statepattern.state;

import com.ace.designpattern.statepattern.AbstractState;
import com.ace.designpattern.statepattern.GumballMachine;

/**
 * @author Ace.Li
 * 没有投币的状态
 */
public class NoQuarterState extends AbstractState {

    /**
     * @param gumballMachine
     */
    public NoQuarterState(final GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        super.insertQuarter();
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }



}

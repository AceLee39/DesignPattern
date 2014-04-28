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
 * 已经投币的状态
 */
public class HasQuarterState extends AbstractState {

    /**
     * @param gumballMachine
     */
    public HasQuarterState(final GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void ejectQuarter() {
        super.ejectQuarter();
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void turnCrank() {
        super.turnCrank();
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }


}

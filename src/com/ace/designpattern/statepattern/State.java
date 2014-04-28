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
 * 封装四种动作，投币、退币、转动摇柄、发糖果
 */
public interface State {
    /**
     * 投币
     */
    void insertQuarter();
    /**
     * 退币
     */
    void ejectQuarter();
    /**
     * 转动摇柄
     */
    void turnCrank();
    /**
     * 发糖果
     */
    void dispense();
}

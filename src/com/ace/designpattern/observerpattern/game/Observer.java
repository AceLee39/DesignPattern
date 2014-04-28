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
public interface Observer {
    String getName();
    void setName(String name);
    void help();
    void beAttacked(AllyControlCenter acc);
}

// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.observerpattern;

/**
 * @author Ace.Li
 *
 */
public class Test {
    public static void main(final String[] args) {
        final Subject sub = new ConcreteSubject();
        final Observer mouse = new MouseObserver();
        final Observer user = new UserObserver();
        sub.registerObserver(mouse);
        sub.registerObserver(user);
        sub.setStatus("rainning");
    }
}

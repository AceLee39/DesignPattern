// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.singletonpattern;

/**
 * @author Ace.Li
 *
 */
public class Singleton {

    private Singleton() {}

    private static class HandlerClass {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
       return HandlerClass.instance;
    }
}

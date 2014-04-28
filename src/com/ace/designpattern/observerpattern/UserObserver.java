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
public class UserObserver implements Observer {

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.Observer#update(java.lang.String)
     */
    @Override
    public void update(final String status) {
        System.out.println("user status :" + status);
    }

}

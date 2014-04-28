// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ace.Li
 *
 */
public class ConcreteSubject implements Subject {
    List<Observer> observers = new ArrayList<Observer>();
    private String status;

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.Subject#registerObserver()
     */
    @Override
    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.Subject#removeObserver()
     */
    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.observerpattern.Subject#notifyObserver()
     */
    @Override
    public void notifyObserver() {
        for (final Observer o : observers) {
            o.update(status);
        }
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

/* (non-Javadoc)
 * @see com.ace.designpattern.observerpattern.Subject#setStatus(java.lang.String)
 */
    @Override
    public void setStatus(final String status) {
        this.status = status;
        notifyObserver();
    }
}

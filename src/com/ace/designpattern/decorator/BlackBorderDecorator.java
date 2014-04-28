// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.decorator;

/**
 * @author Ace.Li
 *
 */
public class BlackBorderDecorator extends ComponentDecorator {

    /**
     * @param component
     */
    public BlackBorderDecorator(final Component component) {
        super(component);
    }

    private void setBlackBorder() {
        System.out.println("got BlackBorder");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.decorator.ComponentDecorator#addDisplay()
     */
    @Override
    protected void addDisplay() {
        setBlackBorder();
    }
}

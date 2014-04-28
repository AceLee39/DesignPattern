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
public class ScrollBarDecorator extends ComponentDecorator {

    /**
     * @param component
     */
    public ScrollBarDecorator(final Component component) {
        super(component);
    }

    private void setScrollBar() {
        System.out.println("got scrollBar");
    }

    /* (non-Javadoc)
     * @see com.ace.designpattern.decorator.ComponentDecorator#addDisplay()
     */
    @Override
    protected void addDisplay() {
        setScrollBar();
    }
}

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
public class Window extends Component{

    /* (non-Javadoc)
     * @see com.ace.designpattern.decorator.Component#display()
     */
    @Override
    protected void display() {
        System.out.println("Show window");
    }

}

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
public class TestDecorator {
    public static void main(final String[] args) {
        final Component window = new Window();
        final Component listBox = new ListBox();
        final ComponentDecorator decorator = new BlackBorderDecorator(window);
        final ComponentDecorator decorator1 = new ScrollBarDecorator(decorator);
        final ComponentDecorator decorator3 = new BlackBorderDecorator(decorator1);
        decorator.display();
        decorator1.display();
        decorator3.display();
    }
}

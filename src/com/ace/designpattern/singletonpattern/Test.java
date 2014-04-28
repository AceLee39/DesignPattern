// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.singletonpattern;

import java.awt.BorderLayout;

import javax.swing.JButton;

/**
 * @author Ace.Li
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final TestJFrame instance = TestJFrame.getInstance();
        instance.getContentPane().setLayout(new BorderLayout());
        instance.getContentPane().add(new JButton("ace"), BorderLayout.CENTER);
    }

}

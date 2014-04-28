// Copyright (c) 1998-2014 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2014-XX-XX, Ace.Li, creation
// ============================================================================
package com.ace.designpattern.singletonpattern;

import javax.swing.JFrame;

/**
 * @author Ace.Li
 *
 */
public class TestJFrame extends JFrame {

    private TestJFrame() {
        this.setTitle("TestJFrame");
        this.setSize(200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private static class GetJFrame {
        private static TestJFrame instance = new TestJFrame();
    }

    public static TestJFrame getInstance() {
        return GetJFrame.instance;
    }
}

// Copyright (c) 1998-2013 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2013-XX-XX, ace.li, creation
// ============================================================================
package com.ace.designpattern.buildpattern;

import org.apache.commons.lang.ClassUtils;

/**
 * @author ace.li
 *
 */
public class DrinkBuildFactory {
    private static final String DIY_DRINK_BUILD_PATH = "com.ace.designpattern.buildpattern.%sBuild";
    private static DrinkBuild drinkBuild;

    public static DrinkBuild getDrinkBuild(final String drinkName) {
        initDrinkBuild(drinkName);
        return DrinkBuildFactoryHandler.drinkBuildFactory.getDrinkBuild();
    }

    /**
     * @param drinkName
     */
    private static void initDrinkBuild(final String drinkName) {
        try {
            final String classPath = String.format(DIY_DRINK_BUILD_PATH, drinkName);
            drinkBuild = (DrinkBuild) ClassUtils.getClass(classPath).newInstance();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    private DrinkBuild getDrinkBuild() {
        return drinkBuild;
    }

    private static class DrinkBuildFactoryHandler {
        private static final DrinkBuildFactory drinkBuildFactory = new DrinkBuildFactory();
    }

}

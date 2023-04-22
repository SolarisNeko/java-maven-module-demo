package com.neko233.aop;

import com.neko233.commons.ObjectUtils233;

/**
 * @author SolarisNeko
 * Date on 2023-04-22
 */
public class DependencyTest {

    public static String testObjectUtils(String name) {
        if (ObjectUtils233.isAnyNull(name)) {
            return null;
        }
        return name;
    }
}

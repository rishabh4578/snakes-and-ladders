package org.demo;

import java.util.Random;

public class Utils {

    private static Random rnd;

    public static String generateGameUID() {
        String template = "G-%s";
        return String.format(template, getCurrentTimeInMillis());
    }

    public static String generatePlayerUID() {
        String template = "G-%s";
        return String.format(template, getCurrentTimeInMillis());
    }

    private static Object getCurrentTimeInMillis() {
        return System.currentTimeMillis();
    }

    public static int rollDie() {
        if (rnd == null)
            rnd = new Random();
        return rnd.nextInt(1, 6);
    }
}

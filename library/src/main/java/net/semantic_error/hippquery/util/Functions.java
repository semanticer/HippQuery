package net.semantic_error.hippquery.util;

import java.util.Objects;

/**
 * Created by semanticer on 19. 12. 2015.
 */
public class Functions {

    public Functions() {}

    public static String sum(String a) {
        return "SUM("+a+")";
    }
    public static String avg(String a) {
        return "AVG("+a+")";
    }
    public static String max(String a) {
        return "MAX("+a+")";
    }
    public static String min(String a) {
        return "MIN("+a+")";
    }
}

package net.semantic_error.hippquery.util;

/**
 * Created by semanticer on 14. 12. 2015.
 */
public class QueryUtils {
    /**
     * Helper function to concat fields to
     * @param arr
     * @param sep
     * @return
     */
    public static String join(String[] arr, String sep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = arr.length; i < il; i++) {
            if (i > 0) {
                sbStr.append(sep);
            }
            sbStr.append(arr[i]);
        }
        return sbStr.toString();
    }
}

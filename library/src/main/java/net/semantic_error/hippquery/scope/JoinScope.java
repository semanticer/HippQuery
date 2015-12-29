package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 18. 12. 2015.
 */
public interface JoinScope extends BaseScope {
    FromScope on(String condition);

    /**
     * Convenience method for creating most used form of ON statement with equals condition between two columns.
     * on(col1,col2) is equivalent to on(col1=col2) see {@link this#on(String)}
     * @param firstColumn of the condition
     * @param secondColumn of the condition
     * @return new Query with new ON statement at the end
     */
    FromScope on(String firstColumn, String secondColumn);
}

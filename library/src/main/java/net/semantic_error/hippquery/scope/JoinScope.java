package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 18. 12. 2015.
 */
public interface JoinScope extends BaseScope {
    FromScope on(String condition);
    FromScope on(String firstColumn, String secondColumn);
}

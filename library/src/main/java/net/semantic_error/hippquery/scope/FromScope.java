package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 18. 12. 2015.
 */
public interface FromScope extends WhereScope {
    JoinScope join(String table);
    WhereScope where(String condition);
}

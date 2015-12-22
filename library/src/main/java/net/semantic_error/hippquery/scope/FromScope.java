package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 18. 12. 2015.
 */
public interface FromScope extends WhereScope {
    JoinScope join(String table);
    JoinScope join(String table, String alias);
    JoinScope leftJoin(String table);
    JoinScope leftJoin(String table, String alias);
    WhereScope where(String condition);
}

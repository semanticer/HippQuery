package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 18. 12. 2015.
 */
public interface WhereScope extends GroupByScope {
    WhereScope and(String condition);
    WhereScope or(String condition);
    GroupByScope groupBy(String... fields);
}

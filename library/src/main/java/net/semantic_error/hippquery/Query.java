package net.semantic_error.hippquery;

import net.semantic_error.hippquery.scope.AllScopes;
import net.semantic_error.hippquery.scope.BaseScope;
import net.semantic_error.hippquery.scope.FromScope;
import net.semantic_error.hippquery.scope.GroupByScope;
import net.semantic_error.hippquery.scope.HavingScope;
import net.semantic_error.hippquery.scope.JoinScope;
import net.semantic_error.hippquery.scope.LimitScope;
import net.semantic_error.hippquery.scope.OrderByScope;
import net.semantic_error.hippquery.scope.SelectScope;
import net.semantic_error.hippquery.scope.WhereScope;
import net.semantic_error.hippquery.util.QueryUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by semanticer on 14. 12. 2015.
 * https://www.sqlite.org/lang_select.html
 */
public class Query implements AllScopes {

    private final String content;

    private Query(String content) {
        this.content = content;
    }

    public static SelectScope select(String... fields) {
        return new Query("SELECT " + QueryUtils.join(fields, ","));
    }

    @Override
    public FromScope from(String table) {
        return raw("FROM " + table);
    }

    @Override
    public JoinScope join(String table) {
        return raw("JOIN " + table);
    }

    @Override
    public FromScope on(String condition) {
        return raw("ON(" + condition + ")");
    }

    @Override
    public WhereScope where(String condition) {
        return raw("WHERE " + condition);
    }

    @Override
    public WhereScope and(String condition) {
        return raw("AND " + condition);
    }

    @Override
    public WhereScope or(String condition) {
        return raw("OR " + condition);
    }


    @Override
    public GroupByScope groupBy(String... fields) {
        return raw("GROUP BY " + QueryUtils.join(fields, ","));
    }

    @Override
    public HavingScope having(String condition) {
        return raw("HAVING " + condition);
    }

    @Override
    public OrderByScope orderBy(String... fields) {
        return raw("ORDER BY " + QueryUtils.join(fields, ","));
    }

    @Override
    public LimitScope limit(int limit) {
        return raw("LIMIT " + limit);
    }

    @Override
    public BaseScope offset(int offset) {
        return raw("OFFSET " + offset);
    }

    @Override
    public AllScopes raw(String queryPart) {
        return new Query(content + " " + queryPart);
    }

    @Override
    public String toString() {
        return content;
    }
}

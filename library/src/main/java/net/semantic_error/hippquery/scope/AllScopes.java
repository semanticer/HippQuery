package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 19. 12. 2015.
 */
public interface AllScopes extends
        SelectScope,
        FromScope,
        JoinScope,
        WhereScope,
        GroupByScope,
        HavingScope,
        OrderByScope,
        LimitScope {}

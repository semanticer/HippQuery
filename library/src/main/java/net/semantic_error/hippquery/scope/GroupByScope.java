package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 19. 12. 2015.
 */
public interface GroupByScope extends HavingScope {
    HavingScope having(String condition);
}

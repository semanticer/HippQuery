package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 19. 12. 2015.
 */
public interface BaseScope {
    /**
     * Provides a method to insert raw sql query part to your query
     * @param queryPart part or full sql query
     * @return new query with raw part on the end
     */
    AllScopes raw(String queryPart);
}

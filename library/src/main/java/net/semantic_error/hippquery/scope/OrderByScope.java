package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 19. 12. 2015.
 */
public interface OrderByScope extends BaseScope {
    LimitScope limit(int limit);
}

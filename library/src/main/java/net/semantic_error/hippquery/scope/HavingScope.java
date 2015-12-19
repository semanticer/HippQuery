package net.semantic_error.hippquery.scope;

/**
 * Created by semanticer on 19. 12. 2015.
 */
public interface HavingScope extends OrderByScope {
    // TODO Having nema and a or protoze se to pere s where kterej to overridne
    // TODO reseni by bylo ty logicke operatory pojmenovaat nejak jinak
    // TODO dalsi problem ale je ze tim dam and a or vsem potomkum HavingScope takze i Group by je pak ma
//    HavingScope _and(String condition);
//    HavingScope _or(String condition);
    OrderByScope orderBy(String... fields);
}

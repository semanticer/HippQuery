package net.semantic_error.hippquery.sample;

import android.provider.BaseColumns;

/**
 * Created by semanticer on 30. 12. 2015.
 */
public class AuthorContract {

    public static abstract class AuthorkEntry implements BaseColumns {
        public static final String TABLE_NAME = "Author";
        public static final String COLUMN_FIRST_NAME = "first_name";
        public static final String COLUMN_LAST_NAME = "last_name";
    }
}

package net.semantic_error.hippquery.sample;

import android.provider.BaseColumns;

/**
 * Created by semanticer on 30. 12. 2015.
 */
public class BookContract {

    BookContract () {}

    public static abstract class BookEntry implements BaseColumns {
        public static final String TABLE_NAME = "Book";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_PAGE_COUNT = "page_count";
        public static final String COLUMN_AUTHOR = "author_id";
    }
}

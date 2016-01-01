package net.semantic_error.hippquery.sample;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import net.semantic_error.hippquery.sample.AuthorContract.AuthorkEntry;
import net.semantic_error.hippquery.sample.BookContract.BookEntry;
import net.semantic_error.hippquery.Query;

/**
 * Created by semanticer on 30. 12. 2015.
 */
public class LibraryRepository {

    private final SQLiteDatabase db;

    LibraryRepository (Context context) {
        DbOpenHelper openHelper = new DbOpenHelper(context);
        db = openHelper.getWritableDatabase();
    }

    Cursor getBestAuthors() {
        String query = Query.select(AuthorkEntry.COLUMN_LAST_NAME)
                .from(AuthorkEntry.COLUMN_FIRST_NAME)
                .toString();

        return db.rawQuery(query, null);
    }

}

package net.semantic_error.hippquery.sample;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import net.semantic_error.hippquery.sample.AuthorContract.AuthorkEntry;
import net.semantic_error.hippquery.sample.BookContract.BookEntry;
import net.semantic_error.hippquery.Query;

import static net.semantic_error.hippquery.util.Functions.max;
import static net.semantic_error.hippquery.util.Functions.sum;

/**
 * Created by semanticer on 30. 12. 2015.
 */
public class LibraryRepository {

    private final SQLiteDatabase db;

    LibraryRepository (Context context) {
        DbOpenHelper openHelper = new DbOpenHelper(context);
        db = openHelper.getWritableDatabase();
    }

    Cursor getMostProductioveAuthors(int topCount) {
        String query = Query
                .select(AuthorkEntry.COLUMN_FIRST_NAME, AuthorkEntry.COLUMN_LAST_NAME, sum(BookEntry.COLUMN_PAGE_COUNT))
                .from(AuthorkEntry.TABLE_NAME, "a")
                .join(BookEntry.TABLE_NAME, "b")
                .on("a."+ AuthorkEntry._ID, "b." + BookEntry.COLUMN_AUTHOR)
                .groupBy("a."+AuthorkEntry._ID)
                .orderBy(sum(BookEntry.COLUMN_PAGE_COUNT))
                .limit(0)
                .offset(topCount)
                .toString();

        return db.rawQuery(query, null);
    }

}

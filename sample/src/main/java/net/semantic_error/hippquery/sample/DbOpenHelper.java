package net.semantic_error.hippquery.sample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import net.semantic_error.hippquery.sample.AuthorContract.AuthorkEntry;
import net.semantic_error.hippquery.sample.BookContract.BookEntry;

/**
 * Created by semanticer on 14. 12. 2015.
 */
public class DbOpenHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Library.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String INT_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_AUTHOR_TABLE =
            "CREATE TABLE " + AuthorkEntry.TABLE_NAME + " (" +
                    AuthorkEntry._ID + " INTEGER PRIMARY KEY," +
                    AuthorkEntry.COLUMN_FIRST_NAME + TEXT_TYPE + COMMA_SEP +
                    AuthorkEntry.COLUMN_LAST_NAME + TEXT_TYPE +
                    " )";

    private static final String SQL_CREATE_BOOK_TABLE =
            "CREATE TABLE " + BookEntry.TABLE_NAME + " (" +
                    BookEntry._ID + " INTEGER PRIMARY KEY," +
                    BookEntry.COLUMN_TITLE + TEXT_TYPE + COMMA_SEP +
                    BookEntry.COLUMN_PAGE_COUNT + INT_TYPE +  COMMA_SEP +
                    BookEntry.COLUMN_AUTHOR + INT_TYPE +
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + AuthorkEntry.TABLE_NAME + COMMA_SEP + BookEntry.TABLE_NAME;

    public DbOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_AUTHOR_TABLE);
        db.execSQL(SQL_CREATE_BOOK_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}

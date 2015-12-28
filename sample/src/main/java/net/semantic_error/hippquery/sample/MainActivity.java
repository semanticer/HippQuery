package net.semantic_error.hippquery.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import net.semantic_error.hippquery.Query;
import net.semantic_error.hippquery.sample.R;

import static net.semantic_error.hippquery.util.Functions.sum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 28. 12. 2015 Test with real database
        String q = Query.select("Name", sum("points"))
                .from("Users AS u")
                .join("Result AS r").on("r.user = u.id")
                .where("u.name LIKE 'Something'").and("u.age > 18")
                .groupBy("u.id")
                .having(sum("points") + ">100")
                .orderBy("u.age")
                .toString();

        Log.d("MainActivity", q);
    }
}

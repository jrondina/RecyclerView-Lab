package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview2);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObject> customObjects = new ArrayList<>();
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());
        customObjects.add(new CustomObject());


        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(customObjects);
        mRecyclerView.setAdapter(adapter);
    }
}

package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by jamesrondina on 7/5/16.
 */
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<CustomObject> mCustomObjectsList;

    public CustomRecyclerViewAdapter(final List<CustomObject> customObjectList) {
        mCustomObjectsList = customObjectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.mTextView1.setText("Title");
        holder.mTextView2.setText("Description");
        holder.mSquare.setText("Color");

    }

    @Override
    public int getItemCount() {
        return mCustomObjectsList.size();
    }
}

package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jamesrondina on 7/5/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView mSquare;
    TextView mTextView1;
    TextView mTextView2;

    public CustomViewHolder(View itemView) {
        super(itemView);

        mSquare = (TextView) itemView.findViewById(R.id.square);
        mTextView1 = (TextView) itemView.findViewById(R.id.text1);
        mTextView2 = (TextView) itemView.findViewById(R.id.text2);
    }

}

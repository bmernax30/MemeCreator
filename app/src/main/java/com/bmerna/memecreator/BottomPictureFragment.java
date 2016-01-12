
package com.bmerna.memecreator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {

    private static TextView bottomMemeText;
    private static TextView topMemeText;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment,container,false);

        bottomMemeText = (TextView) view.findViewById(R.id.bottomMemeText);
        topMemeText = (TextView) view.findViewById(R.id.topMemeText);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
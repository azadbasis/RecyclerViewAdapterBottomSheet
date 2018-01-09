package com.ivisionblog.apps.bottomsheetexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 10/3/17.
 */

public class BottomDialogFragment extends BottomSheetDialogFragment {
    public static BottomDialogFragment getInstance() {
        return new BottomDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    //    View view =  inflater.inflate(R.layout.bottom_sheet_fragment, container, false);
        View view =  inflater.inflate(R.layout.colapsable_nested_01, container, false);
      //  ((TextView)view.findViewById(R.id.name)).setText("Elon Musk");
        return view;
    }
}

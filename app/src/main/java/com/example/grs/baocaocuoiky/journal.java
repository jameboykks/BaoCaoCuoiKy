package com.example.grs.baocaocuoiky;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.Button;

public class journal extends Fragment implements View.OnClickListener {
    Button button;
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.journal,container,false);
        initUI();
        initControl();
       return v;


    }

    private void initControl() {
        button.setOnClickListener(this);
    }

    private void initUI() {
         button =(Button) v.findViewById(R.id.btncall);
    }







    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncall:
                call();
                break;
        }

    }

    private void call() {
        Intent i=new Intent(getActivity(),CallActivity.class);
        getActivity().startActivity(i);

    }
}

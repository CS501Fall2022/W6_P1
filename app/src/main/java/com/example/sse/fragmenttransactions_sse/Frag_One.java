package com.example.sse.fragmenttransactions_sse;


import android.app.Fragment;
import android.os.Bundle;
//import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_One extends Fragment {


    public Frag_One() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("CLone","onCreateView invoked");
        return inflater.inflate(R.layout.frag_one, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CLone","onStart invoked");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("CLone","onResume invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("CLone","onPause invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("CLone","onStop invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("CLone","onDestroy invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("CLone","onDestroyView invoked");
    }

}

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
public class Frag_Two extends Fragment {


    public Frag_Two() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("CLtwo","onCreateView invoked");
        return inflater.inflate(R.layout.frag_two, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CLtwo","onStart invoked");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("CLtwo","onResume invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("CLtwo","onPause invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("CLtwo","onStop invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("CLtwo","onDestroy invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("CLtwo","onDestroyView invoked");
    }

}

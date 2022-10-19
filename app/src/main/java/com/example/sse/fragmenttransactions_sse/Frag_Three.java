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
public class Frag_Three extends Fragment {


    public Frag_Three() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("CLthree","onCreateView invoked");
        return inflater.inflate(R.layout.frag_three, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CLthree","onStart invoked");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("CLthree","onResume invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("CLthree","onPause invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("CLthree","onStop invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("CLthree","onDestroy invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("CLthree","onDestroyView invoked");
    }

}

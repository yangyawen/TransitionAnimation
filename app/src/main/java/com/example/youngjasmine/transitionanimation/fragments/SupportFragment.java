package com.example.youngjasmine.transitionanimation.fragments;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.youngjasmine.transitionanimation.R;


public class SupportFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters

    // TODO: Rename and change types and number of parameters
    public static SupportFragment newInstance() {
        SupportFragment fragment = new SupportFragment();

        return fragment;
    }

    public SupportFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        TextView tv = new TextView(getActivity());
        tv.setText("Fragment");
        tv.setBackgroundColor(Color.RED);
        //return inflater.inflate(R.layout.fragment_surpport, container, false);
        return tv;
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim){
        switch (transit){
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE:
                if(enter){
                    return AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_in);
                } else{
                    return AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_out);
                }
            case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE:
                if(enter){
                    return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_close_enter);
                } else{
                    return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_close_exit);
                }
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN:
            default:
                if(enter){
                    return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_open_enter);
                } else{
                    return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_open_exit);
                }

        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}

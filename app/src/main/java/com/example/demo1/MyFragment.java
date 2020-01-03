package com.example.demo1;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.demo1.MainActivity.ACTION_CLASS_FORCE_FINISH;

/**
 * @Author luweicheng
 * @Date 2020-01-03-12:00
 */
public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_CLASS_FORCE_FINISH);
        getContext().registerReceiver(new MyReceiver(), intentFilter);
        getActivity().registerReceiver(new MyReceiver(), intentFilter);

    }
}

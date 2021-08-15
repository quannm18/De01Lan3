package com.example.de01lan3.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.de01lan3.R;
import com.example.de01lan3.adapter.SachAdapter;
import com.example.de01lan3.database.SachHelper;
import com.example.de01lan3.model.Sach;

import java.util.List;

public class HienThiFragment extends Fragment {
    private RecyclerView rcvMain;

    private List<Sach> sachList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hien_thi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcvMain = view.findViewById(R.id.rcvMain);
        SachHelper sachHelper = new SachHelper(getContext());
        sachList = sachHelper.getAllSach();
        SachAdapter sachAdapter = new SachAdapter(sachList);

        rcvMain.setAdapter(sachAdapter);
        rcvMain.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(getContext());
        rcvMain.setLayoutManager(linearLayoutManager);
    }
}
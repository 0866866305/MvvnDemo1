package com.example.mvvmdemotwo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mvvmdemotwo.databinding.FragmentBlankBinding;

import java.util.ArrayList;

public class BlankFragment extends Fragment {
    FragmentBlankBinding binding;
    StudentViewModel studentViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_blank, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        initListent();
    }


    private void initListent() {
        binding.btnGetdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initData();
            }
        });
    }
    int dem=0;

    private void initData() {
        studentViewModel=new ViewModelProvider(this).get(StudentViewModel.class);
        studentViewModel.initData();
        studentViewModel.liveData.observe(getViewLifecycleOwner(), new Observer<ArrayList<Students>>() {
            @Override
            public void onChanged(ArrayList<Students> students) {
                for (Students s: students
                     ) {

                    Log.e("TAG", "ltnghia: "+s.getName()+" "+s.getAdress()+" "+s.getAge()+" "+dem+1 );

                }
            }
        });
    }
}
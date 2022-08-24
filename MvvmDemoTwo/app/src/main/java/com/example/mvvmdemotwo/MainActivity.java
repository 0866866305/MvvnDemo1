package com.example.mvvmdemotwo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmdemotwo.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    StudentViewModel studentViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initData();
    }

    private void initData() {
        //KhoiTao
        studentViewModel = new ViewModelProvider(this).get(StudentViewModel.class);
        studentViewModel.initData();
        studentViewModel.liveData.observe(this, new Observer<ArrayList<Students>>() {
            @Override
            public void onChanged(ArrayList<Students> students) {
                for (Students s : students
                ) {
                    binding.tvShow.setText(s.getName()+" "+s.getAdress()+" "+s.getAge());

                }
            }
        });

    }
}
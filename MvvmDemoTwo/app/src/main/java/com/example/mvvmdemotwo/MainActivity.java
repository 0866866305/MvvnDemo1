package com.example.mvvmdemotwo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mvvmdemotwo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    public NavHostFragment navHostFragment;
    public NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
    }
    //    StudentViewModel studentViewModel;
// reseach how to init data viewModel
//    private void initData() {
//        //KhoiTao viewModel
//        studentViewModel = new ViewModelProvider(this).get(StudentViewModel.class);
//        studentViewModel.initData();
//        // lắng nghe sự thay đổi dữ liệu
//        studentViewModel.liveData.observe(this, new Observer<ArrayList<Students>>() {
//            @Override
//            public void onChanged(ArrayList<Students> students) {
//                for (Students s : students
//                ) {
//                    binding.tvShow.setText(s.getName()+" "+s.getAdress()+" "+s.getAge());
//
//                }
//            }
//        });
//
//    }
}
package com.example.mvvmdemotwo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class StudentViewModel extends ViewModel {
    MutableLiveData<ArrayList<Students>> liveData=new MutableLiveData<>();
    public  void  initData(){
        ArrayList<Students> list=new ArrayList<>();
        Students students=new Students("Hoang","Chi Dong",19);
        Students students1=new Students("khanh","Chi Dong1",20);
        Students students2=new Students("minh","Chi Dong2",21);
        Students students3=new Students("trinh","Chi Dong3",22);
        list.add(students);
        list.add(students1);
        list.add(students2);
        list.add(students3);
        liveData.postValue(list);
    }


}

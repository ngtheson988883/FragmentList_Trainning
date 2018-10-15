package com.example.nguyentheson.fragmentlist_trainning;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_StudentList extends Fragment {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    int displaymode;
    List<Student> list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_student, container, false);

        ListView lv = view.findViewById(R.id.lv_student_list);
        list  = new ArrayList();
        list.add(new Student("Nguyen Van A",1999, "Nha khong co", "abc@gmail.com"));
        list.add(new Student("Nguyen Van B",1999, "Nha khong co", "abc@gmail.com"));
        list.add(new Student("Nguyen Van C",1999, "Nha khong co", "abc@gmail.com"));
        list.add(new Student("Nguyen Van D",1999, "Nha khong co", "abc@gmail.com"));
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), R.layout.student_listview_fragment, list);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                displaymode= getActivity().getResources().getConfiguration().orientation;
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragment = new Fragment_StudentDetail();

                Bundle bundle = new Bundle();
                bundle.putSerializable("student", list.get(position));
                fragment.setArguments(bundle);
                if(displaymode == 1 ){
                    fragmentTransaction.replace(R.id.ll_first_container, fragment);
                } else {
                    fragmentTransaction.replace(R.id.ll_second_container, fragment);
                }
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}

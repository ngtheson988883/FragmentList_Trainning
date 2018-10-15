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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_StudentDetail extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_detail, container, false);

        Student student = (Student) getArguments().getSerializable("student");

        TextView tv_name = view.findViewById(R.id.tv_name_fragment_student_detail);
        TextView tv_birth_year = view.findViewById(R.id.tv_birth_year_fragment_student_detail);
        TextView tv_address = view.findViewById(R.id.tv_address_fragment_student_detail);
        TextView tv_email = view.findViewById(R.id.tv_email_fragment_student_detail);

        tv_name.setText(student.getName());
        tv_birth_year.setText(student.getBirth_year()+"");
        tv_address.setText(student.getAddress());
        tv_email.setText(student.getEmail());

        return view;
    }
}

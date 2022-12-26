package com.example.tpfinal_biblioteca.ui.todos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.tpfinal_biblioteca.databinding.FragmentTodosTitulosBinding;

public class TodosOsTitulosFragment extends Fragment {

private FragmentTodosTitulosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TodosOsTitulosViewModel todosOsTitulosViewModel = new ViewModelProvider(this)
                .get(TodosOsTitulosViewModel.class);

        binding = FragmentTodosTitulosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
package com.example.tpfinal_biblioteca.ui.romance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpfinal_biblioteca.databinding.FragmentRomanceBinding;

public class RomanceFragment extends Fragment {

private @NonNull FragmentRomanceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        RomanceViewModel romanceViewModel =
                new ViewModelProvider(this).get(RomanceViewModel.class);

        binding = FragmentRomanceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
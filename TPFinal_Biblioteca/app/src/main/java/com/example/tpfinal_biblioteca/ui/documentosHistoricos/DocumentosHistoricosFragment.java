package com.example.tpfinal_biblioteca.ui.documentosHistoricos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpfinal_biblioteca.databinding.FragmentDocumentosHistoricosBinding;

public class DocumentosHistoricosFragment extends Fragment {

private @NonNull FragmentDocumentosHistoricosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        DocumentosHistoricosViewModel documentosHistoricosViewModel = new ViewModelProvider(this)
                .get(DocumentosHistoricosViewModel.class);

         binding = FragmentDocumentosHistoricosBinding.inflate(inflater, container, false);
         View root = binding.getRoot();

        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
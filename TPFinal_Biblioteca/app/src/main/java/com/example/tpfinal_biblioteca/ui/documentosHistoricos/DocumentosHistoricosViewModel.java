package com.example.tpfinal_biblioteca.ui.documentosHistoricos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DocumentosHistoricosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DocumentosHistoricosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is documentos historicos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.example.tpfinal_biblioteca.ui.romance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RomanceViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RomanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is romance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
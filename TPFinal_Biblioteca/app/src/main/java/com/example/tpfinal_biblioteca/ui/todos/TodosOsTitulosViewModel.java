package com.example.tpfinal_biblioteca.ui.todos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TodosOsTitulosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TodosOsTitulosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is todos os titulos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.rohitsuthar.androidcustombottomnav.ui.contests;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContestsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContestsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is contests fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.rohitsuthar.androidcustombottomnav.ui.contests;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rohitsuthar.androidcustombottomnav.R;
import com.rohitsuthar.androidcustombottomnav.models.ContestsModel;

import java.util.ArrayList;

public class ContestsViewModel extends ViewModel {

    private ArrayList<ContestsModel> contestsModelArrayList;

    public ContestsViewModel() {
        contestsModelArrayList = new ArrayList<>();
        contestsModelArrayList.add(new ContestsModel(R.drawable.cricket_hero,R.drawable.liveicon, true, "Cricket Her", "Free","6hr:4m:44s", 5000,30,3000));
        contestsModelArrayList.add(new ContestsModel(R.drawable.tripoly,R.drawable.liveicon, false, "Tripoly", "Free","07-12-2019", 3000,25,3000));
        contestsModelArrayList.add(new ContestsModel(R.drawable.soccer,R.drawable.liveicon, false, "Soccer Pro", "Free","30-11-2019", 5000,49,3000));
        contestsModelArrayList.add(new ContestsModel(R.drawable.tripoly,R.drawable.liveicon, false, "Tripoly", "Free","26-11-2019", 3000,76,3000));
    }

    public ArrayList<ContestsModel> getContestsModelArrayList() {
        return contestsModelArrayList;
    }
}
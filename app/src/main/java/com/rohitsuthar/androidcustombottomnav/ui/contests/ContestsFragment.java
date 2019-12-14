package com.rohitsuthar.androidcustombottomnav.ui.contests;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.rohitsuthar.androidcustombottomnav.R;

public class ContestsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContestsViewModel contestsViewModel = ViewModelProviders.of(this).get(ContestsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contests, container, false);
        return root;
    }
}
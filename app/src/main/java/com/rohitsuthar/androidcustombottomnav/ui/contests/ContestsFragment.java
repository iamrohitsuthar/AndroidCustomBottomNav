    package com.rohitsuthar.androidcustombottomnav.ui.contests;

import android.content.Context;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rohitsuthar.androidcustombottomnav.R;
import com.rohitsuthar.androidcustombottomnav.adapters.ContestsAdapter;

    public class ContestsFragment extends Fragment {
    private Context mcontext;
    private RecyclerView mRecyclerView;
    private ContestsAdapter contestsAdapter;
    private ContestsViewModel contestsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contestsViewModel = ViewModelProviders.of(this).get(ContestsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contests, container, false);
        initialize(root);
        return root;
    }

    private void initialize(View view) {
        mcontext = getContext();
        mRecyclerView = view.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setFocusable(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mcontext));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        setAdapter();
    }

    private void setAdapter() {
        contestsAdapter = new ContestsAdapter(mcontext,contestsViewModel.getContestsModelArrayList());
        mRecyclerView.setAdapter(contestsAdapter);
    }
}
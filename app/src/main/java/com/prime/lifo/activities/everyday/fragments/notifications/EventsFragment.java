package com.prime.lifo.activities.everyday.fragments.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.prime.lifo.R;


public class EventsFragment extends Fragment {

  private EventsViewModel eventsViewModel;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    eventsViewModel =
        new ViewModelProvider(this).get(EventsViewModel.class);
    View root = inflater.inflate(R.layout.fragment_notifications, container, false);
    final TextView textView = root.findViewById(R.id.text_notifications);
    eventsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}
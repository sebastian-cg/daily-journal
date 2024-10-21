package com.example.dailyjournal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyjournal.JournalEntryAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class dashboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JournalEntryAdapter adapter;
    private List<JournalEntry> journalEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list of journal entries
        journalEntries = new ArrayList<>();
        journalEntries.add(new JournalEntry("Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit..."));
        journalEntries.add(new JournalEntry("Title 2", "Ut enim ad minim veniam, quis nostrud exercitation..."));
        // You can add more entries here

        // Set up the adapter
        adapter = new JournalEntryAdapter(journalEntries);
        recyclerView.setAdapter(adapter);

        // FloatingActionButton to add a new entry
        FloatingActionButton fabAddEntry = findViewById(R.id.fabAddEntry);
        fabAddEntry.setOnClickListener(v -> {
            // Add a new journal entry when the FAB is clicked
            journalEntries.add(new JournalEntry("New Title", "New content added."));
            adapter.notifyDataSetChanged();  // Refresh the RecyclerView to show the new entry
        });
    }
}

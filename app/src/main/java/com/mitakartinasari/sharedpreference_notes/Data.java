package com.mitakartinasari.sharedpreference_notes;

import com.mitakartinasari.sharedpreference_notes.models.Note;
import com.mitakartinasari.sharedpreference_notes.models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Data {
    private static List<User> users;
    private static List<Note> notes;

    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }

    static {
        users = new ArrayList<>();
        users.add(new User("mita","123"));
        users.add(new User("kartina","123"));
        users.add(new User("sari","123"));

        notes = new ArrayList<>();
        notes.add(new Note("Note 1", new Date(),"Manajemen Proyek"));
        notes.add(new Note("Note 2", new Date(),"Basis Data"));
        notes.add(new Note("Note 3", new Date(),"Proyek1"));
        notes.add(new Note("Note 4", new Date(),"SMBD"));


    }
}

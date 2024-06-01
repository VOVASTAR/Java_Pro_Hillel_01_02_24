package edu.hillel.homework.hw7.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<Note> phoneBook = new ArrayList<>();

    public void add(Note note) {
        phoneBook.add(note);
    }

    public Note find(String name) {
        Note firstOccurrence = null;
        for (Note note : phoneBook) {
            if (note.getName().equals(name)) {
                firstOccurrence = note;
                break;
            }
        }
        return firstOccurrence;
    }

    public List<Note> findAll(String name) {
        List<Note> nameContacts = new ArrayList<>();
        for (Note note : phoneBook) {
            if (note.getName().equals(name)) {
                nameContacts.add(note);
            }
        }
        if (nameContacts.isEmpty()) {
            nameContacts = null;
        }
        return nameContacts;
    }

    public List<Note> getPhoneBook() {
        return phoneBook;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}

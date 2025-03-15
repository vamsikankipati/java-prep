package com.interview;

public class Note {
    String noteId; // unique
    String tagId; // value
    String tagName; //key

    public Note(String noteId, String tagId, String tagName) {
        this.noteId = noteId;
        this.tagId = tagId;
        this.tagName = tagName;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}

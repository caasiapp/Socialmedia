package com.example.demo;

public class Post {

    String titel;
    String content;
    String date;
    String formalname;

    public Post(String titel, String content, String date, String formalname) {
        this.titel = titel;
        this.content = content;
        this.date = date;
        this.formalname = formalname;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFormalname() {
        return formalname;
    }

    public void setFormalname(String formalname) {
        this.formalname = formalname;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + titel + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", formalname='" + formalname + '\'' +
                '}';
    }
}

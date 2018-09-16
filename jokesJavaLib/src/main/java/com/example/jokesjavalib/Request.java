package com.example.jokesjavalib;
import java.util.List;

public class Request {

    private String type;

    private List<Joke> value = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Joke> getValue() {
        return value;
    }

    public void setValue(List<Joke> value) {
        this.value = value;
    }
}

package com.example.jokesjavalib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Jokes {
    public Jokes() {
    }

    private Request mRequest;
    private static List<Joke> mJokeList;

    //TODO get jokes from http://www.icndb.com/api/
    public static String getJoke(int quantity){
        mJokeList = new ArrayList<>();
        String url = "http://http://api.icndb.com/jokes/random/";

        Random random = new Random();

        if (quantity > 0){
            url += Integer.toString(quantity);
        }

        List<String> staticStringList = asList(
                "Joke 01",
                "Joke 02",
                "Joke 03",
                "Joke 04",
                "Joke 05"
        );

//        return mJokeList.get(random.nextInt(mJokeList.size())).toString();
        return staticStringList.get(random.nextInt(staticStringList.size()));
    }
}

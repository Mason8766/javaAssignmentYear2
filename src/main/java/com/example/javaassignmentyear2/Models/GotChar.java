package com.example.javaassignmentyear2.Models;

public class GotChar {
    int id,episodes;
    String name, actor;
    double screenTime;

    public GotChar(int id, int episodes, String name, String actor, double screenTime) {
        setId(id);
        setActor(actor);
        setName(name);
        setEpisodes(episodes);
        setScreenTime(screenTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0)
            this.id = id;
        else
            throw new IllegalArgumentException("The ID must be greater than 0");
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        if (id>0 && id <74)
            this.episodes = episodes;
        else
            throw new IllegalArgumentException("A character must appear in at least 1 episode, and cannot appear in more than 73 episodes");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name.trim()).length()>0)
            this.name = name;
        else
            throw new IllegalArgumentException("The name must be at least 1 character long");
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        if ((actor.trim()).length()>0)
            this.actor = actor;
        else
            throw new IllegalArgumentException("The actor's name must be at least 1 character long");
    }

    public double getScreenTime() {
        return screenTime;
    }

    public void setScreenTime(double screenTime) {
        if (screenTime> 0 && screenTime < 3811)
            this.screenTime = screenTime;
        else
            throw new IllegalArgumentException("A character's screen time must be greater than 0 minutes, and no more than 3810");
    }
}

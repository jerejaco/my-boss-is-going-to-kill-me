package com.zagboodle.games.mbigtkm.locations;

import java.util.ArrayList;

public class Location {

    private String name;
    private String description;
    private ArrayList<Section> sections;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        sections = new ArrayList<Section>();
        sections.add(new Section(this));
    }

    public Location() {
        this.name = "the_void";
        this.description = "You are floating in an endless void.  You should not be here.";
        sections = new ArrayList<Section>();
        sections.add(new Section(this));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public Section getDefaultSection() {
        return sections.get(0);
    }

    public Section getSection(int i) {
        return sections.get(i);
    }
}


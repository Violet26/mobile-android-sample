package org.familysearch.sampleapp.model.ancestry;

import java.util.List;

/**
 * @author Eduardo Flores
 */
public class Persons
{
    private String id;

    private LinksPersons links;

    private boolean living;

    private Gender gender;

    private List<Names> namesList;

    private Display display;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinksPersons getLinks() {
        return links;
    }

    public void setLinks(LinksPersons links) {
        this.links = links;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Names> getNamesList() {
        return namesList;
    }

    public void setNamesList(List<Names> namesList) {
        this.namesList = namesList;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
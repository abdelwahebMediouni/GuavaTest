package model;

import java.util.Date;

public class CustomClass implements Comparable<CustomClass> {
    private String id;
    private Date dateCreation;

    public CustomClass(String id,Date dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
    }

    public String getId() {
        return id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    @Override
    public int compareTo(CustomClass otherCustomType) {
        return otherCustomType.getDateCreation().compareTo(this.dateCreation);
    }
}

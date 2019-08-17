package com.example.sakilaexample.model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="actor_id")
    private int actor_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="last_update")
    private Timestamp last_update;

    // Empty Constructor
    public Actor() {

    }

    // Loaded Constructor
    public Actor(int actor_id, String first_name, String last_name, Timestamp last_update) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
    }


    // Getters and Setters
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    /* This is the method that is used to print out the object and its attributes */
    @Override
    public String toString() {
        return "BlogPost [id=" + actor_id + ", first_name=" + first_name + ", last_name=" + last_name + ", last_update=" + last_update + "]";
    }

}

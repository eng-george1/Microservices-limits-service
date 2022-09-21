package com.george.microservices.limitsservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Limits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

    public int getMin() {
        return min;
    }

    public Limits() {
    }

    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    private int min;
   private int max;

}

package com.swa3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "waste")
public class Waste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String weight;
    private String category;
    private String method;

    public Waste() {}

    public Waste(String type, String weight, String category, String method) {
        this.type = type;
        this.weight = weight;
        this.category = category;
        this.method = method;
    }

    public Long getId() { return id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
}

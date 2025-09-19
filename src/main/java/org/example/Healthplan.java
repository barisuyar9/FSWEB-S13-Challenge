package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private Integer id;
    private String name;
    private Plan plan;

    // Constructor (tüm alanları set edecek şekilde)
    public Healthplan(Integer id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    // Getter & Setter'lar
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}

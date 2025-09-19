package org.example;

import java.util.Arrays;

public class Company {
    private Integer id;
    private String name;
    private Double giro;
    private String[] developerNames;

    // Constructor (giro 0'dan küçükse otomatik 0 yapılır)
    public Company(Integer id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro); // setter üzerinden kontrol
        this.developerNames = developerNames;
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

    public Double getGiro() {
        return giro;
    }

    public void setGiro(Double giro) {
        if (giro < 0) {
            System.out.println("Giro negatif olamaz! 0 olarak ayarlandı.");
            this.giro = 0.0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // addEmployee metodu
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index!");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Çalışan başarıyla eklendi: " + name);
        } else {
            System.out.println("Bu index zaten dolu!");
        }
    }

    // toString metodu
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}

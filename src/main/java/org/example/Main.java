package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runDemo(); // tüm işlemleri başka bir metodda yapıyoruz
    }

    public static void runDemo() {
        // 1. Healthplan objesi
        Healthplan healthplan1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "B Sigorta", Plan.STANDARD);

        System.out.println(healthplan1);
        System.out.println(healthplan2);

        // 2. Employee objesi
        String[] healthPlans = new String[2];
        healthPlans[0] = healthplan1.getName(); // ilk plan eklendi
        Employee employee1 = new Employee(1, "John Doe", "jd@test.com", "1234", healthPlans);

        System.out.println(employee1);

        // addHealthPlan metodu testi
        employee1.addHealthPlan(1, healthplan2.getName()); // boş yere ekleyecek
        employee1.addHealthPlan(0, "Test Sigorta"); // dolu olduğu için uyarı
        employee1.addHealthPlan(5, "Hatalı Index"); // index hatası

        System.out.println(employee1);

        // 3. Company objesi
        String[] developers = new String[2];
        developers[0] = employee1.getFullName();
        Company company1 = new Company(1, "Workintech", 1000, developers);

        System.out.println(company1);

        // addEmployee metodu testi
        company1.addEmployee(1, "Jane Doe"); // boş yere eklenecek
        company1.addEmployee(0, "Yeni Developer"); // dolu olduğu için uyarı
        company1.addEmployee(-1, "Hatalı Index"); // geçersiz index

        System.out.println(company1);
    }
}

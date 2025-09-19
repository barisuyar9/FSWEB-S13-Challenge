package org.example.enums;

public enum Plan {
    BASIC("Basic", 100),
    STANDARD("Standard", 200),
    PREMIUM("Premium", 300);

    // Enum içindeki her seçenek için saklanacak alanlar
    private final String name;
    private final Integer price; // Test, Integer bekliyor

    // Kurucu (enum sabitleri bu kurucu ile oluşturuluyor)
    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // Getter'lar (testler bunları çağırıyor)
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}

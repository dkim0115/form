package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("book"), FOOD("food"), ETC("etc");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

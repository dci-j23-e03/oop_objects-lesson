class Item {
    String name;
    String color;
    String size;

    public Item(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Item() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        if (!color.equals(this.color)) {
            this.color = color;
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", color: " + color + ", size: " + size + "}";
    }
}

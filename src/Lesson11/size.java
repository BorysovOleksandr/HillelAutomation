package Lesson11;

public enum size {
    S("S",5,10),
    M("M",10,15),
    XL("XL",15,20);
    private final String type;
    private final int width;
    private final int length;

    size(String type, int width, int length) {
        this.type = type;
        this.width = width;
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size{" +
                "type='" + type + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

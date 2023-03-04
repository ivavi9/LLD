package FlyWeight;

public class BulletFixedAK {

    private static int size = 10;
    private static String color = "Green";
    private static String image = "Image Representation";

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        BulletFixedAK.size = size;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        BulletFixedAK.color = color;
    }

    public static String getImage() {
        return image;
    }

    public static void setImage(String image) {
        BulletFixedAK.image = image;
    }
}

package FlyWeight;

public class Client {
    public static void main(String[] args) {
        BulletDynamicAK bulletDynamicAK = BulletDynamicAK.getBuilder()
                                                        .setxLocation("211")
                                                        .setyLocation("101")
                                                        .setzLocation("1112")
                                                        .setxSpeed("311")
                                                        .setySpeed("2312")
                                                        .setzSpeed("311")
                                                        .build();

    }
}

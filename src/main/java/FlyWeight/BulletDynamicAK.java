package FlyWeight;


import javax.xml.stream.Location;

public class BulletDynamicAK {
    private ThreeDimension<String,String,String> location;
    private ThreeDimension<String,String,String> threeDimensionSpeed;

    public BulletDynamicAK(Builder builder) {
        this.location = new ThreeDimension(builder.xLocation,builder.yLocation,builder.zLocation);
        this.threeDimensionSpeed = new ThreeDimension(builder.xSpeed,builder.ySpeed,builder.zSpeed);
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    static class Builder{
         private String xLocation;
         private String yLocation;
         private String zLocation;
         private String xSpeed;
         private String ySpeed;
         private String zSpeed;

         public String getxLocation() {
             return xLocation;
         }

         public Builder setxLocation(String xLocation) {
             this.xLocation = xLocation;
             return this;
         }

         public String getyLocation() {
             return yLocation;
         }

         public Builder setyLocation(String yLocation) {
             this.yLocation = yLocation;
             return this;
         }

         public String getzLocation() {
             return zLocation;
         }

         public Builder setzLocation(String zLocation) {
             this.zLocation = zLocation;
             return this;
         }

         public String getxSpeed() {
             return xSpeed;
         }

         public Builder setxSpeed(String xSpeed) {
             this.xSpeed = xSpeed;
             return this;
         }

         public String getySpeed() {
             return ySpeed;
         }

         public Builder setySpeed(String ySpeed) {
             this.ySpeed = ySpeed;
             return this;
         }

         public String getzSpeed() {
             return zSpeed;
         }

         public Builder setzSpeed(String zSpeed) {
             this.zSpeed = zSpeed;
             return this;
         }

         public BulletDynamicAK build(){
             return new BulletDynamicAK(this);
         }
     }
}

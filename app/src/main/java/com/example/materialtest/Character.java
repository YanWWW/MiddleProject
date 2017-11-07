package com.example.materialtest;

import static com.example.materialtest.Character.Power.吴;

/**
 * Fruit类是模板中使用的类，对我们来说是没用的。我保留是为了可以给你看原先的效果。
 * 这个类就是三国人物的一个类了。在Adapte中都会使用。
 * 显示三国人物详情的时候也是传递这个类的一个实例。
 */

public class Character {

    //to set value of enum type variables: Power power = Power.吴
    public enum Power {魏,蜀,吴,群};

    private int imageID;

    private String name;

    private boolean sex;

    private String birthDay,deathDay;

    private String location;

    private Power power;

    public Power getPower() {
        return power;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public boolean getSex() {
        return sex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public String getLocation() {
        return location;
    }

}

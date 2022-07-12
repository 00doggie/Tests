package com.doggie.testingmod.entity.client.armor;

import com.doggie.testingmod.init.advanceditems.FireArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireArmorRenderer extends GeoArmorRenderer<FireArmorItem> {
    public FireArmorRenderer() {
        super(new FireArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}

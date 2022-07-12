package com.doggie.testingmod.client.gui;

import net.minecraft.network.chat.BaseComponent;
import net.minecraft.network.chat.TextComponent;

public class IncreaseSkill extends BaseComponent {
    public  int var;

   public IncreaseSkill(int value){
        this.var = value;
    }
    @Override
    public BaseComponent plainCopy() {
        return new IncreaseSkill(this.var);
    }
}

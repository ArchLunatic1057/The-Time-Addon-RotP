package com.archlunatic.rotp_tt.client.render;

import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.archlunatic.rotp_tt.AddonMain;
import com.archlunatic.rotp_tt.entity.TheTimeStandEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class TheTimeRenderer extends StandEntityRenderer<TheTimeStandEntity, TheTimeModel> {
    
    public TheTimeRenderer(EntityRendererManager renderManager) {
        super(renderManager, new TheTimeModel(),
                new ResourceLocation(AddonMain.MOD_ID, "textures/entity/stand/the_time.png"), 0);
    }
}

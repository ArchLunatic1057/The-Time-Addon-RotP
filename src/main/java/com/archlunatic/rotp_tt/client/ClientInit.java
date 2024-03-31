package com.archlunatic.rotp_tt.client;

import com.archlunatic.rotp_tt.AddonMain;


import com.archlunatic.rotp_tt.client.render.TheTimeRenderer;
import com.archlunatic.rotp_tt.init.InitStands;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = AddonMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(InitStands.THE_TIME_STAND.getEntityType(), TheTimeRenderer::new);
    }
}

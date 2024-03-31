package com.archlunatic.rotp_tt.init;

import java.util.function.Supplier;

import com.archlunatic.rotp_tt.AddonMain;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            ForgeRegistries.SOUND_EVENTS, AddonMain.MOD_ID); // TODO sounds.json
    
    public static final RegistryObject<SoundEvent> THE_TIME_SUMMON_VOICELINE = SOUNDS.register("for_all_this_world",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "c")));

    public static final Supplier<SoundEvent> THE_TIME_SUMMON_SOUND = ModSounds.STAND_SUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> THE_TIME_UNSUMMON_SOUND = ModSounds.STAND_UNSUMMON_DEFAULT;

    public static final RegistryObject<SoundEvent> THE_WORLD_TIME_STOP = SOUNDS.register("the_world_time_stop",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "the_world_time_stop")));

    public static final RegistryObject<SoundEvent> THE_WORLD_TIME_RESUME = SOUNDS.register("the_world_time_resume",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "the_world_time_resume")));

    public static final RegistryObject<SoundEvent> TIME_STOP_SPELL = SOUNDS.register("time_stop_spell",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "time_stop_spell")));

    public static final RegistryObject<SoundEvent> BLACK_HOLE_TIME_STOP = SOUNDS.register("black_hole_time_stop",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "black_hole_time_stop")));

    public static final OstSoundList EXAMPLE_STAND_OST = new OstSoundList(
            new ResourceLocation(AddonMain.MOD_ID, "example_stand_ost"), SOUNDS);
}

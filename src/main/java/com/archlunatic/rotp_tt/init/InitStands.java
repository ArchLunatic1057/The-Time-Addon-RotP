package com.archlunatic.rotp_tt.init;

import com.github.standobyte.jojo.JojoMod;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.*;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.TimeStopperStandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;
import com.archlunatic.rotp_tt.AddonMain;
import com.archlunatic.rotp_tt.entity.TheTimeStandEntity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), AddonMain.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), AddonMain.MOD_ID);
    
 // ======================================== ThE wOrLd Stand ========================================

    public static final RegistryObject<TimeStop> THE_WORLD_TIME_STOP = ACTIONS.register("the_world_time_stop",
            () -> new TheWorldTimeStop(new TimeStop.Builder().holdToFire(30, false).staminaCost(250).staminaCostTick(7.5F).heldWalkSpeed(0)
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun()
                    .shout(ModSounds.DIO_THE_WORLD)
                    .partsRequired(StandPart.MAIN_BODY)
                    .voiceLineWithStandSummoned(ModSounds.DIO_TIME_STOP).timeStopSound(ModSounds.THE_WORLD_TIME_STOP)
                    .addTimeResumeVoiceLine(ModSounds.DIO_TIME_RESUMES, true).addTimeResumeVoiceLine(ModSounds.DIO_TIMES_UP, false)
                    .timeResumeSound(ModSounds.THE_WORLD_TIME_RESUME)
                    .shaderEffect(new ResourceLocation(JojoMod.MOD_ID, "shaders/post/time_stop_tw.json"), true)
                    .shaderEffect(new ResourceLocation(JojoMod.MOD_ID, "shaders/post/time_stop_tw_old.json"), false)));

    public static final RegistryObject<TimeStopInstant> THE_WORLD_TIME_STOP_BLINK = ACTIONS.register("the_world_ts_blink",
            () -> new TimeStopInstant(new StandAction.Builder()
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun()
                    .partsRequired(StandPart.MAIN_BODY),
                    THE_WORLD_TIME_STOP, ModSounds.THE_WORLD_TIME_STOP_BLINK,
                    true));

    public static final RegistryObject<TimeResume> THE_WORLD_TIME_RESUME = ACTIONS.register("the_world_time_resume",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(THE_WORLD_TIME_STOP)));

    public static final RegistryObject<TimeStop> STAR_PLATINUM_TIME_STOP = ACTIONS.register("star_platinum_time_stop",
            () -> new TimeStop(new TimeStop.Builder().holdToFire(40, false).staminaCost(250).staminaCostTick(7.5F).heldWalkSpeed(0)
                    .isTrained().resolveLevelToUnlock(0)
                    .ignoresPerformerStun().autoSummonStand()
                    .shout(ModSounds.JOTARO_STAR_PLATINUM_THE_WORLD)
                    .partsRequired(StandPart.MAIN_BODY)
                    .timeStopSound(ModSounds.STAR_PLATINUM_TIME_STOP)
                    .addTimeResumeVoiceLine(ModSounds.JOTARO_TIME_RESUMES).timeResumeSound(ModSounds.STAR_PLATINUM_TIME_RESUME)
                    .shaderEffect(new ResourceLocation(JojoMod.MOD_ID, "shaders/post/time_stop_sp.json"), true)
                    .shaderEffect(new ResourceLocation(JojoMod.MOD_ID, "shaders/post/time_stop_sp_old.json"), false)));


    public static final RegistryObject<TimeStopInstant> STAR_PLATINUM_TIME_STOP_BLINK = ACTIONS.register("star_platinum_ts_blink",
            () -> new TimeStopInstant(new StandAction.Builder()
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun()
                    .partsRequired(StandPart.MAIN_BODY),
                    STAR_PLATINUM_TIME_STOP, ModSounds.STAR_PLATINUM_TIME_STOP_BLINK,
                    false));

    public static final RegistryObject<TimeResume> STAR_PLATINUM_TIME_RESUME = ACTIONS.register("star_platinum_time_resume",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(STAR_PLATINUM_TIME_STOP)));

    public static final RegistryObject<TimeStop> BATTLE_TRANCE = ACTIONS.register("battle_trance",
            () -> new TimeStop(new TimeStop.Builder().staminaCost(250).staminaCostTick(7.5F).holdToFire(3, false)
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun().autoSummonStand()
                    .shaderEffect(new ResourceLocation(AddonMain.MOD_ID, "shaders/posted/battle_trance.json"), true)));

    public static final RegistryObject<TimeResume> EXIT_FROM_BATTLE_TRANCE = ACTIONS.register("exit_from_battle_trance",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(BATTLE_TRANCE)));

    public static final RegistryObject<TimeStop> ENDERMANS_WORLD = ACTIONS.register("endermans_world",
            () -> new TheWorldTimeStop(new TimeStop.Builder().holdToFire(30, false).staminaCost(250).staminaCostTick(7.5F)
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun().autoSummonStand()
                    .timeStopSound(InitSounds.THE_WORLD_TIME_STOP).timeResumeSound(InitSounds.THE_WORLD_TIME_RESUME)
                    .shaderEffect(new ResourceLocation(AddonMain.MOD_ID, "shaders/post/endermans_world.json"), true)
                    .shaderEffect(new ResourceLocation(JojoMod.MOD_ID, "shaders/post/time_stop_tw_old.json"), false)));

    public static final RegistryObject<TimeResume> RETURN_FROM_ENDERMANS_WORLD = ACTIONS.register("return_from_endermans_world",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(ENDERMANS_WORLD)));

    public static final RegistryObject<TimeStop> TIME_STOP_SPELL = ACTIONS.register("time_stop_spell",
            () -> new TimeStop(new TimeStop.Builder().holdToFire(220, true).staminaCost(1).staminaCostTick(7.5F).heldWalkSpeed(0)
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun().autoSummonStand()
                    .shout(InitSounds.TIME_STOP_SPELL).voiceLineWithStandSummoned(InitSounds.TIME_STOP_SPELL)
                    .timeStopSound(ModSounds.THE_WORLD_TIME_STOP).timeResumeSound(ModSounds.THE_WORLD_TIME_RESUME)));

    public static final RegistryObject<TimeResume> END_OF_TIME_STOP_SPELL = ACTIONS.register("end_of_time_stop_spell",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(TIME_STOP_SPELL)));

    public static final RegistryObject<TimeStop> BLACK_HOLE_TIME_STOP = ACTIONS.register("black_hole_time_stop",
            () -> new TimeStop(new TimeStop.Builder().holdToFire(30, false).staminaCost(250).staminaCostTick(7.5F).heldWalkSpeed(0)
                    .resolveLevelToUnlock(0).isTrained()
                    .ignoresPerformerStun().autoSummonStand()
                    .shout(InitSounds.BLACK_HOLE_TIME_STOP).voiceLineWithStandSummoned(InitSounds.BLACK_HOLE_TIME_STOP)
                    .timeStopSound(ModSounds.THE_WORLD_TIME_STOP).timeResumeSound(ModSounds.THE_WORLD_TIME_RESUME)
                    .shaderEffect(new ResourceLocation(AddonMain.MOD_ID, "shaders/post/black_hole_time_stop.json"), true)
                    .shaderEffect(new ResourceLocation(JojoMod.MOD_ID, "shaders/post/time_stop_tw_old.json"), false)));

    public static final RegistryObject<TimeResume> RETURN_GRAVITY_TO_NORMAL = ACTIONS.register("return_gravity_to_normal",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(BLACK_HOLE_TIME_STOP)));

    public static final EntityStandRegistryObject<EntityStandType<TimeStopperStandStats>, StandEntityType<TheTimeStandEntity>> THE_TIME_STAND =
            new EntityStandRegistryObject<>("the_time",
                    STANDS, 
                    () -> new EntityStandType.Builder<TimeStopperStandStats>()
                            .color(0xFFD700)
                            .storyPartName(ModStandsInit.PART_9_NAME)
                            .leftClickHotbar(
                                    THE_WORLD_TIME_STOP.get(),
                                    STAR_PLATINUM_TIME_STOP.get()
                                    )
                            .rightClickHotbar(
                                    BATTLE_TRANCE.get(),
                                    ENDERMANS_WORLD.get(),
                                    TIME_STOP_SPELL.get(),
                                    BLACK_HOLE_TIME_STOP.get()
                                    )
                            .defaultStats(TimeStopperStandStats.class, new TimeStopperStandStats.Builder()
                                    .tier(0)
                                    .power(2147483647, 1)
                                    .speed(0)
                                    .range(-2147483647, 2147483647)
                                    .durability(666)
                                    .precision(4)
                                    .timeStopMaxTicks(200, 500)
                                    .timeStopLearningPerTick(3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277F)
                                    .timeStopDecayPerDay(339999999999999999999999999999999999999F)
                                    .timeStopCooldownPerTick(-1F)
                                    .randomWeight(1999999999)
                            )
                            .addSummonShout(InitSounds.THE_TIME_SUMMON_VOICELINE)
                            .addOst(InitSounds.EXAMPLE_STAND_OST)
                            .addAttackerResolveMultTier(2)
                            .build(),
                    
                    InitEntities.ENTITIES,
                    () -> new StandEntityType<TheTimeStandEntity>(TheTimeStandEntity::new, 0.7F, 2.1F)
                    .summonSound(InitSounds.THE_TIME_SUMMON_SOUND)
                    .unsummonSound(InitSounds.THE_TIME_UNSUMMON_SOUND))
            .withDefaultStandAttributes();
}

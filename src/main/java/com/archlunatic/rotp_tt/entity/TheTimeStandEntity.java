package com.archlunatic.rotp_tt.entity;

import com.archlunatic.rotp_tt.init.InitStands;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;

import com.github.standobyte.jojo.init.ModStatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;

public class TheTimeStandEntity extends StandEntity {
    public TheTimeStandEntity(StandEntityType<TheTimeStandEntity> type, World world) {
        super(type, world);
    }
    @Override
    public void tick() {
        super.tick();
        LivingEntity user = getUser(); assert user != null;
        Vector3d userPosition = user.position();

        if (!user.level.isClientSide()) {

            if (isTrance() || isCountT>2){
                if (isCountT>4 &&isCountT<=10) {
                    Objects.requireNonNull(user).removeEffect(ModStatusEffects.TIME_STOP.get());
                    CountT(1);
                }else{ CountT(isCountT()+1); }
            }else { CountT(1); }

            if (isHole() || isCountH > 28){
                if (isCountH >31 && isCountH<=230) {
                    AxisAlignedBB area = getBoundingBox().inflate(192);
                    List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, area,
                            entity -> !(entity instanceof StandEntity));
                    for (LivingEntity entity : entities) {
                        entity.removeEffect(ModStatusEffects.TIME_STOP.get());
                        entity.addEffect(new EffectInstance(Effects.BLINDNESS, 210, 1, false, false));
                        entity.teleportTo(userPosition.x+1, userPosition.y+1, userPosition.z+1);
                        if (entity instanceof EndermanEntity){entity.kill();}
                        else{entity.hurt(DamageSource.CACTUS, entity.getHealth()*0.5F);}
                    }
                    CountH(1);
                }else{ CountH(isCountH()+1); }
            }else { CountH(1); }
        }
    }

    public boolean isTrance(){ return getUserPower() != null && getUserPower().getHeldAction(true) == InitStands.BATTLE_TRANCE.get(); }
    public int isCountT; public int isCountT(){return isCountT;} public void CountT(int isCountT) {this.isCountT = isCountT;}

    public boolean isHole(){ return getUserPower() != null && getUserPower().getHeldAction(true) == InitStands.BLACK_HOLE_TIME_STOP.get(); }
    public int isCountH; public int isCountH(){return isCountH;} public void CountH(int isCountH) {this.isCountH = isCountH;}
}

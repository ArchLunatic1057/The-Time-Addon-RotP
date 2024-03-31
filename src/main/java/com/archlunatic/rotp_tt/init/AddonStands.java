package com.archlunatic.rotp_tt.init;

import com.archlunatic.rotp_tt.entity.TheTimeStandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.TimeStopperStandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

     public static final EntityStandSupplier<EntityStandType<TimeStopperStandStats>, StandEntityType<TheTimeStandEntity>>
             STAND_EXAMPLE_STAND  =  new EntityStandSupplier<>(InitStands.THE_TIME_STAND);
}
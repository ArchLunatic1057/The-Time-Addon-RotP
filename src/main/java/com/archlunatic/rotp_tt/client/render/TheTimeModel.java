package com.archlunatic.rotp_tt.client.render;

import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.model.stand.bb.BlockbenchStandModelHelper;
import com.github.standobyte.jojo.client.render.entity.pose.IModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.archlunatic.rotp_tt.entity.TheTimeStandEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class TheTimeModel extends HumanoidStandModel<TheTimeStandEntity> {
    private ModelRenderer pickaxe;

	public TheTimeModel() {
		super();
		
		BlockbenchStandModelHelper.fillFromBlockbenchExport(new TheTimeModelBlockbench(), this);
	}

	@Override // TODO summon poses
    protected RotationAngle[][] initSummonPoseRotations() {
        return new RotationAngle[][] {
                new RotationAngle[] {
                        new RotationAngle(head, 0.0F, -0.3491F, -0.0873F),
                        new RotationAngle(body, 0.2618F, 0.0F, 0.0F),
                        new RotationAngle(leftArm, -0.2618F, -0.7854F, -1.8326F),
                        new RotationAngle(leftForeArm, -0.7854F, 0.0F, 0.0F),
                        new RotationAngle(rightArm, 0.5236F, 0.0F, 0.0F),
                        new RotationAngle(rightForeArm, 0.0F, 3.1416F, 2.1817F),
                        new RotationAngle(leftLeg, -1.5708F, 0.0F, 0.0F),
                        new RotationAngle(leftLowerLeg, 2.0944F, 0.0F, 0.0F),
                        new RotationAngle(rightLeg, -1.1345F, 0.2618F, 0.0F),
                        new RotationAngle(rightLowerLeg, 0.5236F, 0.0F, 0.0F)
                }
		};
    }
    
    @Override // TODO idle pose
    protected ModelPose<TheTimeStandEntity> initIdlePose() {
        return new ModelPose<>(new RotationAngle[] {
                new RotationAngle(upperPart, 0, 0, 0),
                RotationAngle.fromDegrees(body,             -10.3453,   14.7669,    -2.664),
                RotationAngle.fromDegrees(leftArm,          12.2616,    9.8242,     -25.0612),
                RotationAngle.fromDegrees(leftForeArm,      -12.0884,   2.8002,     18.5715),
                RotationAngle.fromDegrees(rightArm,         3.0667,     -8.1272,    29.6295),
                RotationAngle.fromDegrees(rightForeArm,     -34.6,      -4.5795,    -21.7089),
                RotationAngle.fromDegrees(leftLeg,          20.2151,    -12.1546,   -12.2229),
                RotationAngle.fromDegrees(leftLowerLeg,     7.5,        0,          0),
                RotationAngle.fromDegrees(rightLeg,         6.8105,     -11.2924,   10.6414),
                RotationAngle.fromDegrees(rightLowerLeg,    20,         0,          0)
        });
    }

    @Override
    protected IModelPose<TheTimeStandEntity> initIdlePose2Loop() {
        return super.initIdlePose2Loop();
    }
}
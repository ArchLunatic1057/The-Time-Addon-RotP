package com.archlunatic.rotp_tt.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class TheTimeModelBlockbench extends EntityModel<Entity> {
    private final ModelRenderer head;
    private final ModelRenderer headpieceNew;
    private final ModelRenderer slopeNew;
    private final ModelRenderer faceRightNew;
    private final ModelRenderer faceLeftNew;
    private final ModelRenderer clockHand;
    private final ModelRenderer rightHalfOfClock_r1;
    private final ModelRenderer rightHalfOfClock_r2;
    private final ModelRenderer rightHalfOfClock_r3;
    private final ModelRenderer rightHalfOfClock_r4;
    private final ModelRenderer clockHand_r1;
    private final ModelRenderer bigel;
    private final ModelRenderer bigel1_r1;
    private final ModelRenderer heartSmallHead;
    private final ModelRenderer smallHeartCube4;
    private final ModelRenderer smallHeartCube5;
    private final ModelRenderer smallHeartCube6;
    private final ModelRenderer body;
    private final ModelRenderer upperPart;
    private final ModelRenderer torso;
    private final ModelRenderer beltRight;
    private final ModelRenderer beltLeft;
    private final ModelRenderer strapLeft;
    private final ModelRenderer strapRight;
    private final ModelRenderer heartLargeAbdomen;
    private final ModelRenderer largeHeartCube1;
    private final ModelRenderer largeHeartCube2;
    private final ModelRenderer largeHeartCube3;
    private final ModelRenderer heartSmallAbdomen;
    private final ModelRenderer smallHeartCube1;
    private final ModelRenderer smallHeartCube2;
    private final ModelRenderer smallHeartCube3;
    private final ModelRenderer leftArm;
    private final ModelRenderer heartLeftArm;
    private final ModelRenderer heartCube4;
    private final ModelRenderer heartCube5;
    private final ModelRenderer heartCube6;
    private final ModelRenderer leftArmJoint;
    private final ModelRenderer leftForeArm;
    private final ModelRenderer rightArm;
    private final ModelRenderer heartRightArm;
    private final ModelRenderer heartCube1;
    private final ModelRenderer heartCube2;
    private final ModelRenderer heartCube3;
    private final ModelRenderer rightArmJoint;
    private final ModelRenderer rightForeArm;
    private final ModelRenderer leftLeg;
    private final ModelRenderer heartRightLeg;
    private final ModelRenderer heartCube10;
    private final ModelRenderer heartCube11;
    private final ModelRenderer heartCube12;
    private final ModelRenderer leftLegJoint;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer heartLeftLeg;
    private final ModelRenderer heartCube7;
    private final ModelRenderer heartCube8;
    private final ModelRenderer heartCube9;
    private final ModelRenderer rightLegJoint;
    private final ModelRenderer rightLowerLeg;

    public TheTimeModelBlockbench() {
        texWidth = 128;
        texHeight = 128;

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, 0.0F);


        headpieceNew = new ModelRenderer(this);
        headpieceNew.setPos(0.0F, -2.0F, -5.3F);
        head.addChild(headpieceNew);


        slopeNew = new ModelRenderer(this);
        slopeNew.setPos(0.0F, -6.4F, 1.3F);
        headpieceNew.addChild(slopeNew);


        faceRightNew = new ModelRenderer(this);
        faceRightNew.setPos(-4.2F, -6.4F, 1.3F);
        headpieceNew.addChild(faceRightNew);


        faceLeftNew = new ModelRenderer(this);
        faceLeftNew.setPos(4.2F, -6.4F, 1.3F);
        headpieceNew.addChild(faceLeftNew);


        clockHand = new ModelRenderer(this);
        clockHand.setPos(1.75F, -3.3F, 3.25F);
        head.addChild(clockHand);
        setRotationAngle(clockHand, 0.0F, -1.5708F, -1.5708F);
        clockHand.texOffs(13, 16).addBox(-3.75F, -4.2F, -3.0F, 1.0F, 5.0F, 5.0F, 0.0F, true);
        clockHand.texOffs(1, 12).addBox(-3.775F, -2.2F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, true);

        rightHalfOfClock_r1 = new ModelRenderer(this);
        rightHalfOfClock_r1.setPos(-7.0F, -1.0F, -3.0F);
        clockHand.addChild(rightHalfOfClock_r1);
        setRotationAngle(rightHalfOfClock_r1, 3.1416F, 0.0F, 0.0F);
        rightHalfOfClock_r1.texOffs(4, 20).addBox(3.25F, -1.8F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        rightHalfOfClock_r2 = new ModelRenderer(this);
        rightHalfOfClock_r2.setPos(-3.25F, 2.3F, 1.5F);
        clockHand.addChild(rightHalfOfClock_r2);
        setRotationAngle(rightHalfOfClock_r2, -1.5708F, 0.0F, 0.0F);
        rightHalfOfClock_r2.texOffs(4, 20).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        rightHalfOfClock_r3 = new ModelRenderer(this);
        rightHalfOfClock_r3.setPos(-3.25F, -5.7F, 1.5F);
        clockHand.addChild(rightHalfOfClock_r3);
        setRotationAngle(rightHalfOfClock_r3, 0.0F, 0.0F, 0.0F);
        rightHalfOfClock_r3.texOffs(4, 20).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        rightHalfOfClock_r4 = new ModelRenderer(this);
        rightHalfOfClock_r4.setPos(-3.25F, -5.7F, -2.5F);
        clockHand.addChild(rightHalfOfClock_r4);
        setRotationAngle(rightHalfOfClock_r4, 1.5708F, 0.0F, 0.0F);
        rightHalfOfClock_r4.texOffs(4, 20).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        clockHand_r1 = new ModelRenderer(this);
        clockHand_r1.setPos(-3.775F, -1.95F, -0.25F);
        clockHand.addChild(clockHand_r1);
        setRotationAngle(clockHand_r1, -0.7854F, 0.0F, 0.0F);
        clockHand_r1.texOffs(2, 14).addBox(0.0F, 0.0F, -0.65F, 0.0F, 2.0F, 1.0F, 0.0F, true);

        bigel = new ModelRenderer(this);
        bigel.setPos(-7.0F, -1.0F, -3.0F);
        clockHand.addChild(bigel);


        bigel1_r1 = new ModelRenderer(this);
        bigel1_r1.setPos(0.0F, 0.0F, 0.0F);
        bigel.addChild(bigel1_r1);
        setRotationAngle(bigel1_r1, 3.1416F, 0.0F, 0.0F);
        bigel1_r1.texOffs(26, 6).addBox(3.75F, -0.8F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        heartSmallHead = new ModelRenderer(this);
        heartSmallHead.setPos(0.0F, 0.55F, -2.0F);
        head.addChild(heartSmallHead);


        smallHeartCube4 = new ModelRenderer(this);
        smallHeartCube4.setPos(0.0F, 0.0F, 0.0F);
        heartSmallHead.addChild(smallHeartCube4);
        setRotationAngle(smallHeartCube4, 0.0F, 0.0F, -0.7854F);
        smallHeartCube4.texOffs(4, 4).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube5 = new ModelRenderer(this);
        smallHeartCube5.setPos(0.3F, -0.3F, 0.0F);
        heartSmallHead.addChild(smallHeartCube5);
        setRotationAngle(smallHeartCube5, 0.0F, 0.0F, -0.7854F);
        smallHeartCube5.texOffs(4, 6).addBox(0.175F, -1.0F, -0.5F, 0.925F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube6 = new ModelRenderer(this);
        smallHeartCube6.setPos(-0.3F, -0.3F, 0.0F);
        heartSmallHead.addChild(smallHeartCube6);
        setRotationAngle(smallHeartCube6, 0.0F, 0.0F, -0.7854F);
        smallHeartCube6.texOffs(0, 6).addBox(0.0F, -1.1F, -0.5F, 1.0F, 0.925F, 1.0F, -0.2F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);


        upperPart = new ModelRenderer(this);
        upperPart.setPos(0.0F, 12.0F, 0.0F);
        body.addChild(upperPart);


        torso = new ModelRenderer(this);
        torso.setPos(0.0F, -12.0F, 0.0F);
        upperPart.addChild(torso);
        torso.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        torso.texOffs(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.1F, false);
        torso.texOffs(20, 64).addBox(-3.5F, 1.1F, -2.0F, 7.0F, 3.0F, 1.0F, 0.4F, false);
        torso.texOffs(24, 73).addBox(-2.5F, 4.0F, -2.3F, 5.0F, 6.0F, 1.0F, 0.0F, false);
        torso.texOffs(9, 80).addBox(0.6F, 1.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.1F, true);
        torso.texOffs(0, 80).addBox(-2.6F, 1.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.1F, false);

        beltRight = new ModelRenderer(this);
        beltRight.setPos(-2.0F, 10.35F, 0.0F);
        torso.addChild(beltRight);
        setRotationAngle(beltRight, 0.0F, 0.0F, 0.1309F);
        beltRight.texOffs(64, 74).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.13F, false);

        beltLeft = new ModelRenderer(this);
        beltLeft.setPos(2.0F, 10.35F, 0.0F);
        torso.addChild(beltLeft);
        setRotationAngle(beltLeft, 0.0F, 0.0F, -0.1309F);
        beltLeft.texOffs(80, 74).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.13F, false);

        strapLeft = new ModelRenderer(this);
        strapLeft.setPos(2.65F, 10.0F, 0.0F);
        torso.addChild(strapLeft);
        setRotationAngle(strapLeft, 0.0F, 0.0F, 0.0611F);
        strapLeft.texOffs(50, 65).addBox(-1.35F, -10.1F, -2.5F, 2.0F, 10.0F, 5.0F, 0.0F, true);

        strapRight = new ModelRenderer(this);
        strapRight.setPos(-2.3F, 10.0F, 0.0F);
        torso.addChild(strapRight);
        setRotationAngle(strapRight, 0.0F, 0.0F, -0.0611F);
        strapRight.texOffs(36, 65).addBox(-1.0F, -10.1F, -2.5F, 2.0F, 10.0F, 5.0F, 0.0F, false);

        heartLargeAbdomen = new ModelRenderer(this);
        heartLargeAbdomen.setPos(0.0F, 11.5F, -2.0F);
        torso.addChild(heartLargeAbdomen);


        largeHeartCube1 = new ModelRenderer(this);
        largeHeartCube1.setPos(0.0F, 2.0F, 0.25F);
        heartLargeAbdomen.addChild(largeHeartCube1);
        setRotationAngle(largeHeartCube1, 0.0F, 0.0F, 0.7854F);
        largeHeartCube1.texOffs(28, 81).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 0.5F, 0.0F, 0.25F, false);

        largeHeartCube2 = new ModelRenderer(this);
        largeHeartCube2.setPos(0.0F, 2.0F, 0.25F);
        heartLargeAbdomen.addChild(largeHeartCube2);
        setRotationAngle(largeHeartCube2, 0.0F, 0.0F, -0.7854F);
        largeHeartCube2.texOffs(25, 81).addBox(0.0F, -2.0F, -0.5F, 1.0F, 0.5F, 0.0F, 0.25F, false);

        largeHeartCube3 = new ModelRenderer(this);
        largeHeartCube3.setPos(0.0F, 2.0F, 0.25F);
        heartLargeAbdomen.addChild(largeHeartCube3);
        setRotationAngle(largeHeartCube3, 0.0F, 0.0F, -0.7854F);
        largeHeartCube3.texOffs(22, 81).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 0.25F, false);

        heartSmallAbdomen = new ModelRenderer(this);
        heartSmallAbdomen.setPos(0.0F, 11.3F, -2.05F);
        torso.addChild(heartSmallAbdomen);


        smallHeartCube1 = new ModelRenderer(this);
        smallHeartCube1.setPos(0.0F, 0.0F, 0.0F);
        heartSmallAbdomen.addChild(smallHeartCube1);
        setRotationAngle(smallHeartCube1, 0.0F, 0.0F, -0.7854F);
        smallHeartCube1.texOffs(17, 82).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube2 = new ModelRenderer(this);
        smallHeartCube2.setPos(0.3F, -0.3F, 0.0F);
        heartSmallAbdomen.addChild(smallHeartCube2);
        setRotationAngle(smallHeartCube2, 0.0F, 0.0F, -0.7854F);
        smallHeartCube2.texOffs(17, 80).addBox(0.175F, -1.0F, -0.5F, 0.825F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube3 = new ModelRenderer(this);
        smallHeartCube3.setPos(-0.3F, -0.3F, 0.0F);
        heartSmallAbdomen.addChild(smallHeartCube3);
        setRotationAngle(smallHeartCube3, 0.0F, 0.0F, -0.7854F);
        smallHeartCube3.texOffs(17, 85).addBox(0.0F, -1.0F, -0.5F, 1.0F, 0.825F, 1.0F, -0.2F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setPos(6.0F, -10.0F, 0.0F);
        upperPart.addChild(leftArm);
        leftArm.texOffs(32, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftArm.texOffs(53, 95).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.1F, true);
        leftArm.texOffs(48, 110).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.25F, true);
        leftArm.texOffs(48, 105).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, true);

        heartLeftArm = new ModelRenderer(this);
        heartLeftArm.setPos(0.0F, 3.8F, 1.8F);
        leftArm.addChild(heartLeftArm);


        heartCube4 = new ModelRenderer(this);
        heartCube4.setPos(0.0F, 0.0F, 0.0F);
        heartLeftArm.addChild(heartCube4);
        setRotationAngle(heartCube4, 0.0F, 0.0F, -0.7854F);
        heartCube4.texOffs(48, 119).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube5 = new ModelRenderer(this);
        heartCube5.setPos(0.5F, -0.5F, 0.0F);
        heartLeftArm.addChild(heartCube5);
        setRotationAngle(heartCube5, 0.0F, 0.0F, -0.7854F);
        heartCube5.texOffs(44, 120).addBox(0.19F, -1.0F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube6 = new ModelRenderer(this);
        heartCube6.setPos(-0.5F, -0.5F, 0.0F);
        heartLeftArm.addChild(heartCube6);
        setRotationAngle(heartCube6, 0.0F, 0.0F, -0.7854F);
        heartCube6.texOffs(48, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        leftArmJoint = new ModelRenderer(this);
        leftArmJoint.setPos(0.0F, 4.0F, 0.0F);
        leftArm.addChild(leftArmJoint);
        leftArmJoint.texOffs(32, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

        leftForeArm = new ModelRenderer(this);
        leftForeArm.setPos(0.0F, 4.0F, 0.0F);
        leftArm.addChild(leftForeArm);
        leftForeArm.texOffs(32, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, true);
        leftForeArm.texOffs(48, 105).addBox(-2.0F, 3.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, true);
        leftForeArm.texOffs(48, 119).addBox(-2.0F, -0.4F, -2.0F, 4.0F, 4.0F, 4.0F, 0.15F, true);
        leftForeArm.texOffs(32, 96).addBox(0.9F, 2.7F, -1.5F, 2.0F, 3.0F, 3.0F, -0.6F, true);
        leftForeArm.texOffs(42, 97).addBox(1.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, true);

        rightArm = new ModelRenderer(this);
        rightArm.setPos(-6.0F, -10.0F, 0.0F);
        upperPart.addChild(rightArm);
        rightArm.texOffs(0, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightArm.texOffs(18, 87).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.1F, false);
        rightArm.texOffs(16, 110).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.25F, false);
        rightArm.texOffs(16, 105).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, false);

        heartRightArm = new ModelRenderer(this);
        heartRightArm.setPos(0.0F, 3.8F, 1.8F);
        rightArm.addChild(heartRightArm);


        heartCube1 = new ModelRenderer(this);
        heartCube1.setPos(0.0F, 0.0F, 0.0F);
        heartRightArm.addChild(heartCube1);
        setRotationAngle(heartCube1, 0.0F, 0.0F, -0.7854F);
        heartCube1.texOffs(16, 119).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube2 = new ModelRenderer(this);
        heartCube2.setPos(0.5F, -0.5F, 0.0F);
        heartRightArm.addChild(heartCube2);
        setRotationAngle(heartCube2, 0.0F, 0.0F, -0.7854F);
        heartCube2.texOffs(12, 120).addBox(0.19F, -1.0F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube3 = new ModelRenderer(this);
        heartCube3.setPos(-0.5F, -0.5F, 0.0F);
        heartRightArm.addChild(heartCube3);
        setRotationAngle(heartCube3, 0.0F, 0.0F, -0.7854F);
        heartCube3.texOffs(16, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        rightArmJoint = new ModelRenderer(this);
        rightArmJoint.setPos(0.0F, 4.0F, 0.0F);
        rightArm.addChild(rightArmJoint);
        rightArmJoint.texOffs(0, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        rightForeArm = new ModelRenderer(this);
        rightForeArm.setPos(0.0F, 4.0F, 0.0F);
        rightArm.addChild(rightForeArm);
        rightForeArm.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightForeArm.texOffs(16, 105).addBox(-2.0F, 3.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, false);
        rightForeArm.texOffs(16, 119).addBox(-2.0F, -0.4F, -2.0F, 4.0F, 4.0F, 4.0F, 0.15F, false);
        rightForeArm.texOffs(0, 96).addBox(-2.9F, 2.7F, -1.5F, 2.0F, 3.0F, 3.0F, -0.6F, false);
        rightForeArm.texOffs(10, 97).addBox(-2.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setPos(1.9F, 12.0F, 0.0F);
        body.addChild(leftLeg);
        leftLeg.texOffs(96, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftLeg.texOffs(112, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.2F, false);
        leftLeg.texOffs(112, 108).addBox(1.8F, -1.75F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);

        heartRightLeg = new ModelRenderer(this);
        heartRightLeg.setPos(0.0F, 6.0F, -1.8F);
        leftLeg.addChild(heartRightLeg);


        heartCube10 = new ModelRenderer(this);
        heartCube10.setPos(0.0F, 0.05F, 0.0F);
        heartRightLeg.addChild(heartCube10);
        setRotationAngle(heartCube10, 0.0F, 0.0F, -0.7854F);
        heartCube10.texOffs(96, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube11 = new ModelRenderer(this);
        heartCube11.setPos(0.5F, -0.45F, 0.0F);
        heartRightLeg.addChild(heartCube11);
        setRotationAngle(heartCube11, 0.0F, 0.0F, -0.7854F);
        heartCube11.texOffs(92, 120).addBox(0.19F, -1.05F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube12 = new ModelRenderer(this);
        heartCube12.setPos(-0.5F, -0.45F, 0.0F);
        heartRightLeg.addChild(heartCube12);
        setRotationAngle(heartCube12, 0.0F, 0.0F, -0.7854F);
        heartCube12.texOffs(92, 118).addBox(0.0F, -1.05F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        leftLegJoint = new ModelRenderer(this);
        leftLegJoint.setPos(0.0F, 6.0F, 0.0F);
        leftLeg.addChild(leftLegJoint);
        leftLegJoint.texOffs(96, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setPos(0.0F, 6.0F, 0.0F);
        leftLeg.addChild(leftLowerLeg);
        leftLowerLeg.texOffs(96, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        leftLowerLeg.texOffs(112, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setPos(-1.9F, 12.0F, 0.0F);
        body.addChild(rightLeg);
        rightLeg.texOffs(64, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightLeg.texOffs(80, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.2F, false);
        rightLeg.texOffs(80, 108).addBox(-2.8F, -1.25F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        heartLeftLeg = new ModelRenderer(this);
        heartLeftLeg.setPos(0.0F, 6.0F, -1.8F);
        rightLeg.addChild(heartLeftLeg);


        heartCube7 = new ModelRenderer(this);
        heartCube7.setPos(0.0F, 0.05F, 0.0F);
        heartLeftLeg.addChild(heartCube7);
        setRotationAngle(heartCube7, 0.0F, 0.0F, -0.7854F);
        heartCube7.texOffs(64, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube8 = new ModelRenderer(this);
        heartCube8.setPos(0.5F, -0.45F, 0.0F);
        heartLeftLeg.addChild(heartCube8);
        setRotationAngle(heartCube8, 0.0F, 0.0F, -0.7854F);
        heartCube8.texOffs(60, 120).addBox(0.19F, -1.05F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube9 = new ModelRenderer(this);
        heartCube9.setPos(-0.5F, -0.45F, 0.0F);
        heartLeftLeg.addChild(heartCube9);
        setRotationAngle(heartCube9, 0.0F, 0.0F, -0.7854F);
        heartCube9.texOffs(60, 118).addBox(0.0F, -1.05F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        rightLegJoint = new ModelRenderer(this);
        rightLegJoint.setPos(0.0F, 6.0F, 0.0F);
        rightLeg.addChild(rightLegJoint);
        rightLegJoint.texOffs(64, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setPos(0.0F, 6.0F, 0.0F);
        rightLeg.addChild(rightLowerLeg);
        rightLowerLeg.texOffs(64, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightLowerLeg.texOffs(80, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, false);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
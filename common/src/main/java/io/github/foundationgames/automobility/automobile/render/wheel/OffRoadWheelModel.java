package io.github.foundationgames.automobility.automobile.render.wheel;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.automobile.render.BaseModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class OffRoadWheelModel extends BaseModel {
    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(Automobility.rl("automobile/wheel/off_road"), "main");

    public OffRoadWheelModel(EntityRendererProvider.Context ctx) {
        super(RenderType::entityCutout, ctx, MODEL_LAYER);
    }

    @Override
    protected void prepare(PoseStack matrices) {
        matrices.mulPose(Vector3f.YP.rotationDegrees(-90));
    }
}

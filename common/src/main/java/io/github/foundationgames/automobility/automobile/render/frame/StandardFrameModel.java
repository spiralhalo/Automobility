package io.github.foundationgames.automobility.automobile.render.frame;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.automobile.render.BaseModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class StandardFrameModel extends BaseModel {
    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(Automobility.rl("automobile/frame/standard"), "main");

    public StandardFrameModel(EntityRendererProvider.Context ctx) {
        super(RenderType::entityCutout, ctx, MODEL_LAYER);
    }

    @Override
    protected void prepare(PoseStack matrices) {
        matrices.mulPose(Vector3f.YP.rotationDegrees(-90));
    }
}

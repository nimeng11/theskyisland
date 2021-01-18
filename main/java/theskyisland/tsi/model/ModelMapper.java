package theskyisland.tsi.model;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import theskyisland.tsi.item.ItemInitializer;
import theskyisland.tsi.util.Reference;

import java.util.Objects;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Reference.MODID)
public class ModelMapper
{
    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event)
    {
        ModelLoader.setCustomModelResourceLocation(ItemInitializer.myFirstItem,
                0,
                new ModelResourceLocation(Objects.requireNonNull(ItemInitializer.myFirstItem.getRegistryName()),
                        "inventory"));
    }
}
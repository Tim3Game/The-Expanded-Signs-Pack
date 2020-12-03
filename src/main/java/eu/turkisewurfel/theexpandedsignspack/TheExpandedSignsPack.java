/*
  Generated with Minecraft Development plugin for JetBrains IntelliJ
 */
package eu.turkisewurfel.theexpandedsignspack;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@Mod(
        modid = TheExpandedSignsPack.MOD_ID,
        name = TheExpandedSignsPack.MOD_NAME,
        version = TheExpandedSignsPack.VERSION,
        dependencies = TheExpandedSignsPack.DEPENDENCIES,
        acceptedMinecraftVersions = TheExpandedSignsPack.ACCEPTEDMCVERSIONS
)
public class TheExpandedSignsPack {

    public static final String MOD_ID = "tesp";
    public static final String MOD_NAME = "TheExpandedSignsPack";
    public static final String VERSION = "2.0.0";
    public static final String DEPENDENCIES = "required-after:mts@[19.10.0,);";
    public static final String ACCEPTEDMCVERSIONS = "[1.12.2,]";

    //private static CreativeTabSigns creativeTabSigns;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static TheExpandedSignsPack INSTANCE;

    public TheExpandedSignsPack() {
    }

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //ModBlocks.init();
    }

    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
        }
        /* NEW - With custom inventories
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            System.out.println("!!!!! " + "registerItems");
            try{
                //First get the MTS classes.
                Class registry = Class.forName("minecrafttransportsimulator.dataclasses.MTSRegistry");
                Method getItemsMethod = registry.getMethod("getItemsForPack", String.class);
                List<Item> itemList = (List<Item>) getItemsMethod.invoke(null, MOD_ID);
                System.out.println("!!!!! " + itemList);

                Map<Boolean,List<Item>> signList = itemList.stream().collect(Collectors.partitioningBy(item -> item.getUnlocalizedName().contains("sign_")));
                creativeTabSigns = new CreativeTabSigns(signList.get(true));

                //Now register the pack items.  Use the unlocalized name as it's the only thing we can set MTS-side
                //that packs can see.  The name will be in the format of item.modid.name, so make sure to prune the
                //item.modid. portion to get a reasonable registry name.

                for(Item item : itemList){
                    System.out.println("!!!!! " + item);
                    item.setRegistryName(new ResourceLocation(MOD_ID, item.getUnlocalizedName().replace("item." + MOD_ID + ".", "")));
                    if (item.getUnlocalizedName().startsWith("sign_")) item.setCreativeTab(creativeTabSigns);
                    event.getRegistry().register(item);
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        */
    }
}

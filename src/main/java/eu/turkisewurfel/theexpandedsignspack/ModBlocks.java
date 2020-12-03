// package eu.turkisewurfel.theexpandedsignspack;
//
// import eu.turkisewurfel.theexpandedsignspack.blocks.BlockTESPTest;
// import net.minecraft.block.Block;
// import net.minecraft.client.renderer.block.model.ModelResourceLocation;
// import net.minecraft.item.Item;
// import net.minecraft.item.ItemBlock;
// import net.minecraftforge.client.event.ModelRegistryEvent;
// import net.minecraftforge.client.model.ModelLoader;
// import net.minecraftforge.event.RegistryEvent;
// import net.minecraftforge.fml.common.Mod;
// import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
// @Mod.EventBusSubscriber(modid = TheExpandedSignsPack.MOD_ID)
// public class ModBlocks {
//
//     static BlockTESPTest blockTESPTest;
//
//     public static void init() {
//         blockTESPTest = new BlockTESPTest();
//     }
//
//     @SubscribeEvent
//     public static void registerBlocks(RegistryEvent.Register<Block> event) {
//         event.getRegistry().registerAll(
//                 blockTESPTest
//         );
//     }
//
//     @SubscribeEvent
//     public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
//         event.getRegistry().registerAll(
//                 new ItemBlock(blockTESPTest).setRegistryName(blockTESPTest.getRegistryName())
//         );
//     }
//
//     @SubscribeEvent
//     public static void registerRenders(ModelRegistryEvent event) {
//         registerRender(blockTESPTest);
//     }
//
//     public static void registerRender(Block block) {
//         ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(), "inventory"));
//     }
//
// }
//
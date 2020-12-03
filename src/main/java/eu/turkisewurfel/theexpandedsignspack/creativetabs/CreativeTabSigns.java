package eu.turkisewurfel.theexpandedsignspack.creativetabs;

import eu.turkisewurfel.theexpandedsignspack.TheExpandedSignsPack;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.List;

public class CreativeTabSigns extends CreativeTabs {

    List<Item> itemList;

    public CreativeTabSigns(List<Item> itemList) {
        super(TheExpandedSignsPack.MOD_ID + "_signs");
        super.setBackgroundImageName("item_search.png");
        System.out.println(itemList);
        System.out.println(itemList.size());
        this.itemList = itemList;
    }

    public String getTranslatedTabLabel() {
        return "[TESP] Signs";
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(itemList.get(0));
    }

    @Override
    public ItemStack getIconItemStack(){
        //Render cycling items.
        return new ItemStack(itemList.get((int) (Minecraft.getMinecraft().world.getTotalWorldTime()/20%itemList.size())));
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> givenList){
        //This is needed to re-sort the items here to get them in the correct order.
        //MC will re-order these by ID if we let it.  To prevent this, we swap MC's
        //internal list with our own, which ensures that the order is the order
        //we did registration in.
        givenList.clear();
        for(Item item : itemList){
            for(CreativeTabs tab : item.getCreativeTabs()){
                item.getSubItems(tab, givenList);
            }
        }
    }
}

package evangamer2018.theevanmod.init;

import evangamer2018.theevanmod.main;
import evangamer2018.theevanmod.init.ModItemTier;
import net.minecraft.item.Foods;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.tags.Tag;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = main.MODID, bus = Bus.MOD)
@ObjectHolder(main.MODID)
public class ItemInit {
	
	// Item Registry
	public static final Item pancake = null;
	public static final Item pancake_batter = null;
	public static final Item infinity_ingot = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.COOKED_BEEF)).setRegistryName("pancake"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.CARROT)).setRegistryName("pancake_batter"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("infinity_ingot"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.infinity, 4, -2.0f, new Item.Properties().addToolType(net.minecraftforge.common.ToolType.PICKAXE, 3).group(ItemGroup.TOOLS)).setRegistryName("infinity_pickaxe"));
	}
}
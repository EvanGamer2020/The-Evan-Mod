package evangamer2018.theevanmod.init;

// Imports
import evangamer2018.theevanmod.main;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = main.MODID, bus = Bus.MOD)
@ObjectHolder(main.MODID)
public class BlockInit {
	public static final Block infinity_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		// Register Block
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 2.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("infinity_block"));
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		// Register Item For The Block
		event.getRegistry().register (new BlockItem(infinity_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("infinity_block"));
	}
}












































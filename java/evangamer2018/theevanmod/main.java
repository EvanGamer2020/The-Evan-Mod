package evangamer2018.theevanmod;

// Imports
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("theevanmod")
public class main
{
	public static final String MODID = "theevanmod";
	public static main instance;
	
	public main() {
		
		// I do not know what this dose.
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		// Instance Setup
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		// TODO
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		// TODO
	}
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		// TODO
	}
}

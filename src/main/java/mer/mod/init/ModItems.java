package mer.mod.init;

import mer.mod.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    //Like ModBlocks, this class creates all the items (food, armor, tools, etc.) along with any tool material to be used in the mod.

    public static Item.ToolMaterial trumptool = EnumHelper.addToolMaterial("trump", 10, 2000, 15F, 15F, 10);
    public static ItemArmor.ArmorMaterial trumparmor = EnumHelper.addArmorMaterial("trump", "mer:trump", 35, new int[]{3, 6, 8, 3}, 20, null, 3.0F);
    public static Item.ToolMaterial steeltool = EnumHelper.addToolMaterial("steel", 3, 500, 7F, 2.5F, 12);
    public static ItemArmor.ArmorMaterial steelarmor = EnumHelper.addArmorMaterial("steel", "mer:steel", 25, new int[]{6, 4, 4, 4}, 8, null, 1.5F);

    public static Item trumpsword;
    public static Item trumpaxe;
    public static Item trumpgem;
    public static Item trumphelmet;
    public static Item trumpleggings;
    public static Item trumpboots;
    public static Item trumpchestplate;
    public static Item trumphoe;
    public static Item trumpspade;
    public static Item trumppickaxe;
    public static Item salt;
    public static Item butter;
    public static Item toast;
    public static Item butteredtoast;
    public static Item dough;
    public static Item perogie;
    public static Item steelingot;
    public static Item steelpowder;
    public static Item steelsword;
    public static Item steelaxe;
    public static Item steelhoe;
    public static Item steelpickaxe;
    public static Item steelspade;
    public static Item steelhelmet;
    public static Item steelleggings;
    public static Item steelboots;
    public static Item steelchestplate;

    public static void init() {
        trumpsword = new ItemTrumpSword(trumptool);
        trumpaxe = new ItemTrumpAxe(trumptool, 8, 1.2F);
        trumpspade = new ItemTrumpSpade(trumptool);
        trumpgem = new ItemTrumpGem();
        trumphoe = new ItemTrumpHoe(trumptool);
        trumphelmet = new ItemTrumpHelmet(trumparmor, 1, EntityEquipmentSlot.HEAD);
        trumpboots = new ItemTrumpBoots(trumparmor, 1, EntityEquipmentSlot.FEET);
        trumpchestplate = new ItemTrumpChestplate(trumparmor, 1, EntityEquipmentSlot.CHEST);
        trumpleggings = new ItemTrumpLeggings(trumparmor, 2, EntityEquipmentSlot.LEGS);
        trumppickaxe = new ItemTrumpPickaxe(trumptool);
        salt = new ItemSalt();
        butter = new ItemButter();
        toast = new ItemToast();
        butteredtoast = new ItemButteredToast();
        dough = new ItemDough();
        perogie = new ItemPerogie();
        steelingot = new ItemSteelIngot();
        steelpowder = new ItemSteelPowder();
        steelsword = new ItemSteelSword(steeltool);
        steelaxe = new ItemSteelAxe(steeltool, 7, 1.0F);
        steelpickaxe = new ItemSteelPickaxe(steeltool);
        steelhoe = new ItemSteelHoe(steeltool);
        steelspade = new ItemSteelSpade(steeltool);
        steelhelmet = new ItemSteelHelmet(steelarmor, 1, EntityEquipmentSlot.HEAD);
        steelboots = new ItemSteelBoots(steelarmor, 1, EntityEquipmentSlot.FEET);
        steelchestplate = new ItemSteelChestplate(steelarmor, 1, EntityEquipmentSlot.CHEST);
        steelleggings = new ItemSteelLeggings(steelarmor, 2, EntityEquipmentSlot.LEGS);
    }
    public static void register() {

        //This bit registers any item into Minecraft so it can be found by the main game

        GameRegistry.register(trumpsword);
        GameRegistry.register(trumpaxe);
        GameRegistry.register(trumpgem);
        GameRegistry.register(trumphoe);
        GameRegistry.register(trumphelmet);
        GameRegistry.register(trumpleggings);
        GameRegistry.register(trumpchestplate);
        GameRegistry.register(trumpboots);
        GameRegistry.register(trumpspade);
        GameRegistry.register(trumppickaxe);
        GameRegistry.register(salt);
        GameRegistry.register(butter);
        GameRegistry.register(toast);
        GameRegistry.register(butteredtoast);
        GameRegistry.register(dough);
        GameRegistry.register(perogie);
        GameRegistry.register(steelhelmet);
        GameRegistry.register(steelleggings);
        GameRegistry.register(steelchestplate);
        GameRegistry.register(steelboots);
        GameRegistry.register(steelspade);
        GameRegistry.register(steelpickaxe);
        GameRegistry.register(steelaxe);
        GameRegistry.register(steelhoe);
        GameRegistry.register(steelsword);
    }

    public static void registerRenders() {

        //This bit just registers the items 3d renders which are controlled by .json files in the "models" resource file

        registerRender(trumpsword);
        registerRender(trumpaxe);
        registerRender(trumpgem);
        registerRender(trumphoe);
        registerRender(trumphelmet);
        registerRender(trumpchestplate);
        registerRender(trumpleggings);
        registerRender(trumpboots);
        registerRender(trumpspade);
        registerRender(trumppickaxe);
        registerRender(salt);
        registerRender(butter);
        registerRender(toast);
        registerRender(butteredtoast);
        registerRender(dough);
        registerRender(perogie);
        registerRender(steelhelmet);
        registerRender(steelleggings);
        registerRender(steelchestplate);
        registerRender(steelboots);
        registerRender(steelspade);
        registerRender(steelpickaxe);
        registerRender(steelaxe);
        registerRender(steelhoe);
        registerRender(steelsword);
    }


    private static void registerRender(Item item) {

        //This registers the items texture for when it is in the inventory of a player.
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}


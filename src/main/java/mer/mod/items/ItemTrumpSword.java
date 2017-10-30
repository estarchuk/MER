package mer.mod.items;

public class ItemTrumpSword  extends ItemSword{

    public ItemTrumpSword(Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPSWORD.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPSWORD.getRegistryName());
    }
}

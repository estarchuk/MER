package mer.mod.items;

public class ItemTrumpAxe extends ItemAxe{

    public ItemTrumpAxe(item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPAXE.getRegistryName());
    }
}

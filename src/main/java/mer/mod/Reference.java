package mer.mod;

public class Reference {

    public static final String MOD_ID = "mer";
    public static final String NAME = "mer";
    public static final String VERSION = "1.1";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "mer.mod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "mer.mod.proxy.ServerProxyClass";

    public static enum ModBlocks{
        CEMENT("cement", "BlockCement"),
        TRUMPIUMORE("trumpiumore", "BlockTrumpiumore");

        private String unlocalizedName;
        private String registryName;

        ModBlocks(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;

        }

        public String getRegistryName() {
            return registryName;
        }
    }

    public static enum ModItems{
        TRUMPSWORD("trumpsword", "ItemTrumpSword"),
        TRUMPAXE("trumpaxe", "ItemTrumpAxe"),
        TRUMPHOE("trumphoe", "ItemTrumpHoe"),
        TRUMPPICKAXE("trumppickaxe", "ItemTrumpPickaxe"),
        TRUMPSPADE("trumpspade", "ItemTrumpSpade");

        private String unlocalizedName;
        private String registryName;

        ModItems(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;

        }
        public String getRegistryName() {
            return registryName;
        }
    }
}

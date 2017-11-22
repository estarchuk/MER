package mer.mod;

public class Reference {

    public static final String MOD_ID = "mer";
    public static final String NAME = "mer";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "mer.mod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "mer.mod.proxy.ServerProxyClass";

    /*This is the Reference file. Everything and anything is referenced in here for their unlocalized and registry name
    Without this file, stuff would break. Badly.
     */

    public static enum ModBlocks{
        SALT("salt", "blocksalt"),
        CEMENT("cement", "blockcement"),
        TRUMPIUMORE("trumpiumore", "blocktrumpiumore"),
        TRUMPIUMBLOCK("trumpiumblock", "blocktrumpiumblock");

        //The order of these strings is important. If one of them is in the wrong place, stuff breaks.

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

    public static enum ModEntities {
        MASKEDZOMBIE("maskedzombie", "entitymaskedzombie"),
        TRUMP("trump", "entitytrump"),
        ZOMBIEWOLF("zombiewolf", "entityzombiewolf");

        private String unlocalizedName;
        private String registryName;

        ModEntities(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getRegistryName() {
            return registryName;
        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }
    }

    public static enum ModItems{
        TRUMPSWORD("trumpsword", "itemtrumpsword"),
        TRUMPAXE("trumpaxe", "itemtrumpaxe"),
        TRUMPHOE("trumphoe", "itemtrumphoe"),
        TRUMPSPADE("trumpspade", "itemtrumpspade"),
        TRUMPHELMET("trumphelmet", "itemtrumphelmet"),
        TRUMPCHESTPLATE("trumpchestplate", "itemtrumpchestplate"),
        TRUMPLEGGINGS("trumpleggings", "itemtrumpleggings"),
        TRUMPBOOTS("trumpboots", "itemtrumpboots"),
        TRUMPGEM("trumpgem", "itemtrumpgem"),
        TRUMPPICKAXE("trumppickaxe", "itemtrumppickaxe"),
        SALT("salt", "itemsalt"),
        BUTTER("butter", "itembutter"),
        TOAST("toast", "itemtoast"),
        BUTTEREDTOAST("butteredtoast", "itembutteredtoast"),
        DOUGH("dough", "itemdough"),
        PEROGIE("perogie", "itemperogie"),
        STEELSWORD("steelsword", "itemsteelsword"),
        STEELAXE("steelaxe", "itemsteelaxe"),
        STEELHOE("steelhoe", "itemsteelhoe"),
        STEELSPADE("steelspade", "itemsteelspade"),
        STEELHELMET("steelhelmet", "itemsteelhelmet"),
        STEELCHESTPLATE("steelchestplate", "itemsteelchestplate"),
        STEELLEGGINGS("steelleggings", "itemsteelleggings"),
        STEELBOOTS("steelboots", "itemsteelboots"),
        STEELPOWDER("steelpowder", "itemsteelpowder"),
        STEELPICKAXE("steelpickaxe", "itemsteelpickaxe"),
        STEELINGOT("steelingot", "itemsteelingot");

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

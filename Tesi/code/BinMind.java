public class BinMind extends SynapsisMind {
  
   private static final String BIN_TYPE = "bin_type";
   
   private static final String MOCK_CLASS = "BinMock";

   protected void init(final String name, final String url, final int reconnectionAttempts, final Object[] params) {
      // prendo la tipologia di bidone dai parametri custom
      this.defineObsProperty(BIN_TYPE, params[0]);
     
      super.init(name, url, reconnectionAttempts);
      //this.createMyMockEntity(MOCK_CLASS);
   }

   @Override
   public void counterpartEntityReady() {
      if (this.hasObsProperty(BIN_TYPE)) {
         String type = this.getObsProperty(BIN_TYPE).stringValue();
         this.doAction(BIN_TYPE, type);
      }
   }

   @Override
   public void counterpartEntityUnready() {}

   @Override
   public void parseIncomingPerception(String sender, String perception, ArrayList<Object> params) {}
   
}

public class TestMock extends MockActor {

   private TestMock(final String type, String name, SynapsisEventBus eventBus) {
      super(type, name, eventBus);
   }

   public static Props props(String type, String name, SynapsisEventBus eventBus) {
      return Props.create(TestMock.class, () -> new TestMock(type, name, eventBus));
   }

   /**
    * Metodo invocato per ogni messaggio ricevuto dal MockActor
    * @param content contenuto principale del messaggio
    * @param params parametri del messaggio
    */
   @Override
   public void parseIncomingMessage(String content, ArrayList<Object> params) {
   }

   /**
    * Metodo invocato alla connessione della controparte
    */
   @Override
   public void counterpartJoined() {
      super.counterpartJoined();
   }

   /**
    * Metodo invocato alla disconnessione della controparte
    */
   @Override
   public void counterpartLeaved() {
      super.counterpartLeaved();
   }
}

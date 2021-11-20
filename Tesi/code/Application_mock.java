public class Application extends Controller {

   @Inject
   public Application(ActorSystem actorSystem, Materializer materializer) {
      ...
      this.spawnMockActor(TestMock.class,Shared.ENTITY_BODY_KEY,"prova");
      //oppure
      this.spawnMockActors(TestMock.class,Shared.ENTITY_MIND_KEY,"test",2);
   }

   /**
    * Metodo per istanziare un attore che estende MockActor
    * @param source Classe Java che rappresenta l'attore
    * @param type Tipologia di entità (mind / body)
    * @param name Nome dell'entità
    */
   private void spawnMockActor(Class<? extends MockActor> source, String type, String name) {
      Props props = Props.create(source, type, name, this.synapsisEventBus);
      this.actorSystem.actorOf(props);
   }

   /**
    * Metodo per istanziare N attori che estendono MockActor
    * @param source Classe Java che rappresenta l'attore
    * @param type Tipologia delle entità (mind / body)
    * @param baseName Nome base delle entità -> il nome risultato sara baseName1,...,baseNameN
    * @param number Numero di entità da istanziare
    */
   private void spawnMockActors(Class<? extends MockActor> source, String type, String baseName, int number) {
      for (int i = 1; i <= number; i++) {
         this.spawnMockActor(source, type, baseName + i);
      }
   }
}

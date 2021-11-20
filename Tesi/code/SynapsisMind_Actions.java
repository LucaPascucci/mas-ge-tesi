package synapsis;

public abstract class SynapsisMind extends Artifact {
   /**
    * Operazione per avviare la ricerca di un'entità 
    * @param entityType nome anche parziale dell'entità da cercare
    */
   @OPERATION
   public void searchAction(final String entityType) {...}

   /**
    * Operazione per inviare un'azione di movimento al corpo
    * @param entityName nome entità da raggiungere
    */
   @OPERATION
   public void goToAction(final String entityName) {...}

   /**
    * Operazione per fermare il corpo
    */
   @OPERATION
   public void stopAction() {...}

   /**
    * Operazione per prelevare un'entità
    * @param entityName nome dell'entita da prelevare
    */
   @OPERATION
   public void pickUpAction(final String entityName) {...}

   /**
    * Operazione per rilasciare un'entità
    * @param entityName nome dell'entita da rilasciare
    */
   @OPERATION
   public void releaseAction(final String entityName) {...}

   /**
    * Operazione per una generica azione
    * @param action azione
    * @param params parametri
    */
   @OPERATION
   public void doAction(final String action, final Object... params) {...}

}

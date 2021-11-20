package synapsis;

public abstract class SynapsisMind extends Artifact {

   /**
    *  Operazione per istanziare il proprio mock actor nel middleware
    * @params className nome della classe java dell'attore da istanziare 
    */
   @OPERATION
   public void createMyMockEntity(final String className) {...}
}

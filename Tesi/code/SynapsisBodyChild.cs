public class SynapsisBodyChild : MonoBehaviour
{
   protected SynapsisBody RootBody;

   private void Awake()
   {
      // Metodo per avere l'istanza dello script che sta alla testa (root) del GameObject complesso
      RootBody = GetComponentInParent<SynapsisBody>();
   }

   public virtual string GetMindName()
   {
      return RootBody.name;
   }
}

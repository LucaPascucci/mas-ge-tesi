/// <summary>
/// Metodo per inviare le percezioni fisiche/visive del VirtualBody alla VirtualMind
/// </summary>
/// <param name="sender">Mittente</param>
/// <param name="perception">Breve descrizione del messaggio. ES: pronto, ostacolo, fermo, ...</param>
/// <param name="parameters">Lista di parametri collegati al contenuto</param>
public void TransmitPerception(string sender, string perception, List<object> parameters) {
   Message message = new Message(CreateHierarchyPath(sender, HierarchyTree), MindInfo.EntityName, perception, parameters);
   SendMessage(message);
}

/// <summary>
/// Genera ricorsivamente la struttura gerarchica del gameObject complesso
/// </summary>
/// <param name="go">GameObject di cui generare la struttura gerarchica</param>
/// <returns>L'albero della gerachia</returns>
private Tree<string> CreateSubTree(GameObject go) {
   Tree<string> subTree = new Tree<string>(go.name);
   Transform[] tList = go.GetComponentsInChildren<Transform>(); //NOTE prende anche se stesso quindi ho messo anche il filtro sul nome
   if (tList != null) {
      foreach (Transform t in tList) {
         if (t != null && t.gameObject != null && !go.name.Equals(t.gameObject.name)) {
            subTree.AddChild(CreateSubTree(t.gameObject));
         }
      }
   }
   return subTree;
}

/// <summary>
/// Genera ricorsivamente il path della struttura gerarchica in base al mittente della percezione
/// </summary>
/// <param name="sender">nome del mittente</param>
/// <returns>Path nel formato "padre.figlio.sottofiglio..."</returns>
private string CreateHierarchyPath(string sender, Tree<string> hierarchyTree) {
   if (hierarchyTree.Value.Equals(sender)) {
      return hierarchyTree.Value;
   } else if (hierarchyTree.ChildrenCount == 0) {
      return "";
   } else {
      foreach (Tree<string> child in hierarchyTree.Children){
         string subPath = CreateHierarchyPath(sender, child);
         if (subPath != "") {
            return hierarchyTree.Value + "." + subPath;
         }
      }
      return "";
   }
}

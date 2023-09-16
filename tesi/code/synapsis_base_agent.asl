// Synapsis base agent --> Agente che deve essere incluso per creare ed utilizzare l'artefatto SynapsisMind

// Initial beliefs and rules
synapsis_base_name("synapsis_"). //Nome base utilizzato per identificare tutti gli artefatti SynapsisMind

// Plans

// Plan da sovrascrivere in ogni agente per sapere lo stato di collegamento del proprio corpo
+synapsis_counterpart_status(Name,C): .my_name(Me) & .substring(Me,Name) <-
   ?my_synapsis_mind_ID(ArtId);
   synapsisLog("Sovrascrivere belief --> +synapsis_counterpart_status(Name,C): .my_name(Me) & .substring(Me,Name)") [artifact_id(ArtId)];
   if (C == true){
      synapsisLog("Controparte collegata") [artifact_id(ArtId)];
   } else {
      synapsisLog("Controparte non collegata") [artifact_id(ArtId)];
   }.

// Plan per istanziare il proprio artefatto SinapsisMind con parametri custom
+!createSynapsisMind(Params): synapsis_url(Url) & synapsis_mind_class(Class) & reconnection_attempts(Attempts) <-
   ?synapsis_base_name(BaseName);
   .my_name(Me);
   .concat(BaseName,Me,ArtifactName);
   makeArtifact(ArtifactName,Class,[Me,Url,Attempts,Params],ArtId);
   +my_synapsis_mind_ID(ArtId);
   focus(ArtId).
   
-!createSynapsisMind(Params) <-
   ?synapsis_base_name(BaseName);
   .my_name(Me);
   .concat(BaseName,Me,ArtifactName);
   .print("Creazione dell'artefatto ", ArtifactName, " fallita!!", Message).
   
// Plan per istanziare il proprio artefatto SinapsisMind
+!createSynapsisMind: synapsis_url(Url) & synapsis_mind_class(Class) & reconnection_attempts(Attempts) <-
   ?synapsis_base_name(BaseName);
   .my_name(Me);
   .concat(BaseName,Me,ArtifactName);
   makeArtifact(ArtifactName,Class,[Me,Url,Attempts],ArtId);
   +my_synapsis_body_ID(ArtId);
   focus(ArtId).
   
-!createSynapsisMind <-
   ?synapsis_base_name(BaseName);
   .my_name(Me);
   .concat(BaseName,Me,ArtifactName);
   .print("Creazione dell'artefatto ", ArtifactName, " fallita!!", Message).

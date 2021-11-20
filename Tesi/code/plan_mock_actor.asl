
// Plan per creare il proprio MockActor su Synapsis
+!createMySynapsisMockEntity(MockClassName): focused(_,N,_) & synapsis_base_name(BaseName) & .substring(BaseName,N) <-
   ?my_synapsis_mind_ID(ArtId);
   .my_name(Me);
   createMyMockEntity(MockClassName) [artifact_id(ArtId)];
   synapsisLog("Inviata richiesta di creazione entità mock:", Me , "-> classe:", MockClassName) [artifact_id(ArtId)].

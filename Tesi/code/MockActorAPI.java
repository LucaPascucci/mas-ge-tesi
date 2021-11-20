/**
 * Metodo per inviare un messaggio(risposta) generico alla controparte
 * @param content contenuto principale del messaggio
 * @param params parametri del messaggio
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void sendResponse(String content, ArrayList<Object> params, long delay) {...}

/**
 * Metodo per inviare un messaggio di auto-distruzione alla controparte
 * @param delay tempo di attesa (ms) prima dell'invio della risposta
 */
public void selfDestruction(long delay) {...}

/**
 * Metodo per inviare una azione di ricerca alla controparte
 * @param target nome (anche parziale) dell'entità da cercare
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void searchAction(String target, long delay) {...}

/**
 * Metodo per inviare una azione di movimento alla controparte
 * @param destination nome dell'entità da raggiungere
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void goToAction(String destination, long delay) {...}

/**
 * Metodo per inviare una azione di stop alla controparte
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void stopAction(long delay) {...}

/**
 * Metodo per inviare una azione di prelevamento alla controparte
 * @param target nome dell'entità da prendere
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void pickUpAction(String target, long delay) {...}

/**
 * Metodo per inviare una azione di rilasio alla controparte
 * @param target nome dell'entità da rilasciare
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void releaseAction(String target, long delay) {...}

/**
 * Metodo per inviare una percezione di ritrovamento alla controparte
 * @param entityName nome dell'entità trovata
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void foundPerception(String entityName, long delay) {...}

/**
 * Metodo per inviare una percezione di arrivo alla controparte
 * @param destination nome dell'entità raggiunta
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void arrivedToPerception(String destination, long delay) {...}

/**
 * Metodo per inviare una percezione di stop alla controparte
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void stoppedPerception(long delay) {...}

/**
 * Metodo per inviare una percezione di prelevamento alla controparte
 * @param entityName nome dell'entità prelevata
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void pickedPerception(String entityName, long delay) {...}

/**
 * Metodo per inviare una percezione di rilascio alla controparte
 * @param entityName nome dell'entità rilasciata
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void releasedPerception(String entityName, long delay) {...}

/**
 * Metodo per inviare una percezione di contatto alla controparte
 * @param entityName nome dell'entità toccata
 * @param delay tempo di attesa (ms) prima dell'invio del messaggio
 */
public void touchedPerception(String entityName, long delay) {...}

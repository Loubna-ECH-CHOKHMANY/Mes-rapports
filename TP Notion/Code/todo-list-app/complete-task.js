// Fonctionnalité : Marquer une tâche comme terminée
const { taches } = require('./add-task');

function marquerTerminee(id) {
    const tache = taches.find(t => t.id === id);
    if (tache) {
        tache.terminee = true;
        console.log(`☑️ Tâche marquée comme terminée : "${tache.titre}"`);
    } else {
        console.log(`❌ Tâche introuvable avec l'id : ${id}`);
    }
}

module.exports = { marquerTerminee };
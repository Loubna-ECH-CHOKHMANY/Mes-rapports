// Fonctionnalité : Supprimer une tâche
const { taches } = require('./add-task');

function supprimerTache(id) {
    const index = taches.findIndex(t => t.id === id);
    if (index !== -1) {
        const tache = taches.splice(index, 1);
        console.log(`🗑️ Tâche supprimée : "${tache[0].titre}"`);
    } else {
        console.log(`❌ Tâche introuvable avec l'id : ${id}`);
    }
}

module.exports = { supprimerTache };
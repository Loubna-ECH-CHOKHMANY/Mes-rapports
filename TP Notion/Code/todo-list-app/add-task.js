// Fonctionnalité : Ajouter une tâche
let taches = [];

function ajouterTache(titre) {
    const tache = {
        id: taches.length + 1,
        titre: titre,
        terminee: false
    };
    taches.push(tache);
    console.log(`✅ Tâche ajoutée : "${titre}"`);
    return tache;
}

module.exports = { ajouterTache, taches };

const { ajouterTache, taches } = require('./add-task');
const { supprimerTache } = require('./delete-task');
const { marquerTerminee } = require('./complete-task');

console.log("=== Application To-Do List ===\n");

// Ajouter des tâches
ajouterTache("Faire les courses");
ajouterTache("Réviser le cours Git");
ajouterTache("Rendre le TP Notion");

console.log("\n--- Liste des tâches ---");
console.log(taches);

// Marquer une tâche comme terminée
console.log("\n--- Marquer tâche 1 comme terminée ---");
marquerTerminee(1);

// Supprimer une tâche
console.log("\n--- Supprimer tâche 2 ---");
supprimerTache(2);

console.log("\n--- Liste finale ---");
console.log(taches);
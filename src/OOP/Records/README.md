<h2>Les classes Records est  contiennent principalement des données. Les records réduisent le code boilerplate (répétitif) associé à la création de classes simples comme les DTO (Data Transfer Objects).</h2>
<h3>Principales caractéristiques des records :</h3>
<p>

    Immutabilité : Les champs d’un record sont final par défaut, ce qui signifie que leurs valeurs ne peuvent pas être modifiées une fois définies.
    Boilerplate réduit : Lorsqu’un record est défini, le compilateur génère automatiquement :
        Le constructeur.
        Les méthodes equals(), hashCode() et toString().
        Les accesseurs (getters), qui ont les mêmes noms que les champs.
Limitations des records

    Immutabilité stricte : Tous les champs d’un record sont final. Si vous avez besoin de champs modifiables, vous devrez utiliser une classe classique.
    Héritage : Les records ne peuvent pas hériter d’autres classes (car ils sont déclarés final), mais ils peuvent implémenter des interfaces.
    Pas de surcharge des accesseurs : Les accesseurs générés (comme x() et y() dans l’exemple) ne peuvent pas être redéfinis.

Quand utiliser un record ?

    Pour des classes simples contenant uniquement des données.
    Pour des structures immuables.
    Pour éviter d’écrire manuellement du code boilerplate.

Les records sont particulièrement utiles dans les contextes comme les DTO, les valeurs de configuration, ou les données transférées dans des API.
<br><br>
c'est une classe finale : un record ne peut être hérité.

    chaque élément fourni entre parenthèses sera de visibilité privée et final

    un accesseur est automatiquement ajouté pour chaque élément

    un constructeur public permettant d'initialiser les éléments est automatiquement ajouté 
</p>
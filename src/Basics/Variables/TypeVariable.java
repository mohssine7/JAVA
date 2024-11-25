package Basics.Variables;

public class TypeVariable {
    // 2 valeurs possibles uniquement : true ou false
    boolean myVarBool = true;
    //Valeur numérique pouvant aller de -128 à 127 inclus.
    byte myVarByte = 10;
    //Un simple caractère
    char myVarChar = 'a';
    //Valeur flottante à double précision allant de 2.22507e-308 à 1.79769e+308
    double myVarDouble = 10.5; ;
    //Valeur flottante à simple précision allant de 1.401e-045 à 3.40282e+038
    float myVarFloat = 10.0f;
    //Valeur numérique entière pouvant aller de 231 à  231-1 inclus.
    int myVarInt = 10;
    //Valeur numérique entière pouvant aller de 264 à  264-1 inclus.
    long myVarLong = 10;
    //Valeur numérique entière pouvant aller de -32,768 à 32,767 inclus.
    short myVarShort = 10;
    // chaine de caractères
    String myStringVar = "Hello";
    // tableau de caractères
    static char[] myVarCharArray = {'H', 'e', 'l', 'l', 'o'};
    // var laisse au jdk choisi le type à la place de déclarer une type explicite


}

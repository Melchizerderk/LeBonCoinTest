Pour lancer le serveur, il est nécessaire d'avoir java 8 d'installer sur l'ordinateur

Sur linux en ligne de commande : sudo apt-get install openjdk-8-jdk
Sinon sur windows/linux avec une archive :
https://jdk.java.net/java-se-ri/8-MR3

Il suffit de double cliquer sur le fizzbuzz-Rest-jar-0.0.1-SNAPSHOT.jar et se mettre sur localhost:8080 pour se connecter.

Les urls sont indiqué sur localhost:8080, elles sont localhost:8080/fizz-buzz/statistics et localhost:8080/fizz-buzz/query?int1=&int2=&limit=&str1=&str2=

Les sources sont dans l'archive testLbc/springboot/src/main.

Le projet a été fait avec intellij, il est donc simple de l'ouvrir avec ce dernier :

https://www.jetbrains.com/fr-fr/idea/download/

Il suffit ensuite de faire File -> open sur testLbc.

Pour regenerer il faut dans l'arborescence cliquer sur le pom.xml, (ouvrir l'arborescence Maven qui devrait être situé sur la droite (cliquez sur le petit Maven vertical si elle n'apparait pas) selectionner clean puis au moins package.

Intellij devrait automatiquement charger le sdk, mais si ce n'est pas le cas, il faut aller dans File -> Project Structure et dans l'onglet Project selectionner le jdk 1.8



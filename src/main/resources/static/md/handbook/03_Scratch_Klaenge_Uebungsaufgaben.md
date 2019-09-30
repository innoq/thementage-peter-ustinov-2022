#### Klänge

Klänge findet ihr in der pinken Block-Kategorie. Sie können dazu eingesetzt werden, ganze Musikstücke oder kurze Sounds abzuspielen oder zu stoppen. Ebenfalls können Effekte und Lautstärke bearbeitet werden.

##### Kostenlose Sounds

Auf diesen Seiten findet ihr kostenlose Sounds. Bitte vergesst nicht die Lizenzen und Urheber*innen anzugeben.

*   [http://www.bfxr.net/](http://www.bfxr.net/)
*   [https://www.freesound.org/](https://www.freesound.org)

##### Kostenlose Musik

Auf diesen Seiten findet ihr kostenlose Musik. Bitte vergesst nicht die Lizenzen und Urheber*innen anzugeben.

*   [http://soundbible.com/](http://soundbible.com)
*   [http://incompetech.com/music/royalty-free/](http://incompetech.com/music/royalty-free/)

##### Klangblöcke

*   `spiele Klang () ganz`: Spielt den Klang () ganz ab, bevor der nächste Block drankommt.
*   `spiele Klang ()`: Spielt einige Millisekunden eines Klangs () ab und geht dann zum nächsten Block.
*   `stoppe alle Klänge`: Stoppt global alle Klänge, die wiedergegeben werden.
*   `ändere Effekt [] um ()`: Ermöglicht das Verändern der Tonhöhe sowie der Balance. Die Balance bestimmt, ob Klänge mehr über den linken oder rechten Lautsprecher ausgegeben werden. Der Block kann mehrfach aufgerufen und die Höhe oder Balance um den angebebenen Wert verändert werden.
*   `setze Effekt [] auf ()`: Ermöglicht das Verändern der Tonhöhe sowie der Balance. Die Balance bestimmt, ob Klänge mehr über den linken oder rechten Lautsprecher ausgegeben werden. Der Block setzt die Höhe oder Balance auf einen bestimmten Wert. Ein mehrfaches Aufrufen des Blockes hintereinander ist somit effektlos.
*   `schalte Klangeffekte aus`: Löscht alle derzeit vorhandenen Klänge. Die aktuelle Wiedergabe wird jedoch nicht unterbrochen.
*   `ändere Lautstärke um ()`: Ändere die Lautsärke um den angegebenen Wert.
*   `setze Lautstärke auf ()%`: Setze die Lautstärke auf den angebenen Wert.
*   `Lautstärke`: In dieser Variable ist die aktuelle Lautstärke gespeichert.

#### Übungsaufgaben

##### 1\. Hello World

*   Wenn auf die Fahne geklickt wird, soll die Figur "Hello World!" sagen.

##### 2\. Größenveränderungen

*   Ändere die Größe der Figur um eine "Zufallszahl" zwischen "-50" und "50", wenn diese angeklickt wird.

##### 3\. Erste Schritte

*   Lasse die Figur in die Richtung laufen, deren Pfeil gedrückt wird. Bei dem Pfeil nach unten läuft sie so beispielweise um -12 Schritte in y-Richtung.

##### 4\. Springen

*   Wenn auf die Fahne geklickt wird, soll die Figur immer dann, wenn die Leertaste gedrückt wird, ihren y-Wert um "10" ändern. Wird die Leertaste nicht gedrückt, soll sie den y-Wert um "-5" verändern.

##### 5\. Springen 2.0

*   Verändere die Aufgabe "Springen" so, dass der y-Wert nicht kleiner als 0 sein kann. Der y-Wert soll also, wenn er 0 oder kleiner ist, nicht mehr um -5 verringert werden.

##### 6\. Fragen

*   Wenn die Fahne angeklickt wird, soll eine Variable "Richtige Antwort" auf "INNOQ" gesetzt werden. Dannach soll die Frage (mit warten) "Bei welcher Firma bist du heute?" so lange "wiederholt" werden bis die eingegebene "Antwort" der "richtigen Antwort" entspricht.

##### 7\. Gegen die Wand

*   Lasse deine Figur beim Klicken der Pfeiltaste "nach rechts" nach rechts laufen. Wenn ihr x-Wert dabei größer als "150" ist, sendest du eine Nachricht "Wand!" an alle. Wird die Nachricht "Wand!" empfangen setzt du den x-Wert auf "-150". "-150" soll ebenfalls der Startwert beim Drücken der grünen Fahne sein.

##### 8\. Ton ab

*   Verändere die Aufgabe "Gegen die Wand" so, dass jedes mal wenn die Nachricht "Wand!" emfangen wird, ein Klang abgespielt wird. Bei jeder "Wand!"-Nachricht soll zudem der Effekt "Höhe" um "10" erhöht werden.

##### 9\. Auf die Figur, fertig, los!

*   Wenn die Fahne geklickt wird, soll "20" mal folgendes passieren: Die Figur soll "1" Sekunde zu "Zufallsposition" gleiten. Falls ihre x-Position dabei größer als 150 oder kleiner als -150 und ihre y-Position größer als 100 oder kleiner als -100 ist, soll ein Klon von "mir selbst", also der Figur, erstellt werden. Des Weiteren soll der Effekt "Farbe" um "15" geändert werden.
*   Wenn ein Klon entsteht, soll genau dasselbe passieren. Nur soll dies nicht "20" mal wiederholt werden.

##### 10\. Malen

*   Füge den Blockkategorien die Erweiterung "Malstift" hinzu.
*   Wenn auf die Fahne geklickt wird, sollen alle gemalten Linien gelöscht werden.
*   Wenn auf die Fahne geklickt wird, soll auf fortlaufend ein "Abdruck" deiner Figur erstellt werden. Dieser soll sich immer zu dem Mauszeiger drehen und x Schritte laufen. Am Rand soll die Figur abprallen.
*   Lasse die Figur sich immer nach rechts um eine "Zufallszahl" drehen und ändere die Farbe der Figur währenddessen ebenfalls um z.

##### 11\. Fangen

*   Verändere Aufgabe "Erste Schritte" so, dass du zwei Figuren in der Szene hast. Die neue Figur soll, wenn die grüne Fahne angeklickt wird, wiederholt in "3" Sek. zu "Zufallsposition" gleiten. Wird dabei die Figur aus "Erste Schritte" berührt, soll eine Nachticht "Gefangen" an alle gesendet werden. Wird die Nachricht "Gefahr" empfangen, sollen andere Skripte der Figur (der neuen) stoppen und die Figur (die neue) soll für "2" Sekunden "Du hast mich" sagen.
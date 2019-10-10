
#### Klänge
​
Klänge findet ihr in der pinken Block-Kategorie. Sie können dazu eingesetzt werden, ganze Musikstücke oder kurze Sounds abzuspielen oder zu stoppen. Ebenfalls können Effekte und Lautstärke bearbeitet werden.
​
##### Kostenlose Sounds
​
Auf diesen Seiten findet ihr kostenlose Sounds. Bitte vergesst nicht die Lizenzen und Urheber*innen anzugeben.
​
*   [http://www.bfxr.net/](http://www.bfxr.net/)
*   [https://www.freesound.org/](https://www.freesound.org)
​
##### Kostenlose Musik
​
Auf diesen Seiten findet ihr kostenlose Musik. Bitte vergesst nicht die Lizenzen und Urheber*innen anzugeben.
​
*   [http://soundbible.com/](http://soundbible.com)
*   [http://incompetech.com/music/royalty-free/](http://incompetech.com/music/royalty-free/)
​
##### Klangblöcke
​
*   `spiele Klang () ganz`: Spielt den Klang () ganz ab, bevor der nächste Block drankommt.
*   `spiele Klang ()`: Spielt einige Millisekunden eines Klangs () ab und geht dann zum nächsten Block.
*   `stoppe alle Klänge`: Stoppt global alle Klänge, die wiedergegeben werden.
*   `ändere Effekt [] um ()`: Ermöglicht das Verändern der Tonhöhe sowie der Balance. Die Balance bestimmt, ob Klänge mehr über den linken oder rechten Lautsprecher ausgegeben werden. Der Block kann mehrfach aufgerufen und die Höhe oder Balance um den angebebenen Wert verändert werden.
*   `setze Effekt [] auf ()`: Ermöglicht das Verändern der Tonhöhe sowie der Balance. Die Balance bestimmt, ob Klänge mehr über den linken oder rechten Lautsprecher ausgegeben werden. Der Block setzt die Höhe oder Balance auf einen bestimmten Wert. Ein mehrfaches Aufrufen des Blockes hintereinander ist somit effektlos.
*   `schalte Klangeffekte aus`: Löscht alle derzeit vorhandenen Klänge. Die aktuelle Wiedergabe wird jedoch nicht unterbrochen.
*   `ändere Lautstärke um ()`: Ändere die Lautsärke um den angegebenen Wert.
*   `setze Lautstärke auf ()%`: Setze die Lautstärke auf den angebenen Wert.
*   `Lautstärke`: In dieser Variable ist die aktuelle Lautstärke gespeichert.
​
#### Übungsaufgaben
​
##### 1\. Hello World
​
*   Wenn auf die Fahne geklickt wird, soll die Katze "Hello World!" sagen. Du kannst in allen Aufgaben auch eine andere Figur als die Katze auswählen.
​
##### 2\. Größenveränderungen
​
*   Ändere die Größe der Katze um eine "Zufallszahl" zwischen "-50" und "50", wenn diese angeklickt wird.
​
##### 3\. Erste Schritte
​
*   Lasse die Katze um eine feste Schrittzahl in die Richtung laufen, deren Pfeil gedrückt wird. Bei dem Pfeil nach unten läuft sie so um beispielweise -12 Schritte in y-Richtung.
​
##### 4\. Springen
​
*   Wenn auf die Fahne geklickt wird, soll die Katze anfangen, sich zu bewegen: Jedes Mal, wenn die Leertaste gedrückt wird, soll sie ihren y-Wert um "10" ändern. Andernfalls soll sie den y-Wert um "-5" verändern.
​
##### 5\. Springen 2.0
​
*   Verändere die Aufgabe "Springen" so, dass der y-Wert, sobald er kleiner oder gleich 0 ist, nicht mehr um -5 verringert wird.
​
##### 6\. Variablen
*   Setze eine Variable mit Namen Begrüßung auf deinen Namen. Lasse die Katze den Inhalt der Variablen "Begrüßung" sagen.
​
##### 7\. Fragen
​
*   Wenn die Fahne angeklickt wird, soll eine Variable "Richtige Antwort" auf "INNOQ" gesetzt werden. Dannach soll die Frage "Bei welcher Firma bist du heute?" gestellt werden und auf die Antwort gewartet. Wenn die eingegebene "Antwort" nicht der "richtigen Antwort" entspricht, soll die Frage "wiederholt" werden.
​
##### 8\. Gegen die Wand
​
*   Setze die Katze beim Drücken der grünen Flagge auf den Startwert x = -150. Die Katze soll nun beim Drücken der rechten Pfeiltaste nach rechts laufen. Wenn ihr x-Wert dabei größer als "150" ist, sendest du eine Nachricht "Wand!" an alle. Denn dein Programm kann aus mehreren Programmteilen bestehen, die über Nachrichten miteinander kommunizieren können: Ein Programmteil sendet eine Nachricht aus, die von allen anderen Programmteilen empfangen werden kann. Wird die Nachricht "Wand!" empfangen, setzt du den x-Wert der Katze wieder auf "-150".
​
##### 9\. Ton ab
​
*   Verändere die Aufgabe "Gegen die Wand" so, dass jedes Mal, wenn die Nachricht "Wand!" emfangen wird, ein Klang abgespielt wird. Bei jeder "Wand!"-Nachricht soll zudem der Effekt "Höhe" um "10" erhöht werden.
​
##### 10\. Auf die Figur, fertig, los!
​
*   Wenn die Fahne geklickt wird, soll "20" mal Folgendes passieren: Die Katze soll "1" Sekunde zu einer zufälligen Position gleiten (dafür gibt es einen extra Code-Block). Falls ihre x-Position dabei größer als 150 oder kleiner als -150 bzw. ihre y-Position größer als 100 oder kleiner als -100 ist, soll ein Klon von "mir selbst", also der Katze, erstellt werden. Des Weiteren soll der Effekt "Farbe" um "15" geändert werden.
*   Wenn ein Klon entsteht (auch dafür gibt es einen Code-Block), soll genau dasselbe passieren. Nur soll dies nicht "20" mal wiederholt werden.
​
##### 11\. Malen
​
*   Füge den Blockkategorien die Erweiterung "Malstift" hinzu (zu finden bei den Skripten bzw. in der linken Leiste).
*   Wenn auf die Fahne geklickt wird, sollen alle gemalten Linien gelöscht werden.
*   Wenn auf die Fahne geklickt wird, sollen fortlaufend "Abdrücke" der Katze erstellt werden. Die Katze selbst soll sich immer zu dem Mauszeiger drehen und x Schritte laufen, also Richtung Mauszeiger laufen. Vom Rand soll die Katze abprallen.
*   Lasse die Katze sich immer nach rechts um eine "Zufallszahl" z drehen und ändere die Farbe der Katze währenddessen ebenfalls um z.
​
##### 12\. Fangen
​
*   Verändere die Aufgabe "Erste Schritte" so, dass du zwei Figuren in der Szene hast, z.B. zusätzlich zu der Katze noch einen Fisch. Der Fisch soll, wenn die grüne Fahne angeklickt wird, wiederholt in "3" Sekunden zu "Zufallsposition" gleiten. Wird er dabei von der Katze berührt, soll eine Nachricht "Gefangen" an alle gesendet werden. Wird die Nachricht "Gefangen" empfangen, sollen alle anderen Skripte des Fisch stoppen und er soll für "2" Sekunden "Du hast mich" sagen.
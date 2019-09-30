#### Steuerung

##### Du gibst den Takt an! ![emoji_coolio](../../img/emoji_coolio.png#thumbnail)

Ein Programm wird von **oben nach unten, Zeile für Zeile** von deinem Computer gelesen und ausgeführt. Der Inhalt dieser Zeilen wird auch _"Anweisung"_ genannt.

Dabei musst du bestimmen, in welcher sinnvollen _Reihenfolge_ der Computer deine Anweisungen ausführen soll.  
Beim Programmieren gibt es dafür spezielle Steuerbausteine, mit denen du so einen geordneten Ablauf ausdrücken kannst.  
Außerdem kannst du mit diesen Bausteinen auch bestimmen, _wie oft_ ein geordneter Ablauf ausgeführt werden soll oder sogar _wann_!

Schritt für Schritt ist hier das Motto!

##### Ereignisse

Mit deinem Scratch-Programm gibst du deinem Computer also Anweisungen, was er in welcher Reihenfolge tun soll. Du musst ihm aber auch sagen, _wann_ er starten soll, dein Programm auszuführen (so nennt man das). Dazu gibt es die _Ereignisse_. Wenn es ein Startsignal gibt, beginnt der Computer, den nachfolgenden Programmteil auszuführen. Das Startsignal kann zum Beispiel sein, dass eine Taste gedrückt wird. Wenn du dir die Ereignisblöcke in Scratch anschaust, bemerkst du sicher, dass sie ein bisschen anders aussehen, weil es eben die Startblöcke sind.

##### Schritte wiederholen

Beim Programmieren möchte man oft Verarbeitungschritte öfter als nur einmal ausführen lassen, ohne denselben Code mehrmals zu schreiben. Dafür gibt es in Scratch den Baustein _"Wiederholung"_. Wiederholungen werden allgmein auch Schleifen genannt.

Mit Wiederholungen kann man genau das tun, was der Name vermuten lässt: Einen Codeabschnitt _mehrmals_ ausführen lassen.

##### Aber wie oft?

Manchmal weiß man das zu Beginn noch nicht genau, wenn man mit dem Programmieren erst neu angefangen hat. Die einfachste Wiederholung, die du ausprobieren kannst, ist die endlose Wiederholung. In Scratch heißt dieser Baustein: _"wiederhole fortlaufend"_. Diese Wiederholung findet also so lange statt, bis du das Programm abbrichst.

Eine andere Variante ist _"wiederhole x-mal"_. Dabei gibst du dem Baustein also eine Zusatzinformation: Die Anzahl der Wiederholungen (x), die ausgeführt werden sollen. Die Schleife "weiß dann von selbst", wann sie fertig ist, ohne dass das Programm manuell gestoppt oder abgebrochen werden muss. Diese Art der Wiederholung ist besonders sinnvoll, wenn dein Programm nach der Schleife weiterlaufen und andere Dinge erledigen soll.

Vielleicht soll dein Programm sogar die Ergebnisse aus einer Schleife in nachfolgenden Verarbeitungsschritten weiter nutzen können?

##### Wie sagst du der Schleife, was sie wiederholen soll?

Das ist ganz leicht: Du ziehst den zu wiederholenden Codeabschnitt in die Schleife hinein, sodass sie den Codeabschnitt umschließt. Man nennt den von einer Wiederholung umschlossenen Code auch den "Schleifenkörper". Du kannst beliebig viele Codeteile in eine Schleife einpacken. Du kannst sogar Schleifen in Schleifen packen! Dies nennt man auch "Verschachtelung".

##### Unterschiedlich reagieren

Ein Programm, egal wie groß oder klein, braucht die Möglichkeit, auf unterschiedliche Situationen unterschiedlich zu reagieren. Dazu muss es _Entscheidungen treffen_. Aber wie?

###### Wenn...dann

Dafür gibt es in Scratch den Baustein:

*   _**"falls.., dann"**_

Man nennt diese Konstruktion auch "Fallunterscheidung". Dabei gibst du dem Baustein eine Zusatzinformation: _**eine Bedingung**_.

*   Wenn die Bedingung eintritt, wird der Codeabschnitt ausgeführt, den dieser Baustein umschließt.
*   Wenn die Bedingung nicht eintritt, wird der Codeabschnitt übersprungen.

Da ein Programm von oben nach unten abgearbeitet wird, kannst du beliebig viele Fallunterscheidungen hintereinander durchführen lassen, um mehrere Bedingungen zu testen und daraufhin dein Programm unterschiedlich reagieren zu lassen. Wenn keine zutrifft, werden alle übersprungen.

Mehrere Fallunterscheidungen zu machen wird auch "Verzweigung" genannt. Dabei stellt man sich die Äste eines Baums vor, die in unterschiedliche Richtungen führen können, wenn man sie mit dem Finger nachzeichnet. Vielleicht hilft es dir auch, wenn du dir vorstellst, dass du deinem Programm die "Spielregeln" klar machst.

##### Wie du eine Bedingung formulierst

Eine Bedingung ist eine Aussage, die mit _**"wahr"**_ oder _**"falsch"**_ beantwortet werden kann. Solche Aussagen sind meistens sehr kurze und simple Sätze.

Dazu benötigst du einen Hilfsbaustein: _**Operatoren**_. Keine Bange, dabei handelt es sich nur um Vergleiche, die dein Programm verstehen und auswerten kann. Du wirst bestimmt merken, dass du die meisten Operatoren sogar schon kennst!

Hier sind zwei Beispiele für Bedingungen mit Operatoren:

*   farbe = blau
*   hund1 > hund2

Die Operatoren sind also die _"Zeichen zwischen den Werten"_. Im ersten Beispiel ist der Operator das Gleichheitszeichen.  
Weißt du, wie der Operator im zweiten Beispiel heißt? Woher kennst du diese Zeichen?

##### Tipp: Deine Bedingung als Frage ![emoji-geek](../../img/emoji_geek.png#thumbnail)

Gedanklich kannst du eine Bedingung für dich als Frage übersetzen:

_Ist der Wert in "farbe" blau?_  
_Ist die gedrückte Taste die gesuchte Taste?_

Sobald dein Progamm an dieser Stelle ankommt, prüft es die Aussage, d.h. es führt einen Wertevergleich mittels Operator durch. Kommt es zu dem Ergebnis "wahr", führt es den nachfolgenden Codeabschnitt aus.  
Es gibt noch eine erweiterte Variante dieses Bausteins:

*   _**falls..,dann. sonst:**_

Was passiert, wenn das Ergebnis des Vergleichs in einer Bedingung "falsch" ergibt und du so einen Baustein verwendest? Probiere es aus und schau, wie dein Programm an der Stelle verläuft.

##### Wo hat die Bedingung ihren Platz?

Damit die Bedingung ihren Zweck erfüllen kann, muss sie _am Anfang_ stehen und wird in das Feld nach dem _**"wenn"**_ eingetragen.  
Wenn du Vergleiche auswählst, achte dabei auf die eckige Form des Bedingungs-Feldes in deinem Steuerbaustein - du kannst nur *passende Elemente aus der Kategorie "Operatoren" hineinziehen.

Bedingungen kann man sogar kombinieren. Darüber erfährst du etwas im nächsten Absatz. Vorher solltest du die besprochenen Steuerbausteine in Scratch praktisch nachvollziehen, denn Programmieren bedeutet auch Dinge auszuprobieren und zu experimentieren. Steuerelemente werden in Scratch in orange hervorgehoben.

![steuerung.png](img/Steuerung.png)

##### Komplexere Entscheidungen

Manchmal muss man erst mehrere Informationen sammlen und auswerten, um eine Entscheidung treffen zu können.  
Deshalb kannst du deinem Programm mitteilen, dass mehrere Bedingungen gleichzeitig "wahr" sein müssen, um zu entscheiden, ob ein Codeabschnitt ausgeführt wird. Das heißt, dein Programm muss mehrere Vergleiche durchführen, bevor es etwas tun darf. Dazu gibt es den Baustein _**"und"**_.

Zum Beispiel: "farbe = blau" _und_ "leertaste gedrückt".  
Gedanklich kannst du es so übersetzen: _Ist der Wert von "farbe" blau und ist **gleichzeitig** die Leertaste gedrückt?_ Gleichzeitig ist hierbei sehr wichtig!

Wie entscheidet dein Programm, wenn du den Baustein "nicht" oder "oder" benutzt? Probier' es aus!

##### Puh, Gedankenchaos? ![emoji_whaat](../../img/emoji_whaat.png#thumbnail)

Wenn du dir nicht sicher bist, wie dein Programm an einer kniffeligen Stelle verlaufen soll, hilft es Stift und Papier zur Hand zu nehmen und zu visualisieren.  
Mit einem Diagramm kannst du deine Gedanken ordnen und erst einmal zeichnerisch Ideen ausprobieren. Dabei soll das vorgestellte Flussdiagramm ein Vorschlag sein:

![flussdiagramm sollte hier zu sehen sein](img/flussdiagramm.png)

An jeder Verzweigung _(Rautenform)_ stellst du gedanklich deine Frage. Dann formulierst du sie als Bedingung für dein Programm um. Nutze dafür die Operatoren.  
Anschließend überlegst du dir, was passieren soll _(Rechteck)_, wenn die Frage mit "wahr" bzw. "ja" beantwortet wird.  
Dann überlegst du dir, was passieren soll, wenn sie mit "falsch" bzw. "nein" beantwortet wird.  
Die möglichen Wege für deinen Programmfluss zeichnest du als Zweig _(Pfeil)_.  
So kannst du dir deinen eigenen "Fahrplan" skizzieren.

Dein Diagramm muss nicht "formal richtig" sein! Du kannst es so verändern, wie es für dich am besten funktioniert.

##### Mit Verzögerung reagieren

Zur Erinnerung: ein Programm wird von oben nach unten, Zeile für Zeile abgearbeitet. Es hat keinen Grund, Teile zu überspringen oder an einer Stelle absichtlich auf etwas zu warten, es sei denn du sagst es ihm.  
Man spricht auch davon, dass das Programm "pausiert". Wenn ein Program "hängt" ist das hingegen ein anderes Warten, als das, wovon hier die Rede ist, das ist dann ein nicht gewolltes Warten. Wann könnte es von Nutzen sein, dass ein Programm an einer Stelle pausiert, bevor es den nächsten Schritt ausführt?

##### Wie lange warten?

In Scratch hast du zwei Möglichkeiten eine Pause einzubauen. Die einfachste Pause, die du ausprobieren kannst, ist die mit einer festen Wartezeit. Dazu bietet dir Scratch den Baustein _"warte x Sekunden"_ an. Als Zusatzinformation gibst du eine Zahl (x) als Wartezeit ein. So garantierst du, dass an einer bestimmten Stelle in deinem Programm **immer** pausiert wird und die Pause **immer die gleiche Dauer** hat. Oft weiß man zu Beginn noch nicht genau, wie lang eine Pause sein muss. Probiere verschiedene Werte aus!

##### Flexiblere Pausen ...

Manchmal muss die Pause etwas länger oder etwas kürzer sein und man findet einfach keinen Wert, der passt! Du hast die Möglichkeit _"passgenaue"_ Pausen zu bestimmen. In Scratch heißt dieser Baustein _"warte bis"_. Zum Beispiel kannst du so lange warten, bis ein bestimmtes Ereignis stattgefunden hat. Dazu brauchst du etwas, das du schon kennen gelernt hast: **Die Bedingung**.  
Anstelle einer Wartezeit bestimmst du nun also eine _**"Wartebedingung"**_.

Mit deinem Wissen über Bedingungen, Operatoren und Ereignisse kannst du nun verschiedene Wartebedingungen ausprobieren. Falls es dir noch schwer fällt, versuche, dein Problem als [Flussdiagramm](handbook.html#9) auf Papier aufzumalen oder frag die Mentoren und Mentorinnen .

##### Klone ![clone.png](img/clone.png#thumbnail)

Oft leiht man sich Begriffe und Ideen aus anderen Wissenschaften, um Mechanismen oder Programmierkonzepte anschaulicher zu bennen. Hier bedient man sich der Idee des "Klonens" aus der Biologie. Sicher hast du schon einmal davon gehört: Ein Klon ist eine Kopie eines Lebewesens. Dieses Lebewesen ist aus exakt den gleichen Informationen wie das Original aufgebaut.

Diese Idee lässt sich übertragen: In Scratch kannst du mehrere Lebewesen vom gleichen "Bauplan" zum Leben erwecken und sie individuell steuern. Der Bauplan könnte z.B. eine Grafik oder ein Lebewesen sein, das bereits existiert.  
Der Vorteil liegt darin, dass dein Computer nur einmal den Bauplan "laden" muss. Man nennt einen grafischen Bauplan auch "Spritesheet". "Sprite" ist einfach die englische Bezeichnung für eine Figur; ein "Spritesheet" ist also einfach eine Blatt, auf dem die Beschreibung für die Figur steht.

Um einen Klon zu erzeugen wählst du den Baustein _"erzeuge Klon von"_ und gibst als Zusatzinformation deinen Bauplan mit. Mit dem Baustein _"wenn ich als Klon entstehe"_ kannst du der Kopie direkt sagen, wie sie sich verhalten soll, sobald sie auf dem Bildschirm erscheint. So weiß ein Klon direkt, was es zu tun hat. Übrigens wird nicht nur das grafische Aussehen eines Originals kopiert, sondern auch seine Fähigkeiten, wie z.B. laufen oder springen. Diese Fähigkeiten nennt man auch "Scripte".

Denke daran, dass dein Computer begrenzte Ressourcen hat. Was passiert, wenn du immer mehr Klone erstellst? Dieses Problem müssen z.B. auch Spieleentwicklerinnen berücksichtigen. Welchen Baustein könntest du nutzen, um die Menge der Klone unter Kontrolle zu halten?

##### Weiteres

###### Variablen

Variablen sind Platzhalter für Werte. Sie bestehen aus einem Namen und einem Wert. Mit diesem Namen könnt ihr dann arbeiten, als würdet ihr den Wert benutzen. Ihr könnt also damit rechnen, wenn es eine Zahl ist, oder die Variable in [Bedingungen](handbook.html#Bedingungen) abfragen. Auch Variablen kennt ihr wahrscheinlich schon aus dem Matheunterricht, da heißt die Variable meistens x. Variablen sind praktisch, wenn ihr einen Wert an verschiedenen Stellen benutzen möchtet oder wenn ihr euch Werte merken möchtet. Ihr könntet zum Beispiel zählen wollen, wie oft eine [Schleife](handbook.html#7) sich wiederholt und dazu eine Variable _zaehler_ erstellen, die jedes mal um 1 erhöht wird. Am besten gibt man Variablen einen Namen, der ausdrückt, wofür die Variable steht, also zum Beispiel _zaehler_ und nicht _tannenbaum_.

###### Weitere Bausteine

Ein paar Bausteine haben wir nicht im Detail besprochen, das macht aber nichts. Du musst **nicht** erst alles verstanden haben, bevor du anfangen kannst. Probiere aus, was passiert, wenn du z.B. _"stoppe"_ auswählst. Wenn du es genauer wissen willst, lohnt sich ein Blick in die [Dokumentation](https://scratch-dach.info/wiki/Blockfarbe_gelb_%3D_Steuerungs-Bl%C3%B6cke).

#### DIY Piano ![emoji-geek](../../img/emoji_geek.png#thumbnail)

Heute werdet ihr ein gezeichnetes Piano mittels Makey Makey und Scratch in ein funktionsfähiges Musikinstrument verwandeln!

##### Zutaten:

*   Papier und Bleistift für das Tastenfeld
*   12 Krokodilklemmen und Vebindungsdrähte
*   eine Makey Makey Platine
*   eine USB Verbindung zwischen eurem Computer und dem Makey Makey
*   die passenden Steuerungsbausteine im Scratch Editor
*   Pianotöne

##### 1.Das Tastenfeld

Damit ihr das Piano nachher auch spielen könnt, braucht ihr natürlich auch eine Möglichkeit eure Finger zu platzieren. In der Softwareentwicklung spricht man dabei auch vom "Human Interface" oder der "Mensch und Computer Interaktion". Euer Tastenfeld zeichnet ihr mit dem Bleistift aufs Papier. Anders als bei einem echten Piano, wo die Tasten dicht nebeneinander liegen, müsst ihr bei dem DIY Piano darauf achten, dass sich die Konturen eurer ausgemalten Tasten **nicht** berühren. Lasst also etwas Platz zwischen den einzelenen Tasten. Ein echtes Piano hat außerdem weiße und schwarze Tasten, da ihr aber mit Bleistift zeichnet, werden beim DIY Piano alle Tasten schwarz sein.

Insgesamt gibt es 7 Ganztöne (C bis B) und 5 Halbtöne (C# bis A#).  
Zur Hilfe gibt es hier eine Übersicht :

![pianoschema sollte hier zu sehen sein](img/simplifyingtheory.png)

##### 2\. Die Krokodilklemmen

An jede Taste des Tastenfeldes wird nun ein Ende einer Krokodilklemme geklemmt. Welches Ende du nimmst, ist egal.

##### 3\. Der Makey Makey

Das andere Ende der Krokodilklemme wird nun an bestimmten Stellen der Platine geklemmt. Wir nutzen dabei die Verbindungstellen für die Tasten **W, A, S, D, F, G, die Pfeiltasten** die **Leertaste** und die **Mouse**. Wenn ihr euch den Makey Makey genau anseht, werdet ihr diese Stellen finden und bemerken, dass sie unterschiedlich verbunden werden müssen. An einige dieser Stellen könnt ihr die Krokodilklemme direkt anschließen. Bei anderen müsst ihr euch eine "Brücke" überlegen. Schaut euch dazu eure restlichen Materialien noch einmal genauer an.

##### 4\. Die USB Verbindung

Bisher habt ihr Folgendes erreicht: Die Klemmen sind das Verbindungsstück zwischen jeder Pianotaste mit dem Makey Makey. Nun fehlt noch die Verbindung des Makey Makey an den Computer. Das geht ganz leicht über den USB-Anschluss. Sobald der Computer den Makey Makey registriert hat, kann er Eingabesignale an euren Computer senden. Die Eingabesignale entstehen, wenn ihr eine gezeichnete Pianotaste berührt.

##### 5\. Die Steuerung

Der Makey Makey kann nun Eingabesignale senden, aber was soll der Computer damit anfangen? Wie soll er auf welche Eingabe reagieren?

Genau das könnt ihr nun mit Scratch festlegen. Dazu müsst ihr euch die Verbindungen zwischen den einzelnen Pianotasten und den Makey Makey Verbindungspunkten anschauen. _Welche Pianotaste führt wo hin?_  
Am besten schreibt ihr euch eine Übersicht auf Papier auf. Dann könnt ihr mit den Bausteinen in Scratch gezielt auf die Eingabe reagieren.

Ein Beispiel: Wenn die Pianotaste _**'C'**_ mit der Stelle _**'W'**_ am Makey Makey verbunden ist, dann sendet er 'W' an deinen Computer.

In deiner Übersicht könntest du dir z.B. merken: _C → W_.  
Gelesen: "Taste C sendet Signal W".

Mit Scratch kannst du nun gezielt steuern, was dein Computer tun soll, wenn ein 'W' als Eingabesignal ankommt. Bestimmt möchtest du, dass ein bestimmter Ton, nämlich der Ton C gespielt wird. Probiere aus, welche Bausteine dir dabei helfen könnten. Vielleicht fällt dir ein, in welcher Bausteinkategorie sie sich befinden könnten?

##### 6\. Die Töne

Die Töne für das Piano müsst ihr euch glücklicherweise nicht einzeln im Internet zusammensuchen, denn Scratch bietet euch eine ganze Sammlung verwendbarer Töne an. Dazu navigiert ihr _oberhalb des Editorfensters in den Tab "Klänge"_. _Unten links_ findet ihr ein kleines Laustprecher-Icon. Wenn ihr den Mauszeiger darüber legt, öffnet sich ein kurzes Menü. Mit einem Klick auf die _Lupe_ öffnet ihr die Klangsammmlung. Hier findet ihr alle Töne, die ihr braucht, mit Ausnahme der Halbtöne.

Wie könntet ihr diese in eurem Code trotzdem erzeugen?

Zur Hilfe könnt ihr euch hier anhören, wie sich ein durch euren Coden erzeugter Halbton anhören sollte: [Zum virtuellen Piano](http://virtualpiano.net)  
Achtet darauf, dass ihr als erstes herausfindet, auf welcher Taste des virtuellen Pianos euer C Ton liegt. Von dort aus interessieren euch die 5 folgenden Halbtöne (die schwarzen Tasten).

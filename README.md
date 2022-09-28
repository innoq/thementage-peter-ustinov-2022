# Thementage 2022 Monheim Handbuch

Dieses Repo beinhaltet das Hanbuch für den Thementag der Peter-Ustinov-Gesamtschule in Monheim am 30. September 2022.
An sich ist das Repo eine Kopie des Repositories für 2019, welches zur Veröffentlichung über Github Pages angelegt und angepasst wurde.


## Anleitung

### Texte
Zum Hinzufügen von Anleitungen fügt man die Texte als Markdown (.md) in den entsprechenden Ordner unter [`./src/main/resources/static/md/`](./src/main/resources/static/md/) ein.

### Bilder
Bilder können in [`./src/main/resources/static/img/`](./src/main/resources/static/img/) hinzugefügt werden.

### Neue Routes
1. Füge eine neue Controller-Methode in [`./src/main/java/INNOQ/Controllers/AppController.java`](./src/main/java/INNOQ/Controllers/AppController.java)
   hinzu.
2. Lege einen neuen Unterordner für die Texte an: `./src/main/resources/static/md/<new route>/`.
3. Verlinke die Seite im header template ([`./src/main/resources/templates/fragments/header.html`](./src/main/resources/templates/fragments/header.html)).
   Die route muss dort mit den strings in der Controller-Methode übereinstimmen.
4. Füge die route in [`./src/main/resources/static/js/script.js`](./src/main/resources/static/js/script.js) zu dem `routes` array hinzu (Zeile 8), damit
   das Inhaltsverzeichnis im Client automatisch generiert wird.

### Rendern
Die Markdown Dateien werden auf die Seite, die wie der Ordner, in die man die Datei gelegt hat, heißt, gerendert. Dabei werden mehrere Dateien alphabetisch hintereinander gehangen. 

**Achtung!** Überschriften tauchen nur in den Inhaltsverzeichnissen auf, wenn sie h3 (### Überschrift) oder h4 (#### Überschrift) sind.


### Static Page
Um eine statische Seite für GitHub Pages zu erzeugen, führe das bash script `./GenerateStaticWebsite.sh` aus.

**Achtung!** Dieses Script ersetzt den Ordner `./docs/` sofern dieser existiert. Alle Dateien in diesem werden ersetzt!

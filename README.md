# GirlsDay 2019 Monheim Handbuch

Dieses Repo beinhaltet das Hanbuch für den GirlsDay 2019 in Monheim. 


## Anleitung
### Texte
Zum Hinzufügen von Anleitungen fügt man die Texte als Markdown (.md) in den entsprechenden Ordner unter
_Girlsday_2019_Monheim/src/main/resources/static/md/_
ein. 

### Bilder
Bilder können in 
_Girlsday_2019_Monheim/src/main/resources/static/img/_
hinzugefügt werden.

#### Rendern
Die Markdown Dateien werden auf die Seite, die wie der Ordner, in die man die Datei gelegt hat heißt, gerendert. Dabei werden mehrere Dateien alphabetisch hintereinander gehangen. 

**Achtung!** Überschrichten tauchen nur in den Inhaltsverzeichnissen auf, wenn sie h3 (### Überschricht) oder h4 (#### Überschricht) sind.


### Static Page
Um eine Statische Seite für GitHub Pages zu erzeugen, führe das bash script _GenerateStaticWebsite.sh_ aus: 
```
bash GenerateStaticWebsite.sh
```

**Achtung!** Dieses Script ersetzt den Ordner _docs_ sofern dieser existiert. Alle Dateien in diesem werden ersetzt! 
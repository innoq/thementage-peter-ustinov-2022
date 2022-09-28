*Direkt zum Glossar:*
[Bootstrap](#bootstrap) •
[CSS](#css) •
[Client](#client-und-server) •
[Express](#express) •
[GET](#request-und-response) •
[HTML](#html) •
[npm](#npm) •
[POST](#request-und-response) •
[Pug](#pug) •
[Redirect](#request-und-response) •
[Request](#request-und-response) •
[Response](#request-und-response) •
[Server](#client-und-server) •
[Template Engine](#pug)

### Node.js

*Node.js ist eine plattformübergreifende Open-Source-JavaScript-Laufzeitumgebung, die JavaScript-Code außerhalb eines
Webbrowsers ausführen kann. Damit kann zum Beispiel ein Webserver betrieben werden. Node.js wird in der
JavaScript-Laufzeitumgebung V8 ausgeführt, die ursprünglich für Google Chrome entwickelt wurde, und bietet eine
ressourcensparende Architektur, die eine besonders große Anzahl gleichzeitig bestehender Netzwerkverbindungen
ermöglicht. (Quelle: [Wikipedia](https://de.wikipedia.org/wiki/Node.js)).*

Ok, was bedeutet das?

**JavaScript** ist eine Programmiersprache, die ursprünglich nur dazu gedacht war, Webseiten dynamisch zu gestalten. Das
bedeutet, dass JavaScript anfangs nur in **Webbrowsern** funktionierte. Alle modernen Browser haben eine sogenannte
**JavaScript-Laufzeitumgebung** eingebaut, d.h. wenn eine Webseite eine JavaScript-Datei lädt, kann der Browser das
Programm verstehen und ausführen.

Weil sich in den letzten 20 Jahren das Internet wahnsinnig entwickelt hat und immer mehr zu einer der wichtigsten
Plattformen für Kommunikation und Handel geworden ist, ist auch JavaScript immer beliebter geworden. Die Sprache hat
sich seit ihren Anfängen als reine Skriptsprache bedeutend weiterentwickelt. Heute kann man, mit gewissen Abstrichen,
ganze Programme in JavaScript schreiben, die überall ausgeführt werden können, wo es eine Laufzeitumgebung für
JavaScript gibt. **Node.js** ist die wichtigste dieser Laufzeitumgebungen und unterstützt vor allem Programme, die sehr
viel über **Netzwerke** kommunizieren. Ideal für Webserver! Wenn ihr also selbst mal ein bisschen experimentieren wollt,
und eine Idee für eine kleine Webanwendung habt, dann ist Node.js die ideale Plattform dafür. Im technischen Teil des
Tages, heute Nachmittag, werden wir das mal ausprobieren.

#### Glossar

##### HTML
HTML (Hypertext Markup Language) ist eine Markup-Sprache.
Webseiten werden in HTML ausgeliefert. Webbrowser verstehen HTML und können es sinnvoll darstellen.
In a nutshell: Die Zeichenkette `"Ich möchte unbedingt programmieren lernen."` kann durch HTML
mit semantischer Bedeutung angereichert werden: `<p>Ich möchte <em>unbedingt</em> programmieren lernen.</p>`.
Hierbei umschließen die `<p>`-Tags einen Absatz (englisch *paragraph*, man spricht dann von einem Paragraph-Element),
und die `<em>`-Tags zeigen, dass das Wort "unbedingt" hervorgehoben werden soll
(englisch *emphasize* bedeutet "betonen").
Es gibt entsetzlich viele verschieden HTML-Elemente und dazugehörige Tags...
Man muss sie nicht alle kennen. Die wichtigsten werdet ihr wahrscheinlich heute zu Gesicht bekommen.
([Wikipedia](https://de.wikipedia.org/wiki/Hypertext_Markup_Language) •
[mdn](https://developer.mozilla.org/en-US/docs/Web/HTML?retiredLocale=de))

##### CSS
CSS (Cascading Style Sheet) ist neben JavaScript und HTML die dritte wichtige Sprache im Internet.
CSS wird benutzt, um das Aussehen von HTML-Elementen zu steuern.
([Wikipedia](https://de.wikipedia.org/wiki/Cascading_Style_Sheets) •
[mdn](https://developer.mozilla.org/en-US/docs/Web/CSS?retiredLocale=de))

##### Client und Server
**Server** bezeichnet zugleich ein Programm, das auf Anfrage Webseiten ausliefert,
und den Computer (die Hardware), auf dem dieses Programm läuft.
Wenn wir heute von Server sprechen, meinen wir das Programm, also unsere Node.js-App, die unseren Web-Shop steuert.
Analog dazu ist der **Client** ein Programm, das mit einem Server kommuniziert.
In unserem Fall sind das Webbrowser wie Firefox, Chrome, Edge und Safari.
([Wikipedia](https://de.wikipedia.org/wiki/Client-Server-Modell))

##### Request und Response
Ein Client (Webbrowser) kommuniziert mit dem Server über **Requests**:
Er sendet Anforderungen an den Server, die dieser mit einer **Response** (Antwort) beantwortet.
In den allermeisten Fällen spricht man von sogenannten HTTP-Requests.
**HTTP** steht für Hypertext Transfer Protocol.
Das ist eine Vereinbarung, die genau regelt, wie Requests und Responses auszusehen haben,
damit beliebige Programme miteinander kommunizieren können und sich verstehen.
Für uns sind zwei Arten von HTTP-Requests interessant:

- `GET`: Der Client fordert eine Resource an, z.B. eine Webseite oder eine Bilddatei.
- `POST`: Der Client sendet Daten an den Server, die dort eine Veränderung auslösen.

In beiden Fällen wird der Server mit einer Response antworten.
Diese kann entweder eine Resource enthalten, oder den Client dazu auffordern, eine andere Seite aufzurufen.
Das ist dann ein sogenannter **Redirect**.
([Wikipedia](https://de.wikipedia.org/wiki/Hypertext_Transfer_Protocol) •
[mdn](https://developer.mozilla.org/en-US/docs/Web/HTTP?retiredLocale=de))

##### Express
[Express.js](https://expressjs.com) ist eine Node.js-Bibliothek, die es ganz einfach macht, Webserver zu schreiben.
Tatsächlich ist Express so einfach und beliebt, und so weit verbreitet, dass es eine Art De-Facto-Standard geworden ist.
Ihr müsst nicht Express verwenden, aber es ist auf jeden Fall ein guter Ausgangspunkt. 

##### Bootstrap
[Bootstrap](https://getbootstrap.com) ist eine CSS-Bibliothek, die es ganz leicht macht,
das Aussehen einer Webseite einheitlich zu gestalten.
Bootstrap definiert zahlreiche CSS-Klassen,
mit denen das Aussehen und die Anordnung von HTML-Elementen gesteuert werden kann.
Es geht auch ohne... aber auch hier gilt: Mit Bootstrap macht man erstmal nichts verkehrt.
Insbesondere, wenn man
nicht viel Zeit hat.

##### Pug
HTML ist sehr nützlich, aber auch sehr unangenehm zu schreiben.
Insbesondere, wenn Webseiten dynamisch mit unterschiedlichen Inhalten gerendert werden,
können Programmierer unmöglich jede mögliche Ausprägung in HTML ausschreiben.
Zu diesem Zweck gibt es **Template-Sprachen**. Das sind sozusagen Vorstufen von HTML.
In einem Template-Dokument ist die Struktur der HTML-Seite festgelegt.
Bestimmte Teile des Dokuments können vom Server dynamisch mit Inhalt gefüllt werden.
Template-Sprachen sind oft sehr ähnlich wie HTML, manche sind sogar valides HTML mit einigen Erweiterungen.
Wir benutzen [Pug](https://pugjs.org), eine sehr einfache, übersichtliche Template-Sprache.

##### npm
`npm` steht für Node Package Manager.
Es bezeichnet sowohl ein Programm, das auf deinem lokalen Rechner JavaScript-Pakete für Node.js verwaltet,
als auch die [npm Package Registry im Internet](https://npmjs.com), wo sehr, sehr viele Node.js-Bibliotheken
zur Verfügung gestellt werden.
Express und Pug sind beispielsweise solche Bibliotheken, die wir in unsere Anwendung einbinden. 
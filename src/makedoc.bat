@echo off
color a
set /p name=Entrez le chemin relatif du projet (le chemin du projet à partir du fichier.bat jusqu'au dossier src compris) : 
javadoc -protected -package -private -sourcepath "%name%" -d ./doc -group "" "" "EButton" "EventHandler" "Event" "Event.Parameters" "Window" "Main" -encoding utf8 -author -linksource
start "" "file:///%cd%/doc/index.html"
::^Made by Emmanuel Lion
@echo off
color a
set /p name=Entrez le chemin relatif du projet (le chemin du projet a partir du fichier.bat jusqu'au dossier 'src' comprit) :
javadoc -protected -package -private -sourcepath "%name%" -d ./doc -group "" "" "EButton" "EventHandler" "Event" "Event.Parameters" "Window" "Main" -encoding utf8 -author -linksource
start "" "file:///%cd%/doc/index.html"
echo La documentation a ete generee a l'endroit ou vous avez place le script batch
pause
::^Made by Emmanuel Lion
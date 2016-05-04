# SIRES
Control de versiones 

# COMANDOS PARA LA UTILIZACIÓN DE GIT


## Iniciar Git en un proyecto
**``git init``**

## Agregar archivos al estado "stage"
	git add nombreDelAchivo
	git add '*.extensiónDelArchivo'
	git add -A		// agrega todos los archivos al "stage"

## Hacer un commit
	git commit -m "mensaje del commit"
	git commit -a -m "mensaje del commit"	// agrega archivos al "stage" area y realiza el commit
	git commit --amend			// modifica el nombre del último commit 

## Comprobar el estado de los archivos 
	git status
	git status -s		// muestra una descripción corta del mensaje

## Ver las modificaciones en cada commit
	git diff
	git diff --staged
	git diff rama1 rama2

## Remover archivos del repositorio 
	git rm nombreDelArchivo

## Ver los commit que se han realizado 
	git log
	git log --pretty=format:"%h - %an, %ar : %s"	// da formato en linea al mensaje
	git log --pretty=oneline			// da formato en linea corto al mensaje
	git log --pretty=format:"%h %s" --graph		// da formato al mesaje en forma de gráfica

## Quitar archivos 
	git reset nombreDelArchivo		// git deja de rastrear los cambios en el archivo
	git checkout -- nombreDelArchivo	// se restaura las modificaciones hechas en el ultimo commit
	git rm nombreDelArchivo			// remueve los archibos del proyecto

## Administrar ramas "branch"
	git branch			// ver ramas
	git branch nombreDeLaRama	// crea una nueva rama
	git checkout nombreDeLaRama	// selecciona una rama para trabajar
	git merge nombreDeLaRama	// agrega los cambios de otra rama
	git branch -d nombreDeLaRama	// elimina la rama


## Administrar un repositorio remoto
	git clone url			// copia los archivos del repositorio a un directorio local
	git remote add origin url	// sincroniza el repositorio remoto
	git remote remove origin	// desvincula el repositorio remoto
	git remote -v 			// muestra el estado de origin
	git pull origin HEAD		// descarga el contenido del repositorio remoto
	git push origin master		// subir el contenido al repositorio remoto

If you discover a security vulnerability within Laravel, please send an e-mail to Taylor Otwell at taylor@laravel.com. All security vulnerabilities will be promptly addressed.

## License

The Laravel framework is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

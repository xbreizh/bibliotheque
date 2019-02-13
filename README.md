Bibliotheque

Le projet est une proposition d'automatisation de procedures a destination d'une bibliotheque.
Il doit permettre la sauvegarde des details concernant les ouvrages, la creation de membres et la gestion des prets

Le projet est code en java avec une persistence dans une base de donnees postgresql.
La partie vue de l'application contient des elements javascript basiques

Le projet se compose de 3 parties:
	- webservice (troparo)
		web-service en soap connecte a une base de donnees PostgreSql
	- webapp (library)
		application a destination des emprunteurs et utilisant les ressources du webservice
	- batch mail (mail_app)
		application basee sur le web-service et permettant l'envoi de mails de maniere automatique
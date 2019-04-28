# CROZ PROJEKT
CROZ zadatak/projekt - osobni adresar kao Web aplikacija u klasicnim Javinim tehnologijama

Priloženi dijagram predstavlja generičku shemu u relacijskoj bazi podataka. Svaki kontakt ima adresu i spol, svaka adresa je vezana na šifarnik gradova, koji je vezan na šifarnik zemalja. Svi entiteti imaju surogatne (nametnute) primarne ključeve, kao i neke prirodne unique kolone.


Aplikacija mora podržavati pregled svih kontakta, unos novog, ažuriranje i brisanje postojećeg kontakta (zajedno s adresom), kao i pregled, unos, ažuriranje i brisanje iz šifarnika zemalja i gradova, koristeći bilo koji Web browser.

Potrebno je:

1. Odabrati relacijsku bazu i razvojnu okolinu za Javu.
2. Prema modelu podataka na slici napraviti tablice u bazi i popuniti ih nekim probnim podacima. Definirati neka obavezna polja po logici korištenja. U projektu priložititi skriptu u SQL-u za kreiranje strukture i inicijalnih podataka.
3. Odabrati aplikacijski poslužitelj za Web aplikacije u Javi (koji je i servlet container)
4. Napisati Java klase za pristup bazi podataka (Data Access sloj) koristeći JDBC. Te klase jedine pristupaju bazi: čitaju, pišu i brišu.
5. Napisati klase koje zaprimaju HTTP zahtjeve i šalju odgovore putem Java Servlet speficikacije (Web prezentacijski sloj).
6. Napisati JSP template za generiranje HTML stranica (tablica i formi) preko kojih korisnik može ostvariti traženu funkcionalnost. 
7. Prilikom unosa, ažuriranja i eventualno brisanja od drugdje referenciranih entiteta, treba provesti validaciju na prezentacijskom sloju. Ne ovisiti o provjerama na bazi, niti dozvoliti da korištenjem aplikacije baza dođe u nekonzistentno stanje.
8. Dokumentirati sučelje Data Access sloja i kontrolera/servleta na Web prezentacijskom sloju koristeći Javadoc.
9. Zapakirati aplikaciju kao WAR (uz WAR datoteku potrebno je poslati i source kod).
10. Sav kod treba biti pisan na engleskom jeziku (uključujući identifikatore i komentare), dobro organiziran, bez ponavljanja, formatiran prema uobičajnim standardima programiranja u Javi.
11. Po potrebi možete koristiti 3rd pary biblioteke, frameworke i alate, ako pridonose kvaliteti rješenja.
12. Funkcionalnost autentikacija i autorizacije u aplikaciji je potrebna. Napraviti role-based autorizaciju. Definirati potrebne tablice u bazi za odabrano rjesenje.
13. Programiranje na klijentskoj strani (JavaScript) nije nužno ali je plus.

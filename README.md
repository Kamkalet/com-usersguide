Podjęliśmy się stworzenia systemu informatycznego, jedną z jego podstawowych funkcjonalności jest
zarządzanie użytkownikami i grupami użytkowników i od niej zaczynamy implementację. Klient chce,
żeby system był dostępny przez przeglądarkę (standardowo używa Internet Explorera w wersji 11, ale nie
wyklucza, że niektórzy pracownicy będa korzystać z Chroma lub Firefoksa). System ma przechowywać
dane w bazie danych SQL lub NoSQL. Klient najchętniej widziałby architekturę, w której w przeglądarce
uruchamia klienta w javascript komunikującego się przez REST z serwerem implementującym logikę
biznesową i zarządzającym połączeniem z bazą, ale dopuszcza inne rozwiązania. W ramach
realizowanej usługi klient otrzyma źródła, dlatego wszystkie nazwy i komentarze powinny być po
angielsku. Klient nie nakłada żadnych ograniczeń jeżeli chodzi o użycie konkretnych frameworków,
bibliotek czy baz danych, proszę więc wybrać ulubione narzędzia.
Funkcjonalności
1. Zarządzanie użytkownikami

a. Lista użytkowników

b. Dodawanie użytkownika

c. Usuwanie użytkownika

d. Edycja użytkownika

2. Zarządzanie grupami użytkowników

a. Lista grup użytkowników

b. Dodawanie grupy użytkowników

c. Usuwanie grupy użytkowników

d. Edycja grupy użytkowników

Struktura danych

1. Użytkownik:

a. Nazwa

b. Hasło

c. Imię

d. Nazwisko

e. Data urodzenia

f. Lista grup użytkowników

2. Grupa użytkowników

a. Nazwa

b. Lista użytkowników

Aplikacja powinna umożliwiać edycję wszystkich powyższych własności, także list.


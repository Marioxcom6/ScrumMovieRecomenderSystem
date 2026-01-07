# Documentació del Projecte - Iteració 1

## 1. Constitució de l’equip i rols
En aquesta iteració hem definit els rols segons la metodologia **SCRUM** adaptada a DAM:

| Membre | Rols SCRUM | Responsabilitats |
| :--- | :--- | :--- |
| **Mario** | Scrum Master i Desenvolupador | Coordinació del grup, resolució de bloquejos, integració del codi, suport en disseny |
| **Prabin** | Product Owner i Desenvolupador | Definir requisits, prioritzar funcionalitats, gestió del projecte |
| **Nizam** | Desenvolupador i Documentador | Implementació de funcionalitats i redacció de documentació |
| **Valeria** | Desenvolupadora i Dissenyadora | Disseny del catàleg i desenvolupament de funcionalitats visuals |

---

## 2. Planificació de la Iteració 1
Durant aquesta iteració, l’equip ha planificat les següents tasques:

### Desenvolupament
* **UI amb 3 menús principals** (Responsable: Nizam)
  * Menú d’usuari
  * Menú de pel·lícules
  * Menú d’autenticació
* **Gestió d’usuaris (CRUD bàsic)** (Responsable: Prabin)
  * Afegir, eliminar, buscar i mostrar usuaris
  * Ús de `HashMap` per gestionar dades
* **Registre i Autenticació** (Responsable: Mario)
  * Validació de credencials
  * Control d’accés
* **Catàleg de pel·lícules** (Responsable: Valeria)
  * Afegir pel·lícules
  * Mostrar catàleg
  * Cerca bàsica

### Integració i Documentació
* **Integració del codi al repositori GitHub** (Responsable: Mario)
* **Documentació SCRUM** (Responsables: Nizam i Prabin)

### Presentació
* **Presentació final** (Responsables: Mario i Valeria)

---

## 3. Com es relaciona amb les RA’s
Aquest projecte està relacionat principalment amb:

* **RA3 – Ús d’estructures de dades**
  * Implementació de `HashMap` per gestionar usuaris i pel·lícules.
  * Clau = identificador de l’usuari.
  * Valor = contrasenya o objecte associat.
* **RA1 – Desenvolupament d’aplicacions bàsiques**
  * Divisió modular del codi i implementació de menús.
* **RA2 – Disseny de solucions**
  * Elecció d’estructures de dades adequades i planificació.
* **RA6 – Treball en equip i ús de control de versions**
  * Ús de GitHub per integrar i revisar el codi.

---

## 4. Decisions de disseny més importants
1. **Ús de HashMap com a estructura principal**: Permet una gestió ràpida i evita dependències externes inicials.
2. **Arquitectura modular**: Separació entre UI, gestió d’usuaris i catàleg per facilitar el manteniment.
3. **Interfície basada en menús**: Simplicitat i claredat adaptada als requisits de DAM.
4. **Integració contínua amb GitHub**: Control de versions i treball col·laboratiu.

---

## 5. Què podem millorar com a equip?

### Punts a millorar
* **Millorar la comunicació interna**: Evitar desalineaments en el progrés.
* **Planificació més detallada**: Definir millor les tasques per evitar confusions.
* **Revisions de codi més freqüents**: Millorar la fase d’integració.

### Punts positius
* Bona distribució de tasques.
* Ús correcte de GitHub.
* Capacitat de resoldre problemes tècnics de manera col·laborativa.

---

## 6. Ampliacions futures del projecte

### Millores tècniques
* Reestructurar el projecte utilitzant **POO**.
* Ordenar pel·lícules per criteris.
* Afegir més atributs (gènere, any, director).

### Noves funcionalitats
* Sistema de favorits.
* Persistència en fitxers `.txt` o base de dades.
* Implementar un recomanador de pel·lícules.

# First Android Example

Prima app Android con **Jetpack Compose**, usata come esempio didattico per prendere confidenza con la UI dichiarativa e la gestione dello stato.

## Cosa contiene

- **HomeScreen** — schermata principale con `Scaffold` + `TopAppBar`, che mostra un contatore.
- **CounterSection** — composable *stateless*: riceve il valore e la callback come parametri, così è riutilizzabile e testabile.
- **HomeScreen** fa da *stateful parent*: tiene lo stato `counter` con `remember { mutableStateOf(...) }` e lo passa al figlio.
- **DetailScreen** — segnaposto per una seconda schermata.
- **Theme** Material3 con preview (`@Preview`) per HomeScreen.

## Stack

- Kotlin
- Jetpack Compose + Material3
- Gradle (Kotlin DSL, version catalog)

## Build & run

```bash
# compilare
./gradlew assembleDebug

# test
./gradlew test
```

Oppure aprire il progetto in Android Studio ed eseguirlo su un device/emulatore.

# Patrón Builder - Sistema de Pizzas

## Descripción
Este proyecto implementa el **Patrón de Diseño Builder** en Java para gestionar la creación de pizzas con diferentes configuraciones de tamaño, tipo de masa e ingredientes.

El **Builder** permite construir objetos complejos paso a paso, separando la lógica de creación de la representación final.

## Estructura del Proyecto

```
PizzaBuilder/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       ├── Pizza.java
│   │   │       ├── PizzaBuilder.java
│   │   │       ├── BasicPizzaBuilder.java
│   │   │       ├── MestrePizzer.java
│   │   │       ├── Main.java
│── build.gradle
│── settings.gradle
```

### Clases Principales

1. **`Pizza`** → Producto final, representa una pizza con:
   - Tamaño (`size`)
   - Tipo de masa (`dough`)
   - Lista de ingredientes (`toppings`)

2. **`PizzaBuilder`** → Interfaz que define los pasos de construcción.
3. **`BasicPizzaBuilder`** → Implementa `PizzaBuilder`, permite construir una pizza personalizada.
4. **`MestrePizzer`** → Director que define recetas predefinidas.
5. **`Main`** → Punto de entrada, crea pizzas usando el Builder y el Director.

## Resultado Esperado

```
Hawaiian Pizza: Pizza {Tamaño='Mediana', Masa='Suave', Ingredientes=[Jamón, Piña]}
Vegetarian Pizza: Pizza {Tamaño='Grande', Masa='Integral', Ingredientes=[Champiñones, Pimientos, Aceitunas]}
```

## 🔥 Conclusión
Este proyecto demuestra el uso del **Patrón Builder** para construir objetos paso a paso. Separar la lógica de construcción en una interfaz (`PizzaBuilder`), un constructor (`BasicPizzaBuilder`) y un director (`MestrePizzer`) permite crear pizzas de forma flexible y modular.

---

## 🛠️ **Ejecutar el Proyecto**
### Opción 1: Desde IntelliJ IDEA
1. Abrir el proyecto en IntelliJ.
2. Ejecutar `Main.java`.

### Opción 2: Desde la Terminal con Gradle
```sh
gradle run
```

---

📌 **Este README sigue la misma estructura del ejercicio de Singleton que me pasaste.** 


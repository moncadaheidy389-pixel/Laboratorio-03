
## 🧩 Responsabilidades de las Clases

| Clase | Responsabilidad |
|---|---|
| **Movimiento** | Almacena tipo, monto y descripción de una operación. Atributos privados, solo lectura mediante métodos `get...()`. |
| **Billetera** | Encapsula el saldo, valida montos y disponibilidad, lleva contadores y acumulados, guarda el historial de movimientos. |
| **Main** | Gestiona la interacción con el usuario por consola: menú, entrada de datos y visualización de resultados. |
| **PruebaBilleteras** | Crea dos objetos `Billetera` distintos y verifica que sus saldos, historiales y contadores se mantienen independientes. |

## ✅ Requisitos Implementados
- ✅ **Atributos privados**: `titular`, `saldo`, `movimientos`, `contador`, `ingresosAceptados`, `gastosAceptados`, `totalIngresos`, `totalGastos`
- ✅ **Constructor**: Inicializa valores por defecto al crear cada billetera
- ✅ **Métodos públicos**: `getSaldo()`, `getTitular()`, `registrarIngreso()`, `registrarGasto()`, `mostrarMovimientos()`, etc.
- ✅ **Validaciones**: Monto mayor a cero, saldo suficiente para gastos, límite de capacidad del historial
- ✅ **Contadores**: Cuentan cuántos ingresos y gastos han sido aceptados
- ✅ **Acumulados**: Suma total de ingresos y gastos registrados
- ✅ **Independencia de objetos**: Dos billeteras no comparten datos, cada una mantiene su propio estado
- ✅ **Formato legible**: Números mostrados con separadores de miles y decimales

## 🔄 Transformación: De Procedural a Orientado a Objetos

| Etapa | Descripción |
|---|---|
| **Procedural** | Todo el código en un solo archivo. Variables sueltas para saldo, listas simples, sin estructura. |
| **Encapsulamiento** | Se crea la clase `Movimiento`. Los datos pasan a ser `private`, protegidos del acceso externo. |
| **Modularización** | Se separa la lógica en `Billetera`: valida, acumula y controla el historial. `Main` queda solo para la interacción. |
| **Independencia** | Cada objeto `Billetera` tiene su propio saldo, contadores e historial. No comparten información. |

## 🚀 Cómo Ejecutar
```bash
# Entrar a la carpeta del proyecto
cd MiBilleteraJava

# Compilar todos los archivos
javac *.java

# Ejecutar menú interactivo
java Main

# Ejecutar prueba de independencia de objetos
java PruebaBilleteras

feat: estructura inicial procedural con variables simples
refactor: crear clase Movimiento con atributos privados
refactor: encapsular lógica en Billetera con constructor y validaciones
feat: agregar contadores y acumulados de operaciones
feat: agregar PruebaBilleteras para verificar independencia de objetos
docs: agregar README con estructura, clases y explicación POO
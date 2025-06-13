 Cupcake App

Aplicación de ejemplo para pedir magdalenas (cupcakes) usando Jetpack Compose y navegación con NavHost.


Descripción

Cupcake es una app sencilla que permite a los usuarios seleccionar la cantidad, el sabor y la fecha de retiro de magdalenas. La navegación se realiza mediante Jetpack Compose Navigation, con un ViewModel que mantiene el estado del pedido.

Esta app está inspirada en la estructura y buenas prácticas del codelab oficial de Google "Lunch Tray", adaptada para un caso de uso distinto.



 Características

- Navegación declarativa con Jetpack Compose Navigation.
- Pantallas para seleccionar cantidad, sabor, fecha de retiro y resumen del pedido.
- Visualización dinámica del subtotal.
- Manejo del estado con ViewModel y StateFlow.
- Componentes UI reutilizables y diseño modular.

 Estructura del proyecto

- **MainActivity.kt**: Punto de entrada que inicializa la UI y el ViewModel.
- **CupcakeApp.kt**: Configura el NavHost y define las rutas de navegación.
- **StartOrderScreen.kt**: Pantalla para seleccionar la cantidad.
- **SelectOptionScreen.kt**: Pantalla genérica para elegir sabor o fecha.
- **OrderSummaryScreen.kt**: Muestra el resumen del pedido.
- **CupcakeAppBar.kt**: Barra superior con título y botón atrás.
- **FormattedPriceLabel.kt**: Componente para mostrar el precio formateado.
- **DataSource.kt**: Datos estáticos de cantidades y sabores.
- **OrderUiState.kt**: Clase de datos que representa el estado actual del pedido.
- **OrderViewModel.kt**: Lógica para actualizar el estado y calcular precios.



Contribuciones

Este proyecto es un ejemplo educativo. Si quieres contribuir, abre un issue o pull request.



 Licencia

Este proyecto es de código abierto y se puede utilizar libremente para fines educativos.


Créditos

Basado en el codelab oficial de Jetpack Compose Navigation (Lunch Tray) de Google Developers.



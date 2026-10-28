# Desarrollo de Aplicación Móvil con Componentes Avanzados en Android Studio

Aplicación móvil desarrollada en Android Studio enfocada en la integración de componentes gráficos modernos de interfaz de usuario sin conexión a bases de datos, utilizando datos estáticos y estructurados localmente mediante listas y adaptadores.

---

## ¿Qué contiene la aplicación? 

1. **ListView con Imágenes (Listas Personalizadas):**
   - Implementación de un componente `ListView` que muestra elementos dinámicos combinando texto descriptivo y recursos gráficos (*Drawables*) asociados en cada fila.
   
2. **Navegación por Pestañas (TabLayout / Tabs):**
   - Estructuración de la interfaz mediante un `TabLayout` que permite al usuario alternar de forma fluida entre diferentes secciones lógicas de la aplicación, asignando un componente visual único a cada pestaña.

3. **GridView (Cuadrícula Multimedia):**
   - Creación de una vista en cuadrícula (`GridView`) para organizar elementos en múltiples columnas, mostrando tarjetas visuales compuestas por imágenes y etiquetas de texto estáticas.

4. **Spinner (Selector Desplegable Dinámico):**
   - Integración de un menú desplegable (`Spinner`) que permite filtrar o cambiar el contenido mostrado en otros componentes de la interfaz (como el `ListView` o `GridView`) según la categoría seleccionada por el usuario.

5. **Entrada y Salida de Datos (`EditText` y `TextView`):**
   - Inclusión de un campo de texto interactivo para búsquedas o comentarios, conectado directamente a un `TextView` para reflejar resultados en tiempo real o procesar la información mediante navegación interna.

---

## ¿Cómo funciona su flujo de uso?

1. **Navegación Inicial por Pestañas:**
   - Al abrir la aplicación, el usuario se encuentra con un diseño estructurado en pestañas (`Tabs`). Puede deslizar la pantalla o tocar las pestañas superiores para navegar entre las secciones principales (ej. Explorar Listas, Ver Cuadrículas, Filtrar por Categorías).
   
2. **Filtrado y Visualización de Contenido:**
   - En la sección correspondiente, el usuario puede interactuar con el `Spinner` desplegable para seleccionar una categoría específica; automáticamente, los adaptadores internos actualizan los elementos mostrados en el `ListView` o `GridView` sin necesidad de consultas externas.
   
3. **Búsqueda y Mensajería Local:**
   - El usuario introduce términos en el `EditText` para buscar elementos dentro de las colecciones estáticas predefinidas, visualizando el resultado instantáneamente en el `TextView` o interactuando con los componentes visuales mediante datos simulados en memoria (arrays locales).

---

## ¿Qué tecnologías se usaron para esto?

- **Entorno de Desarrollo:** Android Studio
- **Lenguaje:** Java / Kotlin y XML para maquetación de interfaces.
- **Componentes de UI:** `ListView`, `GridView`, `TabLayout`, `ViewPager` / Fragments, `Spinner`, `EditText`, `TextView`, y `ImageView`.
- **Arquitectura de Datos:** Uso de arreglos estáticos locales (`ArrayList`, adaptadores personalizados `BaseAdapter` / `ArrayAdapter`) para la gestión de contenido sin bases de datos relacionales ni externas.

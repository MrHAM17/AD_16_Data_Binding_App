## AD_16_Data_Binding_App

### 📱 Short Description

Application introducing the **Android Data Binding Library** to integrate UI components with data sources using a declarative format, eliminating boilerplate code.

---

### 🧩 Concepts Covered

* **Data Binding Library** (Jetpack component)
* Enabling data binding using `buildFeatures { dataBinding = true }` in Gradle
* **`layout` tag** as the root element in XML
* **`data` element** and **`variable` tag** for declaring bindable data objects
* **Method References** for handling click events directly in XML
* **Two-Way Data Binding** (`@=` syntax)

---

### 🎯 Learning / Discovery Points

* Eliminating repetitive **`findViewById()`** calls.
* Understanding the automatic generation of the binding class (e.g., `ActivityMainBinding`).
* Binding a data object (`Person`) to the layout via the `setPerson` method on the binding object.
* Defining a separate **`ClickHandler` class** to manage UI events and linking it to the button's `onClick` attribute.
* Implementing bidirectional data flow between an Edit Text and a TextView using **Two-Way Binding**.

---

### ⚙️ App Features / Usage

* Displays data (e.g., person name) fetched directly from the data model.
* Button click triggers a method defined in a separate handler class.
* User input in an Edit Text automatically updates a related TextView in real-time (Two-Way Binding).

---

### 📝 Note

Data Binding increases developer productivity by making code shorter, simpler, more readable, and verifiable at compile time (type safety).

---

**Purpose:** Creational patterns are focused on object creation mechanisms, aiming
to optimize the creation process while ensuring flexibility.

**Goal:** They abstract the instantiation process to make systems more flexible and
reusable.

**Problem They Solve:** Prevent tight coupling between code and object creation logic,
simplifying the management of new object creation, especially in complex systems.

**Example:**
In a system where different types of documents (PDF, Word, Excel) are
created, instead of using new everywhere, a Factory Pattern can centralize
object creation.
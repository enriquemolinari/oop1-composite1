# Ejercicio Composite y Double Dispatch

La empresa “Laser X” posee los siguientes roles de empleados: directores, mandos medios y empleados regulares.
Todos tienen gente a su cargo, salvo los empleados regulares. Los directores tienen a su cargo mandos medios (no tienen
empleados regulares), los mandos medios tiene a su cargo empleados regulares (no pueden tener directores a cargo).

Dada la implementación, implemente la validación sobre quien puede tener a cargo de quien usando double dispatch.
INSERT INTO User VALUES (1, 'Alumno Avatar URL', 'testalumno@mail.com', 'Y', 'TestAlumno', 'testAlumno', 'ALUMNO');
INSERT INTO User VALUES (2, 'Visitante Avatar URL', 'testvisitante@mail.com', 'Y', 'TestVisitante', 'testVisitante', 'VISITANTE');
INSERT INTO User VALUES (3, 'Alumno No Habilitado Avatar URL', 'testAlumnoNoHabilitado@mail.com', 'N', 'TestAlumnoNoHabilitado', 'testAlumnoNoHabilitado', 'ALUMNO');
INSERT INTO User VALUES (4, 'Visitante No Habilitado Avatar URL', 'testVisitanteNoHabilitado@mail.com', 'N', 'TestVisitanteNoHabilitado', 'testVisitanteNoHabilitado', 'VISITANTE');

INSERT INTO Type VALUES (1, 'Pasta');
INSERT INTO Type VALUES (2, 'Hamburguesa');
INSERT INTO Type VALUES (3, 'Milanesa');
INSERT INTO Type VALUES (4, 'Pescado');
INSERT INTO Type VALUES (5, 'Sushi');

INSERT INTO Recipe VALUES (1, 'Rico pedazo de carne empanizado con jamón queso y tomate', 'Milanesa Napolitana', 1, 'Milanesa Napolitana Photo URL', 4, 3, 1);

INSERT INTO Unit VALUES (1, 'cm');
INSERT INTO Unit VALUES (2, 'm');
INSERT INTO Unit VALUES (3, 'ml');
INSERT INTO Unit VALUES (4, 'l');
INSERT INTO Unit VALUES (5, 'onz');
INSERT INTO Unit VALUES (6, 'cup');
INSERT INTO Unit VALUES (7, 'tsp');
INSERT INTO Unit VALUES (8, 'tbsp');
INSERT INTO Unit VALUES (9, 'g');
INSERT INTO Unit VALUES (10, 'kg');

INSERT INTO Ingredient VALUES (1, 'Pan Rallado');
INSERT INTO Ingredient VALUES (2, 'Carne');
INSERT INTO Ingredient VALUES (3, 'Huevo');
INSERT INTO Ingredient VALUES (4, 'Sal');
INSERT INTO Ingredient VALUES (5, 'Pimienta');
INSERT INTO Ingredient VALUES (6, 'Queso');
INSERT INTO Ingredient VALUES (7, 'Jamón');
INSERT INTO Ingredient VALUES (8, 'Tomate');

INSERT INTO Rating VALUES (1, 'Test Comment', 5, 1, 1)

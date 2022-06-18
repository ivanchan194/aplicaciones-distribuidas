INSERT INTO User (ID_USER, AVATAR_URL, EMAIL, ENABLED, NAME, NICKNAME, USER_TYPE) VALUES (1, 'Alumno Avatar URL', 'testAlumno@mail.com', 'Y', 'TestAlumno', 'testAlumnoNickname', 'ALUMNO');
INSERT INTO User (ID_USER, AVATAR_URL, EMAIL, ENABLED, NAME, NICKNAME, USER_TYPE) VALUES (2, 'Visitante Avatar URL', 'testVisitante@mail.com', 'Y', 'TestVisitante', 'testVisitanteNickname', 'VISITANTE');
INSERT INTO User (ID_USER, AVATAR_URL, EMAIL, ENABLED, NAME, NICKNAME, USER_TYPE) VALUES (3, 'Alumno No Habilitado Avatar URL', 'testAlumnoNoHabilitado@mail.com', 'N', 'TestAlumnoNoHabilitadoNickname', 'testAlumnoNoHabilitado', 'ALUMNO');
INSERT INTO User (ID_USER, AVATAR_URL, EMAIL, ENABLED, NAME, NICKNAME, USER_TYPE) VALUES (4, 'Visitante No Habilitado Avatar URL', 'testVisitanteNoHabilitado@mail.com', 'N', 'TestVisitanteNoHabilitadoNickname', 'testVisitanteNoHabilitado', 'VISITANTE');

INSERT INTO User_Details(USER_ID_USER, PASSWORD) VALUES (1, 'Password1');
INSERT INTO User_Details(USER_ID_USER, PASSWORD) VALUES (2, 'Password2');
INSERT INTO User_Details(USER_ID_USER, PASSWORD) VALUES (3, 'Password3');
INSERT INTO User_Details(USER_ID_USER, PASSWORD) VALUES (4, 'Password4');

INSERT INTO Type (ID_TYPE, DESCRIPTION) VALUES (1, 'Pasta');
INSERT INTO Type (ID_TYPE, DESCRIPTION) VALUES (2, 'Hamburguesa');
INSERT INTO Type (ID_TYPE, DESCRIPTION) VALUES (3, 'Milanesa');
INSERT INTO Type (ID_TYPE, DESCRIPTION) VALUES (4, 'Pescado');
INSERT INTO Type (ID_TYPE, DESCRIPTION) VALUES (5, 'Sushi');
INSERT INTO Type (ID_TYPE, DESCRIPTION) VALUES (6, 'Argentina');

INSERT INTO Recipe (ID_RECIPE, DESCRIPTION, NAME, NUMBER_PEOPLE, PHOTO_URL, PORTIONS, TYPE_ID_TYPE, USER_ID_USER) VALUES (1, 'Rico pedazo de carne empanizado con jamón queso y tomate', 'Milanesa Napolitana', 1, 'Milanesa Napolitana Photo URL', 4, 3, 1);
INSERT INTO Recipe (ID_RECIPE, DESCRIPTION, NAME, NUMBER_PEOPLE, PHOTO_URL, PORTIONS, TYPE_ID_TYPE, USER_ID_USER) VALUES (2, 'Coste barato, Hervido', 'Locro', 1, 'Locro Photo URL', 4, 6, 2);
INSERT INTO Recipe (ID_RECIPE, DESCRIPTION, NAME, NUMBER_PEOPLE, PHOTO_URL, PORTIONS, TYPE_ID_TYPE, USER_ID_USER) VALUES (3, 'Tiras de harina con salsa color verde', 'Pasta al Pesto', 1, 'Pasta al Pesto Photo URL', 4, 1, 1);

INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (1, 'cm');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (2, 'm');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (3, 'ml');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (4, 'l');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (5, 'onz');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (6, 'cup');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (7, 'tsp');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (8, 'tbsp');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (9, 'g');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (10, 'kg');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (11, 'unidad');
INSERT INTO Unit (ID_UNIT, DESCRIPTION) VALUES (12, 'cantidad necesaria');

INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (1, 'Pan Rallado');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (2, 'Carne');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (3, 'Huevo');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (4, 'Sal');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (5, 'Pimienta');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (6, 'Queso');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (7, 'Jamón');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (8, 'Tomate');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (9, 'Arvejas');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (10, 'Mandioca');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (11, 'Porotos');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (12, 'Cebolla de Verdeo');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (13, 'Cebolla');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (14, 'Puerro');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (15, 'Tallarín');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (16, 'Chorizo Colorado');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (17, 'Panceta');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (18, 'Maíz Blanco');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (19, 'Albahaca');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (20, 'Aceite de Oliva');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (21, 'Queso Rallado');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (22, 'Ajo');
INSERT INTO Ingredient (ID_INGREDIENT, NAME) VALUES (23, 'Calabaza');

INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (1, 'Test Comment 1', 5, 1, 1);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (2, 'Test Comment 2', 4, 1, 2);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (3, 'Test Comment 3', 3, 1, 3);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (4, 'Test Comment 4', 2, 1, 4);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (6, 'Test Comment 5', 1, 2, 1);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (7, 'Test Comment 6', 1, 2, 2);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (8, 'Test Comment 7', 2, 2, 3);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (9, 'Test Comment 8', 2, 2, 4);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (10, 'Test Comment 9', 3, 3, 1);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (11, 'Test Comment 10', 3, 3, 2);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (12, 'Test Comment 11', 4, 3, 3);
INSERT INTO Rating (ID_RATING, COMMENTS, RATING, RECIPE_ID_RECIPE, USER_ID_USER) VALUES (13, 'Test Comment 12', 4, 3, 4);

INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (1, 'Pan Rallado Observations', 500, 1, 1, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (2, 'Carne Observations', 2, 2, 1, 10);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (3, 'Huevo Observations', 4, 3, 1, 11);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (4, 'Sal Observations', 1, 4, 1, 12);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (5, 'Pimienta Observations', 1, 5, 1, 12);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (6, 'Queso Observations', 200, 6, 1, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (7, 'Jamón Observations', 200, 7, 1, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (8, 'Tomate Observations', 500, 8, 1, 9);

INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (9, 'Arvejas Observations', 200, 9, 2, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (10, 'Mandioca Observations', 1, 10, 2, 10);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (11, 'Porotos Observations', 500, 11, 2, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (12, 'Cebolla de Verdeo Observations', 2, 12, 2, 11);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (13, 'Cebolla Observations', 2, 13, 2, 11);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (14, 'Puerro Observations', 2, 14, 2, 11);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (15, 'Chorizo Colorado Observations', 4, 16, 2, 11);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (16, 'Panceta Observations', 500, 17, 2, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (17, 'Maíz Blanco Observations', 200, 18, 2, 9);

INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (18, 'Tallarín Observations', 500, 15, 3, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (19, 'Albahaca Observations', 50, 19, 3, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (20, 'Aceite de Oliva Observations', 120, 20, 3, 3);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (21, 'Queso Rallado Observations', 100, 21, 3, 9);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (22, 'Ajo Observations', 2, 22, 3, 11);
INSERT INTO Recipe_Ingredient (ID_RECIPE_INGREDIENT, OBSERVATIONS, QUANTITY, INGREDIENT_ID_INGREDIENT, RECIPE_ID_RECIPE, UNIT_ID_UNIT) VALUES (23, 'Calabaza Observations', 200, 23, 3, 9);

INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (1, 1, 'Paso Milanesa 1', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (2, 2, 'Paso Milanesa 2', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (3, 3, 'Paso Milanesa 3', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (4, 4, 'Paso Milanesa 4', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (5, 5, 'Paso Milanesa 5', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (6, 6, 'Paso Milanesa 6', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (7, 7, 'Paso Milanesa 7', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (8, 8, 'Paso Milanesa 8', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (9, 9, 'Paso Milanesa 9', 1);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (10, 1, 'Paso Locro 1', 2);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (11, 2, 'Paso Locro 2', 2);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (12, 3, 'Paso Locro 3', 2);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (13, 4, 'Paso Locro 4', 2);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (14, 5, 'Paso Locro 5', 2);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (15, 6, 'Paso Locro 6', 2);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (16, 1, 'Paso Pasta al Pesto 1', 3);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (17, 2, 'Paso Pasta al Pesto 2', 3);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (18, 3, 'Paso Pasta al Pesto 3', 3);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (19, 4, 'Paso Pasta al Pesto 4', 3);
INSERT INTO Step (ID_STEP, STEP_NUMBER, TEXT, RECIPE_ID_RECIPE) VALUES (20, 5, 'Paso Pasta al Pesto 5', 3);

INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (1, 'PHOTO', 'Milanesa Photo Content URL', 'jpg', 1);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (2, 'VIDEO', 'Milanesa Video Content URL', 'mp4', 3);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (3, 'AUDIO', 'Milanesa Audio Content URL', 'mp3', 5);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (4, 'PHOTO', 'Locro Photo Content URL', 'jpg', 11);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (5, 'VIDEO', 'Locro Video Content URL', 'mp4', 14);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (6, 'AUDIO', 'Locro Audio Content URL', 'mp3', 15);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (7, 'PHOTO', 'Pasta Photo Content URL', 'jpg', 17);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (8, 'VIDEO', 'Pasta Video Content URL', 'mp4', 18);
INSERT INTO MULTIMEDIA (ID_CONTENT, CONTENT_TYPE, CONTENT_URL, FILE_EXTENSION, STEP_ID_STEP) VALUES (9, 'AUDIO', 'Pasta Audio Content URL', 'mp3', 19);

INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (1, 'jpg', 'Milanesa Photo URL 1', 1);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (2, 'jpg', 'Milanesa Photo URL 2', 1);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (3, 'jpg', 'Milanesa Photo URL 3', 1);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (4, 'jpg', 'Locro Photo URL 1', 2);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (5, 'jpg', 'Locro Photo URL 2', 2);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (6, 'jpg', 'Locro Photo URL 3', 2);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (7, 'jpg', 'Locro Photo URL 4', 2);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (8, 'jpg', 'Pasta Photo URL 1', 3);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (9, 'jpg', 'Pasta Photo URL 2', 3);
INSERT INTO Photo (ID_PHOTO, FILE_EXTENSION, PHOTO_URL, RECIPE_ID_RECIPE) VALUES (10, 'jpg', 'Pasta Photo URL 3', 3);

INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (1, 1000, 10, 9);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (2, 0.001, 9, 10);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (3, 1000, 4, 3);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (4, 0.001, 3, 4);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (5, 100, 2, 1);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (6, 0.01, 1, 2);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (7, 33.814, 5, 4);
INSERT INTO Conversions (ID_CONVERSION, CONVERSION_FACTOR, DESTINATION_UNIT_ID_UNIT, ORIGIN_UNIT_ID_UNIT) VALUES (8, 0.02957, 4, 5);
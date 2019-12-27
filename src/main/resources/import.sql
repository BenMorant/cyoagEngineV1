/* Credentials */
INSERT INTO `credentials` (id, login, hashed_password, salt) values (NULL, "testLogin", "testHashPassword", "testSalt");

/* Weather */
INSERT INTO `weather` (id, kind, temperature, wind_level) values (NULL, "rainy", 12, 1);

/* Image */
INSERT INTO `image` (id, name, path) values (NULL, "image1", "path1");
INSERT INTO `image` (id, name, path) values (NULL, "image2", "path2");

/* Landscape */
INSERT INTO `landscape` (id, description, name) values (NULL, "landscapeDescription1", "landscapeName1");

/* map */
INSERT INTO `map` (id, description, name) values (NULL, "mapDescription1", "mapName1");

/* Place */
INSERT INTO `place` (id, description, name, x, y) values (NULL, "placeDescription1", "placeName1", 1.1, 1.1);

/* Map-Places associations */
INSERT INTO `map_places` (map_id, places_id) values (1, 1);

/* Time */
INSERT INTO `time` (id, day, hour) values (NULL, 1, 3);

/* User */
INSERT INTO `user` (user_type, id, last_name, first_name, profile_picture, email, credentials_id) values ("player", NULL, "testLastName", "testfirstName", "testprofilePicture", "testEmail@test", 1);

/* Game */
INSERT INTO `game` (id, name, player_id) values (NULL, "game1", 1);
INSERT INTO `game` (id, name, player_id) values (NULL, "game2", 1);

/* User(Player)-Games associations */
INSERT INTO `user_games` (player_id, games_id) values (1, 1);

/* People */
INSERT INTO `people` (people_type, id, description, experience_point, level, magic_point, name, strength) values ("hero", NULL, "Voici le plus grand héros de tous les temps", 10, 5, 7, "Loup Ardent", 5);

/* Inventory */
INSERT INTO `inventory` (id, people_id) values (NULL, 1);

/* Weapon */
INSERT INTO `weapon` (id, description, name, inventory_id, weapon_strength) values (NULL, "Ma foi c'est une belle épée", "Glaive", 1, 5);

/* Inventory-Weapons associations */
INSERT INTO `inventory_weapons` (inventory_id, weapons_id) values (1, 1);



/* People-images associations */
INSERT INTO `people_images` (people_id, images_id) values (1, 1);







/* Time */
INSERT INTO `time` (id, day, hour) values (NULL, 1, 3);

/* Weather */
INSERT INTO `weather` (id, kind, temperature, wind_level) values (NULL, "rainy", 12, 1);

/* map */
INSERT INTO `map` (id, description, name) values (NULL, "mapDescription1", "mapName1");

/* Region */
INSERT INTO `region` (id, description, name, x1, x2, y1, y2, map_id) values (NULL, "regionDescription1", "Mordor", 1.1, 1.6, 1.1, 1.6, 1);

/* Map-Regions associations */
INSERT INTO `map_regions` (map_id, regions_id) values (1, 1);

/* Place */
INSERT INTO `place` (id, description, name, x, y, region_id, weather_id) values (NULL, "placeDescription1", "placeName1", 1.2, 1.2, 1, 1);

/* Region-Places associations */
INSERT INTO `region_places` (region_id, places_id) values (1, 1);

/* Credentials */
INSERT INTO `credentials` (id, login, hashed_password, salt) values (NULL, "testLogin", "testHashPassword", "testSalt");

/* User */
INSERT INTO `user` (user_type, id, last_name, first_name, profile_picture, email, credentials_id) values ("player", NULL, "testLastName", "testfirstName", "testprofilePicture", "testEmail@test", 1);

/* Image */
INSERT INTO `image` (id, name, path) values (NULL, "image1", "path1");
INSERT INTO `image` (id, name, path) values (NULL, "image2", "path2");

/* Game */
INSERT INTO `game` (id, name, player_id) values (NULL, "game1", 1);
INSERT INTO `game` (id, name, player_id) values (NULL, "game2", 1);

/* User(Player)-Games associations */
INSERT INTO `user_games` (player_id, games_id) values (1, 1);

/* People */
INSERT INTO `people` (people_type, id, description, experience_point, level, magic_point, name, strength) values ("hero", NULL, "Voici le plus grand héros de tous les temps", 10, 5, 7, "Loup Ardent", 5);

/* Inventory */
INSERT INTO `inventory` (id, people_id) values (NULL, 1);
 
/* Object */
INSERT INTO `object` (object_type, id, description, name, inventory_id, weight, weapon_strength) values ("weapon", NULL, "Ma foi c'est une belle épée", "Glaive", 1, 8.6, 5);

/* Inventory-Objects associations */
INSERT INTO `inventory_objects` (inventory_id, objects_id) values (1, 1);

/* People-images associations */
INSERT INTO `people_images` (people_id, images_id) values (1, 1);







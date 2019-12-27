/* Credentials */
INSERT INTO `credentials` (id, login, hashed_password, salt) values (NULL, 'testLogin', 'testHashPassword', 'testSalt');

/* Game */
INSERT INTO `game` (id, name, player_id) values (NULL, 'game1', 1);
INSERT INTO `game` (id, name, player_id) values (NULL, 'game2', 1);

/* Image */
INSERT INTO `image` (id, name, player_id) values (NULL, 'image1', 'path1');

/* Inventory */
INSERT INTO `inventory` (id, people_id) values (NULL, 1);

/* Inventory-Weapons associations */
INSERT INTO `inventory_weapons` (inventory_id, weapons_id) values (1, 1);

/* Landscape */
INSERT INTO `landscape` (id, description, name) values (NULL, 'landscapeDescription1', 'landscapeName1');

/* map */
INSERT INTO `map` (id, description, name) values (NULL, 'mapDescription1', 'mapName1');

/* Map-Places associations */
INSERT INTO `map_places` (map_id, places_id) values (1, 1);

/* People */
INSERT INTO `people` (people_type, id, description, experience_point, level, magic_point, name, inventory) values ('hero', NULL, 'hero1', 10, 5, 7, 'loup ardent', 1);

/* People-images associations */
INSERT INTO `people_images` (people_id, images_id) values (1, 1);

/* Place */
INSERT INTO `place` (id, description, name, x, y) values (NULL, 'placeDescription1', 'placeName1', 1.0, 1.0);

/* Time */
INSERT INTO `time` (id, day, hour) values (NULL, 1, 3);

/* User */
INSERT INTO `user` (id, last_name, first_name, profile_picture, email, credentials_id) values (NULL, 'testLastName', 'testfirstName', 'testprofilePicture', 'testEmail@test', 1);

/* Weapon */
INSERT INTO `weapon` (id, description, name, inventory_id) values (NULL, 'weaponDescription', 'weaponName', 1);

/* Weather */
INSERT INTO `weather` (id, kind, temperature, wind_level) values (NULL, 'rainy', '12', '1');


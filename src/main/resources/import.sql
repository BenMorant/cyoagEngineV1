/* Weather */
INSERT INTO `weather` (id, kind, temperature, wind_level) values (NULL, 'rainy', '12', '1')

/* Credentials */
INSERT INTO `credentials` (id, login, hashed_password, salt) values (NULL, 'testLogin', 'testHashPassword', 'testSalt');

/* User */
INSERT INTO `user` (id, last_name, first_name, profile_picture, email, credentials_id) values (NULL, 'testLastName', 'testfirstName', 'testprofilePicture', 'testEmail@test', 1);

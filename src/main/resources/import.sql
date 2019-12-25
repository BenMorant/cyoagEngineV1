/* Credentials */
INSERT INTO `credentials` (id, login, hashedPassword, salt) values (NULL, 'loginTest', 'passwordTest', 'saltTest');

/* User */
INSERT INTO `user` (id, lastName, firstName, profilePicture, email, credentials) values (NULL, 'lastNameTest', 'firstNameTest', 'profilePictureTest', 'emailTest', 1);



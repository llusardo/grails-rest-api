/*
-- Query: SELECT * FROM test.user
LIMIT 0, 1000

-- Date: 2020-01-24 10:41
*/
INSERT INTO `user` (`id`,`version`,`password_expired`,`username`,`account_locked`,`password`,`account_expired`,`enabled`) VALUES (1,0,'0','me','0','{bcrypt}$2a$10$Zwj8QsUg1intsqKZ2WEW.eVIefuQOU9RUDcgj6X5eeW4GXuzeMVuy','0','1');
INSERT INTO `user` (`id`,`version`,`password_expired`,`username`,`account_locked`,`password`,`account_expired`,`enabled`) VALUES (2,0,'0','admin','0','{bcrypt}$2a$10$9G/77Lal2ufc9XMoq0N08.I7nfqt.3YuO.3f907ZLmX5XMl.lZiRq','0','1');

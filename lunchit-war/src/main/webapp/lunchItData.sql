use lunchit;

SET foreign_key_checks = 0;
TRUNCATE restaurant;
TRUNCATE user;
TRUNCATE menu;
TRUNCATE lunchit.order;

-- insert into restaurant values (restauran_id, restaurant_name);
insert into restaurant values (1, "fortune star");
insert into restaurant values (2, "Szechuan Dynasty Chinese Restaurant");

-- insert into user values (user_id, first_name, last_name, facebook_email);
insert into user values (1, "Yunfei", "Zhao", "yunfei@facebook.com");
insert into user values (2, "Zhi", "Chen", "zhi@facebook.com");
insert into user values (3, "Ziyang", "Lin", "ziyang@facebook.com");

-- insert into menu values (menu_id, menu_name, menu_detail, restaurant_id, menu_price, menu_availability);
insert into menu values (1, "Moo Goo Gai Pan", "chicken", 1, 8.25, true);
insert into menu values (2, "Mongolian Beef", "beef", 1, 8.95, true);
insert into menu values (3, "Curry Shrimp", "spicy shrimp", 1, 8.95, true);
insert into menu values (4, "Seafood Delight", "seafood", 2, 9.95, true);
insert into menu values (5, "Prawn with Ginger Sauce", "grill shrimp", 2, 9.95, false);
insert into menu values (6, "Sweet & Sour Combination", "chicken, pork, shrimp", 2, 9.95, true);

-- insert into order values (order_id, menu_id, quantity, user_id, date_time, comment, order_price);
insert into lunchit.order values (1, 3, 2, 1, '2014-06-25 11:30:05', "more spicy", 17.90);
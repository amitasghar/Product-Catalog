INSERT INTO PRODUCT (ID, NAME, DESCRIPTION, CATEGORY_ID, SUBCATEGORY_ID, SKU_ID, MEDIA_ID) VALUES
(1, 'WW by BUILT(r) 30 oz Tumbler', 'WW by BUILT(r) 30 oz Tumbler 5052013P', 1, 1, 1, 1),
(2, 'Dash 2 Qt Compact Air Fryer', 'Dash 2 Qt Compact Air Fryer 854940007694P', 1, 2, 2, 2),
(3, '52-Week Meal Planner', '52-Week Meal Planner 5061033P', 1, 3, 3, 3),
(4, 'Sweet & Salty Nut Mini Bar', 'Sweet and Salty Nut Mini Bar 6023019P', 2, 4, 4, 4);


INSERT INTO category (ID, DESCRIPTION) VALUES
(1, 'Kitchen'),
(2, 'Food');

INSERT INTO subcategory (ID, CATEGORY_ID, DESCRIPTION) VALUES
(1, 1, 'Drinkware'),
(2, 1, 'Small Appliance'),
(3, 1, 'Lifestyle'),
(4, 2, 'Lifestyle');

INSERT INTO sku (ID, PRICE, QUANTITY) VALUES
(1, 19.99, 471),
(2, 39.99, 631),
(3, 19.99, 645),
(4, 7.99, 7901);

INSERT INTO media (ID, ALT_TEXT, URL) VALUES
(1, 'WW by Built 30 oz Tumbler', 'https://www.weightwatchers.com/us/shop/assets-proxy/weight-watchers/image/upload/q_auto/v1/prod/en-us-ec/static-asset/US_Built_Tumbler_52013-0266.jpg?auto=webp'),
(2, 'Air Fryer - Grey', 'https://www.weightwatchers.com/us/shop/assets-proxy/weight-watchers/image/upload/q_auto/v1/prod/en-us-ec/static-asset/1200x1200-air-fryer-6.jpg?auto=webp'),
(3, 'Meal Planner', 'https://www.weightwatchers.com/us/shop/assets-proxy/weight-watchers/image/upload/q_auto/v1/prod/en-us-ec/static-asset/Meal-Planner-1200x1200-82629.jpg?auto=webp'),
(4, 'Sweet and Salty Nut Mini Bar', 'https://www.weightwatchers.com/us/shop/assets-proxy/weight-watchers/image/upload/q_auto/v1/prod/en-us-ec/static-asset/mini_swtslty_box_f_1200.jpg?auto=webp');
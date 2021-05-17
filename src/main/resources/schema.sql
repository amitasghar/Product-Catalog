DROP TABLE IF EXISTS product;

CREATE TABLE product (
    id integer not null,
    name varchar(100),
    description varchar(255),
    category_id integer,
    subcategory_id integer,
    sku_id integer,
    media_id integer,
    PRIMARY KEY(id)
);

CREATE TABLE category (
    id integer not null,
    description varchar(255),
    PRIMARY KEY(id)
);

CREATE TABLE subcategory (
    id integer not null,
    category_id integer not null,
    description varchar(255),
    PRIMARY KEY(id)
);

CREATE TABLE sku (
    id integer not null,
    price decimal,
    quantity integer,
    PRIMARY KEY(id)
);

CREATE TABLE media (
    id integer not null,
    alt_text varchar(255),
    url varchar(255),
    PRIMARY KEY(id)
);
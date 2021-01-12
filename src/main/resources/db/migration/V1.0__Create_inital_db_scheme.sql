CREATE TABLE addition
(
    id    bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT addition_pkey
            PRIMARY KEY,
    price numeric(19, 2) NOT NULL,
    title varchar(255)   NOT NULL
);

ALTER TABLE addition
    OWNER TO postgres;

CREATE TABLE drink
(
    id             bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT drink_pkey
            PRIMARY KEY,
    price          numeric(19, 2) NOT NULL,
    serving_number integer,
    title          varchar(255)   NOT NULL,
    drink_size_id  bigint
        CONSTRAINT drink_size_drink_fkey
            REFERENCES drink_size
);

ALTER TABLE drink
    OWNER TO postgres;

CREATE TABLE drink_size
(
    id       bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT drink_size_pkey
            PRIMARY KEY,
    cup_size varchar(20) NOT NULL
);

ALTER TABLE drink_size
    OWNER TO postgres;

CREATE TABLE role
(
    id        bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT role_pkey
            PRIMARY KEY,
    role_name varchar(20) NOT NULL
        CONSTRAINT role_role_name_fkey
            UNIQUE
);

ALTER TABLE role
    OWNER TO postgres;

CREATE TABLE user_entity
(
    id         bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT user_entity_pkey
            PRIMARY KEY,
    activity   boolean      NOT NULL,
    email      varchar(50)  NOT NULL
        CONSTRAINT email_value_unique
            UNIQUE,
    first_name varchar(25)  NOT NULL,
    password   varchar(255) NOT NULL,
    surname    varchar(25)
);

ALTER TABLE user_entity
    OWNER TO postgres;

CREATE TABLE card_account
(
    id          bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT card_account_pkey
            PRIMARY KEY,
    amount      numeric(19, 2) NOT NULL,
    card_number varchar(19)    NOT NULL,
    user_id     bigint
        CONSTRAINT card_account_user_entity_fkey
            REFERENCES user_entity
);

ALTER TABLE card_account
    OWNER TO postgres;

CREATE TABLE user_order
(
    id            bigint GENERATED BY DEFAULT AS IDENTITY
        CONSTRAINT user_order_pkey
            PRIMARY KEY,
    creation_date date NOT NULL,
    order_status  varchar(20),
    user_id       bigint
        CONSTRAINT user_order_user_entity_fkey
            REFERENCES user_entity
);

ALTER TABLE user_order
    OWNER TO postgres;

CREATE TABLE odrder_drink
(
    quantity integer NOT NULL,
    drink_id bigint  NOT NULL
        CONSTRAINT order_drink_drink_fkey
            REFERENCES drink,
    order_id bigint  NOT NULL
        CONSTRAINT order_drink_user_order_fkey
            REFERENCES user_order,
    CONSTRAINT odrder_drink_pkey
        PRIMARY KEY (drink_id, order_id)
);

ALTER TABLE odrder_drink
    OWNER TO postgres;

CREATE TABLE drink_additions
(
    drink    bigint NOT NULL
        CONSTRAINT drink_additions_drink_fkey
            REFERENCES drink,
    addition bigint NOT NULL
        CONSTRAINT drink_additions_addition_fkey
            REFERENCES addition
);

ALTER TABLE drink_additions
    OWNER TO postgres;

CREATE TABLE user_roles
(
    user_id bigint NOT NULL
        CONSTRAINT user_roles_user_entity_fkey
            REFERENCES user_entity,
    role_id bigint NOT NULL
        CONSTRAINT user_roles_role_fkey
            REFERENCES role,
    CONSTRAINT user_roles_pkey
        PRIMARY KEY (user_id, role_id)
);

ALTER TABLE user_roles
    OWNER TO postgres;

CREATE TABLE user(
    id UUID NOT NULL PRIMARY KEY,
    name char(100) NOT NULL,
    link Hyperlink
);
CREATE TABLE book (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO book (title, author) VALUES
('The Catcher in the Rye', 'J.D. Salinger'),
('To Kill a Mockingbird', 'Harper Lee'),
('1984', 'George Orwell');
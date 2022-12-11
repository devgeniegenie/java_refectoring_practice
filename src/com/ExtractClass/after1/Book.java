package com.ExtractClass.after1;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;

    public Book(String title, String isbn, String price, String authorName, String authorMail) {
        this._title = title;
        this._isbn = isbn;
        this._price = price;
        this._author = new Author(authorName, authorMail);
    }

    public String getTitle() {
        return _title;
    }

    public String getIsbn() {
        return _isbn;
    }

    public String getPrice() {
        return _price;
    }

    public String getAuthorName() {
        return _author.getName();
    }

    public String getAuthorMail() {
        return _author.getMail();
    }

    public String toXml() {
        String author =
                tag("author", tag("name", _author.getName()) + tag("mail", _author.getMail()));
        String book =
                tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }

    class Author {
        private String _name;
        private String _mail;

        public Author(String name, String mail) {
            this._name = name;
            this._mail = mail;
        }

        public String getName() {
            return _name;
        }

        public void setName(String name) {
            this._name = name;
        }

        public String getMail() {
            return _mail;
        }

        public void setMail(String mail) {
            this._mail = mail;
        }
    }

}

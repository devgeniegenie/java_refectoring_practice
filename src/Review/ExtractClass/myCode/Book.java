package Review.ExtractClass.myCode;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private String _authorName;
    private String _authorMail;

    public Book(String _title, String _isbn, String _price, String _authorName, String _authorMail) {
        this._title = _title;
        this._isbn = _isbn;
        this._price = _price;
        this._authorName = _authorName;
        this._authorMail = _authorMail;
    }

    public String get_title() {
        return _title;
    }

    public String get_isbn() {
        return _isbn;
    }

    public String get_price() {
        return _price;
    }

    public String get_authorName() {
        return _authorName;
    }

    public String get_authorMail() {
        return _authorMail;
    }

    public void set_authorName(String _authorName) {
        this._authorName = _authorName;
    }

    public void set_authorMail(String _authorMail) {
        this._authorMail = _authorMail;
    }

    public String toXml() {
        String author =
                tag("author", tag("name", _authorName) + tag("mail", _authorMail));
        String book =
                tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }

}

package ch.itds.demo

class Author {

    String name

    static hasMany = [books: Book]

    static constraints = {
        name(minSize: 3)
    }
}

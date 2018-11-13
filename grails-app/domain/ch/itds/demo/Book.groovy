package ch.itds.demo

class Book {

    String name

    static belongsTo = [author: Author]

    static constraints = {
    }
}

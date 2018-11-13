
# Validation No Session In View Issue

This example project shows an issue with the terminated/rolled back hibernate session if the validation fails

## Project setup

* Default Grails 3.3.8 Project
* Simple Author and Book domain classes
* Generated controllers and views
* Manually added access to an authors books in the author edit view

## Steps to reproduce

* Start application
* Create an author with valid name (min length 3)
* Edit this author
* Set name to an invalid name (length less than 3)
* Save 
* An exception caused by `LazyInitializationException: failed to lazily initialize a collection of role: ch.itds.demo.Author.books, could not initialize proxy - no Session` should occur


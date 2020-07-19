# Android-content-provider-demo

This demo app demonstrates the use of content providers.  Content providers allow resources to be shared between one or more apps,
such as a database.  This app is constructed by first creating a class that extends the content provider class.
The class contains basic methods (insert, delete, query, update) for interacting with a database that need to be implemented 
depending on the type of database that is used.  In this example, an SQLite database is used.  It is created as part of the class.
The class also contains URI information for accessing the database.

The manifest file contains information about the app being a provider and also provides an authority for other apps to access the
database.

The main activity contains methods for interacting with the UI.  The save button gets the editext information and stores it into the database.
The load button displays the database information in a toast.

When another app is created and needs access to the database from the content provider app, they must have the information about the
database authority that was set in the manifest file that contained the database. This way a URI can be created to access the database.
Certain permissions may need to be set in the manifest file depending on the access level of the database.

This demo was part of Android Development Fundamentals, Unit 4: Lesson 11.1.

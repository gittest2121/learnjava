Polymorphism is the ability of object to take on different forms. Polymorphism is useful to group several instances of subclasses into lists of instances of superclasses without compromising performance and functionality of the program.

Say, you had created three classes, named Bike -- MountainBike and RoadBike. The last two classes inherit the properties of the Bike class. You can group together all types of bikes in ArrayList<Bike> with polymorphism.

If Java didn't have polymorphism, there would be endless code mess of  creating lists for each subclass and seperate lists for superclasses.

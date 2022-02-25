# Objects on a list
```
\\ imports

public class Playlist {
    private ArrayList<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        this.songs.add(song);
    }

    public void removeSong(String song) {
        this.song.remove(song);
    }

    public void printSongs() {
        for (String song : this.songs) {
            System.out.println(song);
        }
    }
}
```
```
Playlist list = new Playlist();
list.addSong("Test Beep");
list.addSong("Meow Cat");
list.printSongs();
```

# Printing an Object from a List
--Done--

# Clearing an Object List
clear method

# Calculating a sum from objects on a list
--Done--

# Retrieving a Specific Object from a List
1. Check if list is empty -- return null reference if empty
2. We set the first object as its value and compare it with remaining elements. If comparison finds a better matching object, its assigned to the object reference variable to be returned.

```
public Person getTallest() {
    // retun a null reference if there's no one on the ride
    if (this.riding.isEmpty()) {
        return null;
    }

    // create an object reference for the object to be returned
    // Initially, its first value is the first object in the list
    Person returnObject = this.riding.get(0);

    // go through the list
    for (Person prs : this.riding) {
        // compare each object on the list
        // to the returnObject -- we compare heights
        // since we're returning the tallest

        if (returnObject.getHeight() < prs.getHeight()) {
            // if we find a taller person in the comparison,
            // we assign it as the value of the returnObject
            returnObject = prs;
        }
    }

    // finally, the object reference describes the return object to be
    // returned
    return returnObject;
}
```
```
Person p1 = new Person("p1");
p1.setHeight(180);

Person p2 = new Person("p2");
p2.setHeight(132);

Person p3 = new Person("p3");
p3.setHeight(194);

AmusementParkRide ride = new AmusementParkRide("ride", 140);

ride.isAllowedOn(p1);
ride.isAllowedOn(p2);
ride.isAllowedOn(p3);

System.out.println(ride); // ride, minimum height requirement: 140, visitors: 2, on the ride:
// p1
// p3
System.out.println(ride.averageHeightOfPeopleOnRide());	// 187.0

System.out.println();
System.out.println(ride.getTallest().getName()); // p3

Person tallest = ride.getTallest();
System.out.println(tallest.getName()); // p3
```


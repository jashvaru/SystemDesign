package LLD.RideSharingApp;

abstract class User {
    
    private String name;
    private String email;
    private Location Location;

    public User(String name, String email, Location location) {
        this.name = name;
        this.email = email;
        Location = location;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }
  
}

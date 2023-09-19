
// class EMBase {
// protected Long id;
// protected String name;

// public Long getId() {
// return id;
// }

// public void setId(Long id) {

// this.id = id;

// }

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// }
// }

// class Organizer extends EMBase {

// }

// class Venue extends EMBase {
// String description;
// String address;
// String city;
// String state;
// String pincode;

// String getDescription() {
// return description;
// }

// void setDescription(String description) {
// this.description = description;
// }

// String getAddress() {
// return address;
// }

// void setAddress(String address) {
// this.address = address;
// }

// void getPincode(String pincode) {
// this.pincode = pincode;
// }

// String setPincode() {
// return pincode;
// }

// void getState(String state) {
// this.state = state;
// }

// String getState() {
// return state;
// }

// String getCity() {
// return city;
// }

// void setCity(String city) {
// this.city = city;

// }

// }

// class Event extends EMBase {
// private String description;
// private String startTime;
// private String endTime;
// private Boolean started;

// public Event(Long id, String name, String description) {
// this.id = id;
// this.name = name;
// this.description = description;
// }

// public String getDescription() {
// return description;
// }

// public void setDescription(String description) {
// this.description = description;
// }

// public String getStartTime() {
// return startTime;
// }

// public void setStartTime(String startTime) {
// this.startTime = startTime;
// }

// public String getEndTime() {
// return endTime;
// }

// public void setEndTime(String endTime) {
// this.endTime = endTime;
// }

// public Boolean getStarted() {
// return started;
// }

// public void setStarted(Boolean started) {
// this.started = started;
// }

// public String toString() {
// return id + "\n" + name + "\n" + description;
// }

// }

// interface EventManager {

// Event create(Long id, String name, String description);

// void m1(Event event);
// }

// class EventManagerImpl implements EventManager {
// @Override
// public Event create(Long id, String name, String description) {
// return new Event(id, name, description);
// }

// @Override
// public void m1(Event event) {

// }

// }

// class Test {
// public static void main(String[] args) {
// EMBase e = new EMBase();
// e.setId(100l);
// System.out.println(e.getId());

// Event event = new Event(456l, "Ihpone 100 Launch", "Grand Launch");
// EventManager em = new EventManagerImpl();

// Event m = em.create(456l, "Ihpone 100 Launch", "Grand Launch");
// System.out.println(event.hashCode());
// System.out.println(m.hashCode());

// // System.out.println(em.create(456l, "Ihpone 100 Launch", "Grand Launch"));
// }
// }

import java.util.Scanner;

class EMBase {
    private Long id;
    private EMBase name;

    EMBase getName() {
        return name;
    }

    void setName(EMBase b) {
        this.name = b;
        System.out.println(this.name.hashCode());

    }

}

class Test {
    public static void main(String[] args) {
        EMBase b = new EMBase();
        Scanner sc = new Scanner(System.in);

        b.setName(b);
        System.out.println(b.hashCode());

    }
}

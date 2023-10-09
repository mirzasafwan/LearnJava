
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

// class EMBase {
// private Long id;
// private EMBase name;

// EMBase getName() {
// return name;
// }

// void setName(EMBase b) {
// this.name = b;
// System.out.println(this.name.hashCode());

// }

// }

// class Test {
// public static void main(String[] args) {
// int[] a = { 30, 10, 20, 10, 20, 10, 10, 40 };

// boolean[] isDuplicate = new boolean[a.length];
// boolean isUnique = false;
// for (int i = 0; i < a.length - 1; i++) {
// for (int j = 0; j < a.length - i - 1; j++) {
// if (a[j] > a[j + 1]) {
// int temp = a[j];
// a[j] = a[j + 1];
// a[j + 1] = temp;
// }
// }
// }

// System.out.print("Duplicate : ");

// for (int i = 0; i < a.length; i++) {
// isUnique = false;
// if (!isDuplicate[i]) {
// for (int j = i + 1; j < a.length; j++) {
// if (a[i] == a[j]) {
// isDuplicate[i] = true;
// isUnique = true;
// i++;
// }

// }

// if (isUnique) {
// System.out.print(a[i] + " ");
// } else {
// System.out.println();
// System.out.print("Unique : ");
// for (i = 0; i < a.length; i++) {
// isUnique = false;
// for (int j = i + 1; j < a.length; j++) {
// if (a[i] == a[j]) {
// isDuplicate[i] = true;
// isUnique = true;
// i++;
// }
// }
// if (!isUnique) {
// System.out.print(a[i] + " ");
// }
// }
// }

// }

// }
// System.out.println();

// }
// }

// public class Test {
// public static void reverse(int number) {
// int reversedNumber = 0;
// while (number != 0) {
// int digit = number % 10;
// reversedNumber = reversedNumber * 10 + digit;
// number /= 10;
// }
// System.out.println(reversedNumber);

// }

// public static void main(String[] args) {
// int num = 12345;

// reverse(num);
// }
// }
// class Test {
// public static void main(String[] args) {
// String s1 = new String("Hello");
// String s5 = new String("Hello");
// String s2 = "Hello";
// String s4 = s2.intern() + s2.intern();
// String s6 = new String("Hello") + new String("Hello");
// System.out.println(s4.equals(s6));
// System.out.println(s4 == s6);
// System.out.println(s4 == s6);
// System.out.println(s1.equals(s5));
// System.out.println(s4.hashCode());
// System.out.println(s6.hashCode());
// }
// }
// class Test {
// public static void main(String[] args) {

// int[] arr = { 1, 2, 1, 4, 5, 6, 6, 7, 3 };
// int Search = 3;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == Search) {
// System.out.println(Search + " element found at " + i + " Location");
// }

// }

// }
// }
// class Test {

// public static void main(String[] args) {
// String s1 = "Hello";
// String s2 = "";
// // System.out.println();
// Test t = new Test();
// s2 = t.toString();
// System.out.println(s2.isEmpty());

// }
// }
// class Test {
// public static void main(String[] args) {
// int[] arr = { 1, 2, 4, 3, 5, 8, 6, 10 };
// int key = 2;
// int f = 0;
// int l = arr.length - 1;
// boolean flag = false;
// while (f <= l) {
// int mid = (f + l) / 2;
// if (arr[mid] == key) {
// System.out.println(key + " found at " + mid);
// flag = true;
// break;
// } else if (arr[mid] > key) {
// l = mid - 1;

// } else {
// f = mid + 1;
// }

// }
// if (!flag) {
// System.out.println("No such element found");
// }

// }
// }
// class Test {
// public static void main(String[] args) {
// int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
// int mid = 0, f = 0, l = a.length - 1, key = 111;
// boolean flag = false;
// while (f <= l) {
// mid = (f + l) / 2;
// if (a[mid] == key) {
// System.out.println(key + " found at " + mid + " index");
// flag = true;
// break;
// } else if (a[mid] < key) {
// f = mid + 1;
// } else {
// l = mid - 1;
// }
// }
// if (!flag) {
// System.out.println("No element Found");
// }
// }
// }
// class Test {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// int odd[] = new int[arr.length];
// int even[] = new int[arr.length];
// int oddCounter = 0;
// int evenCounter = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] % 2 == 0) {
// even[evenCounter] = arr[i];
// evenCounter++;
// } else {
// odd[oddCounter] = arr[i];
// oddCounter++;
// }
// }
// System.out.print("Array Elements: ");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// System.out.print("Even elements: ");
// for (int i = 0; i < evenCounter; i++) {
// System.out.print(even[i] + " ");
// }
// System.out.println();

// // Print the odd elements
// System.out.print("Odd elements: ");
// for (int i = 0; i < oddCounter; i++) {
// System.out.print(odd[i] + " ");
// }
// System.out.println();

// }
// }
// class Test {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
// int odd[] = new int[arr.length];
// int even[] = new int[arr.length];
// int oddCounter = 0;
// int evenCounter = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] % 2 == 0) {
// even[evenCounter] = arr[i];
// evenCounter++;

// } else {
// odd[oddCounter] = arr[i];
// oddCounter++;
// }
// }
// System.out.println("Odd Numbers");
// for (int i = 0; i < oddCounter; i++) {
// System.out.print(odd[i] + " ");
// }
// System.out.println();
// System.out.println("Even Numbers");
// for (int i = 0; i < evenCounter; i++) {
// System.out.print(even[i] + " ");
// }
// System.out.println();

// }
// }

class Test {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();

        // if (N % 2 == 0) {
        // System.out.println("Not Weird"); // If is even and in the inclusive range of
        // to , print Not Weird
        // } else if (N % 2 != 0 || N >= 6 && N <= 20) {
        // System.out.println("Weird"); // If is odd, print Weird
        // } else {
        // System.out.println("Not Weird");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("How many Number ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter Number");
        // arr[i] = sc.nextInt();

        // }

        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];

        // }
        // System.out.println(sum);

        try {
            Float f = new Float("3.0");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("Bad Program");
        }

    }
}
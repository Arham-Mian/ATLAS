public class Task14 {
        public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(arr);
        String[] names = {"Meena", "Tina", "Veena", "heena"};
        System.out.println(names[0]);
        names[1] = "Reena";
        System.out.println(names[1]);
        System.out.println(names.length);
        try {
            System.out.println(names[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 4 is out of bounds");
        }
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 5 is out of bounds");
        }
        try {
            System.out.println(names[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Negative index is invalid");
        }
    }
}

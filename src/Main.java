public class Main {
    public static void main(String[] args) {
        System.out.println("=== CENCUS 2089, CITY OF BROKENHEARTED ===");
        Person person00 = new Person("Ada Lovelace", 25, 178, 67.9);
        System.out.println("Name = " + person00.getName());
        System.out.println("Age = " + person00.getAge());
        System.out.println("Height = " + person00.getHeight());
        System.out.println("Wight = " + person00.getWeight());

        // CREATE PERSON01 AND PERSON02 OBJECTS AND PRINT THEM
        Person person01 = new Person("James Peterson", 34, 180, 73.5);
        System.out.println("Name = " + person01.getName());
        System.out.println("Age = " + person01.getAge());
        System.out.println("Height = " + person01.getHeight());
        System.out.println("Wight = " + person01.getWeight());

        Person person02 = new Person("Bob Thornley", 25, 171, 68.2);
        System.out.println("Name = " + person02.getName());
        System.out.println("Age = " + person02.getAge());
        System.out.println("Height = " + person02.getHeight());
        System.out.println("Wight = " + person02.getWeight());

        person01.growOlder();
        System.out.println("A year after....");
        System.out.println("Name = " + person01.getName());
        System.out.println("Age = " + person01.getAge());
        System.out.println("Height = " + person01.getHeight());
        System.out.println("Weight = " + person01.getWeight());

    }
}
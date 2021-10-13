public class main {
    public static void main(String[] args) {
//        Calculator tc = new Calculator();
//        System.out.println(tc.a);
//        Calculator tc2 = tc;
//        tc2.a++;
//        System.out.println(tc2.a);
//        System.out.println(tc2.sum(5));
        Person person = new Person("Lolek");
        System.out.println(person.getName());
        System.out.println(person.getName().length());
        person.setName("FirstPerson");
        System.out.println(person.getName());
        System.out.println(person.getName().length());


//    private static void workWithCalc(){
//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(5));
//        System.out.println(calc.sum(5));
//        System.out.println(calc.getCurrent());
//        System.out.println(new Calculator().getCurrent());
//    }
    }
}

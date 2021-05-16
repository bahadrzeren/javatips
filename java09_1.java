
//	Collections got a couple of new helper methods, to easily construct Lists, Sets and Maps.

List<String> list = List.of("one", "two", "three");
Set<String> set = Set.of("one", "two", "three");
Map<String, String> map = Map.of("foo", "one", "bar", "two");

//	Streams got a couple of additions, in the form of takeWhile,dropWhile,iterate methods.

Stream<String> stream = Stream.iterate("", s -> s + "s")
  .takeWhile(s -> s.length() < 10);

//	Optionals got the sorely missed ifPresentOrElse method.

user.ifPresentOrElse(this::displayAccount, this::displayLogin);

//	Interfaces got private methods:

public interface MyInterface {

    private static void myPrivateMethod(){
        System.out.println("Yay, I am private!");
    }
}

//	JShell

//	HTTPClient

//	Jigsaw


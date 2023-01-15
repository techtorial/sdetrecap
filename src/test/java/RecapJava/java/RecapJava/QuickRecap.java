package RecapJava.java.RecapJava;

public class QuickRecap {

    /*
    WHAT WE LEARNED FIRST DAY:

    1-General Information about Java --> JDK,JVM,JRE
    2-Data types(primitive) -->Integer Boolean String --> int double boolean
    3-ASCII table -->Char
    4-String and String Methods --> contains,equals,trim, substring
    5-If condition switch -->limited options Ternary Operators
    6-Loops --> List<WebElement> -->do while(at least once no matter what), while, for, for each --> Debug the implementation
     NOTE:How to debug in IntelliJ (On google) watch some videos
    7-Arrays:It is a bucket that we use for elements to store. --> List
    8-Object And Methods --> What is class , what is object and what are the methods

      CLass-->template(Human,Car)

       Object -->representation(Ahmet, BMW, AUDIO)

         equals , hashcode , toString()

    SECOND DAY RECAP:

     1-Constructor: is a way to initiliaze the instance variables.

       instance variables --> belong to class

     public class MainPage()

        public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this)

    this,this(), super, super()

     *--> AUTOMATION --> we use constructor for pages to initiliaze my element with PageFactory class

     2-Garbage Collection --> cleaning the memory from useless or unused data (OCA exam)

       to be able to prove that garbage collector is working we override the finalize method.

     3-Wrapper CLass: It is a way to convert the one data type to another.

        int number=5;

         List<Integer> num;

          num.add(number)--> int ---> Integer  --> AUTOBOXING  --> primitive to OBJECT

          String nbmr="6";

          int newNumber=Integer.parseInt(nbmr); -->OBJECT --> PRIMITIVE --> UNBOXING

       4-Multidimensional: DataProvider from TestNG Multidimensional Object it returns

       5-ArrayList: is a way to store Object in an advance level -- LIST<WEBELEMENT>

       6-Set:Uniquness -->It is a way to store only unique elements(it doesn't allow duplicates) SET<STRING> GetWIndowHandle


       7-Map:KEY-VALUE --> Key refers to Set, Value refers to List. It is a way to store the data with KEY-VALUE pairs.

            API --> JSON and also DATA TABLE            MAP<STRING,STRING> data=datatable.asMap();




     */
}

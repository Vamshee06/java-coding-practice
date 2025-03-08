package com.prashanthi.services.PrashanthiServices.corejava;

import com.github.javafaker.Faker;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.*;

public class PracticePrograms {
    public static void main(String[] args) {
        reverseNumber();
        //armStrong();
        // primeNumber();
        // sumOfPrimeNumbers();
        // fibnocciSeries();
        //evenNumber();
        //oddNumbers();
        // sumOfEvenAndOddNumbers();
        // palindromeNumber();
        // palindromeString();
        //sumOfFirstAndLastNumber();
        //sumOfNumbers();
        //swapTwoNumbersWithoutThirdVariable();
        //swapTwoNumbersWithThirdVariable();
        //swapTwoStrings();
        //reverseArray();
        //reverseStringForCharacters();
        //countCapWordsInString();

        //factorial
       /* int n=6;
        System.out.println("factorial of n numbers: " +factorial(n));*/

        // bubbleSort();
        //secondLargestElementInArray();
        // System.out.println(FirstNonRepeatingCharacter("GeeksOfGeeks"));
        // System.out.println(secondNonRepeatingCharacter("GeeksOfGeeks"));

        //reverse each word in place

       /* String s = "My name is Prashanthi";
        System.out.println(reverseEachWordInPlace(s));*/

        //countCharactersInString();

        //longestConsectiveOccurence();
        // longestConsectiveOccurenceAndCount();
        //convertNumToChar();
        //findConsecutiveOnes();
        //firstAndLastOccurenceOfTargetExample();
        //shiftZerosToRight();
        //shiftZerosToLeft();
        countWordsInString();

        //Collection

        // displayList();
        //  displayListUsingForLoop();
        //removeDuplicateNumbersUsingFakerApi();
        //RemoveDuplicatesUsingArray();
        //countDuplicateOccurences();
        //duplicateElementCount();
        printMissingNumber();
        // RemoveDuplicatesFromOverAllString();
        //removeDuplicatesFromEachWor();
        //removeDuplicatesFromArray();
        // printDupliatesInArray();
        // printDuplicatesUsingList();
        //frequencyOfElement();
        //findDuplicatesInString();
        // compareTwoSets();
        //mergeTwoArrayList();
        // listToArray();
        //listUsingSetAndGet();
        //sortElements();
        //traverseElements();
        //displayValues();
        //convertingArrayListToArrayToArrayList();
    }
    //Collection

    /**
     * Converting arraylist to array using toArray() and array to arraylist using Arrays.aslist()
     **/

    public static void convertingArrayListToArrayToArrayList() {
        List<String> list = new ArrayList<>();
        list.add("tina");
        list.add("riya");
        list.add("siya");
        list.add("piya");
        System.out.println(list);
        String[] s = list.toArray(new String[list.size()]);
        for (String array : s) {
            System.out.println("converting arraylist to array: " + array);
        }

        System.out.println("converting array to arraylist: ");
        List<String> arrayList = new ArrayList<>();
        arrayList = Arrays.asList(s);
        System.out.println(arrayList);
    }


    /**
     * Inserting elements into list and print iterate through loop
     * remove iterate through loop and print the list and
     **/

    public static void displayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        System.out.println("Display list: " + list);
        list.remove(3);
        // System.out.println("remove the index 3 from the list: " +list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list after removing the element from the list: " + list.get(i) + " ");
        }
    }


    /**
     * Traverse the elements in forward and backward  using listiterator interface and its method like hasPrevious and hasNext()
     **/
    public static void traverseElements() {
        List<String> list = new ArrayList<>(List.of("rani", "vani", "seeta", "geeta", "rita", "tina"));
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Forward direction");
        while (listIterator.hasNext()) {
            System.out.println("Index : " + listIterator.nextIndex() + "value: " + listIterator.next());
        }
        System.out.println("Backward direction:");
        while (listIterator.hasPrevious()) {
            System.out.println("Index:" + listIterator.previousIndex() + "value: " + listIterator.previous());
        }
    }

    //List using set and get methods

    public static void listUsingSetAndGet() {
        List<String> list2 = new ArrayList<>();
        list2.add("Manago");
        list2.add("Apple");
        list2.add("grapes");
        list2.add("banana");
        list2.add("guava");
        list2.add("jackfruit");
        System.out.println("Print list : " + list2);
        System.out.println("Get one element from list : " + list2.get(2));
        list2.set(1, "cantaloop");
        for (String fruit : list2) {
            System.out.println("List after updating the Apple with Cantloop  : " + fruit);
        }
        list2.remove(5);
        for (String fruit1 : list2) {
            System.out.println("list after Removing the jackfruit element from the list : " + fruit1);
        }
    }

    /**
     * Convert list to array using toArray() method
     */

    public static void listToArray() {
        System.out.println("Converting List to Array");
        List<String> list = new ArrayList<>();
        list.add("tina");
        list.add("rina");
        list.add("siya");
        list.add("dev");
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("print array: " + Arrays.toString(array));
        // System.out.println("print list: " +list);
    }


    /**
     * Converting array to list using Arrays.toString()
     */

    public static void arrayToList() {
        int arr[] = {1, 2, 3, 4, 3, 21, 5, 6, 7};
        System.out.println("printing array: " + Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        for (Integer listdemo : arr) {
            set.add(listdemo);
        }
        System.out.println("Printing list: " + set);
    }

    /**
     * check the max element in the list using Collections.max() method
     */

    public static void maxElementInList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(33);
        list.add(55);
        list.add(22);
        Integer max = Collections.max(list);
        System.out.println("Maximum element in list: " + max);
    }

    /**
     * sort the elements in order of list using Collections.sort() method
     */
    public static void sortElements() {
        List<String> list = new ArrayList<>(List.of("Teju", "Vamshi", "Aahil", "Shanthi", "Teju"));
        Collections.sort(list);
        for (String list1 : list) {
            System.out.println("Sorted list: " + list1);
        }
        String[] array = list.toArray(new String[list.size()]);
        String array1 = Arrays.toString(array);
        System.out.println(array1);
        Set<String> set = new HashSet<>();
        set.add(array1);
        System.out.println(set);
    }


    /**
     * create two list by using retainall() of list get the common elements from both the list
     */
    public static void intersectionOfTwoLists() {
        List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30));
        List<Integer> list2 = new ArrayList<>(List.of(20, 30, 40));
        list1.retainAll(list2);
        System.out.println("Intersection of 2 lists: " + list1);

    }


    /**
     * create two lists
     * create Set and add list1 to it
     * by using addAll() add list2 to  set
     * then create List and add set to it and print it
     */


    public static void mergeTwoArrayList() {
        List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30));
        List<Integer> list2 = new ArrayList<>(List.of(40, 30, 50));
        Set<Integer> set = new LinkedHashSet<>(list1);
        set.addAll(list2);

        List<Integer> mergeList = new ArrayList<>(set);
        System.out.println("Merge two lists: " + mergeList);
    }


    /**
     * Compare two sets are equal or not
     * create 2 sets by adding elements in to the set
     * and compare two sets using equals method.
     */

    public static void compareTwoSets() {
        Set<String> set1 = new HashSet<>();
        set1.add("vamsi");
        set1.add("teju");
        set1.add("aahil");
        set1.add("shanthi");

        Set<String> set2 = new HashSet<>();
        set2.add("shanthi");
        set2.add("teju");
        set2.add("aahil");
        set2.add("vamsi");

        if (set1.equals(set2)) {
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        }
    }

    /**
     * Frequency of elements
     * Prepare the list with duplicate names
     * create a hasmap
     * iterate the list
     * add each element of the list as key(String), value as count - 1 for the first time
     * and increment 1 with 1 when the same string appears using HashMap.getorDefault(key,value)+1  method
     **/

    public static void frequencyOfElement() {
        List<String> list = new ArrayList<>(List.of("AAhil", "Teju", "Teju", "AAhil", "Teju", "Vamshi", "Vamshi", "Vamshi", "Shanthi", "Shanthi", "Shanthi"));
        System.out.println("Print the list: " + list);
        Map<String, Integer> hashMap = new HashMap<>();
        for (String element : list) {
            hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
        }
        System.out.println("elements in the hashMap: " + hashMap);
    }

    public static void findDuplicatesInString() {
        String str = "Programming Language";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue() + " times");
            }
        }

    }


    /**
     * Print duplicates from array
     * to remove duplicates create set object next iterate through loop then check the condition if(!set.add(i))
     **/

    public static void printDupliatesInArray() {
        int arr[] = {1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 6};
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i)) {
                System.out.println("Print duplicates from array: " + i);
            }
        }
    }

    /**
     * Print duplicates using List
     **/

    public static void printDuplicatesUsingList() {
        int arr[] = {1, 2, 1, 2, 3, 2, 4, 5, 4, 3};
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (int i : arr) {
            if (!set.add(i)) {
                duplicateList.add(i);
            }
            Integer[] duplicateListArray = duplicateList.toArray(new Integer[0]);
            System.out.println(Arrays.toString(duplicateListArray));
        }
    }

    /**
     * Remove duplicates from array
     * convert the array to list usings Arrays.asList()
     **/

    public static void removeDuplicatesFromArray() {
        String arr[] = {"a", "e", "i", "o", "u", "a", "e", "i", "o", "u"};
        /*Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);*/
        Set<String> set = new LinkedHashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        System.out.println(set);
    }


    /**
     * Remove duplicates from each word
     */

    public static void removeDuplicatesFromEachWor() {
        String s = "my nanaaemee is prashanthii tesstinng the prooggram";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            Set<Character> set = new LinkedHashSet<>();
            for (char c : word.toCharArray()) {
                set.add(c);
            }

            for (char i : set) {
                result.append(i);
            }
            result.append(" ");
        }
        System.out.println("remove duplicates from string:" + result.toString().trim());
    }


    /**
     * Remove Duplicates from overall string
     * Remove Duplicates from overall string
     * initialize the string and add it to set to remove dulicates using toCharArray()
     * if(c ==' ' or set.add(c))
     * then create a stringBuilder object by using append() add it to the reference variable
     **/

    public static void RemoveDuplicatesFromOverAllString() {
        String s = "my name is prashanthi testing the program";
        StringBuilder result = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if (c == ' ' || set.add(c)) { // Add character to the set or preserve space
                result.append(c);
            }
        }
        System.out.println("remove duplicates from string:" + result.toString().trim());
    }


    /**
     * Remove duplicate elements from array convert array to list using for each  and add elements to list then add list to set
     **/

    public static void RemoveDuplicatesUsingArray() {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
            System.out.println("elements in  the list: " + i);
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Removed duplicate elements from list: " + set);
    }

    /**Total count of duplicate elements occurence in array**/

    public static void countDuplicateOccurences() {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        int duplicateElementOccurence=0;

        // Count occurrences of each element
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        // Count elements that have duplicates
        for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            if(entry.getValue()>1){
                duplicateElementOccurence+=(entry.getValue()-1);
            }
        }
        System.out.println("orginal array: " +Arrays.toString(arr));
        System.out.println("Unique elemnts: " +frequencyMap.keySet());
        System.out.println("Total duplicate count: " +duplicateElementOccurence);
    }

    /**Count of duplicate elements in array**/

    public static void duplicateElementCount(){
        int[] arr = {2,1,3,2,1,4,5,3,2};
        int duplicateCount=0;

        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        for(int count:frequencyMap.values()){
            if(count>1){
                duplicateCount++;
            }
        }
        System.out.println("orginal array: " +Arrays.toString(arr));
        System.out.println("Unique elemnts: " +frequencyMap.keySet());
        System.out.println("duplicate count: " +duplicateCount);
    }

    /**print the missing number from array **/

    public static void printMissingNumber(){
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Missing number in Array: " + (sum2 - sum1));
    }


    /**
     * Remove duplicates from the list using set
     * create List object and iterate through loop to add
     * then add list to set to avoid duplicates
     **/

    public static void displayList() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 3, 4, 5, 5, 6, 7));
        System.out.println("Print list : " + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("remove duplicates elements from the list: " + set);
    }


    /*remove duplicates by adding the elements to list by iterating through loop
    Then add the iterated list to the set by iterating throug for loop
     */

    public static void displayListUsingForLoop() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        for (int list1 : list) {
            System.out.println("print elements: " + list1);
        }

        Set<Integer> set = new HashSet<>(list);
        for (int set1 : list) {
            set.add(set1);
            System.out.println("removed duplicate elements from list: " + set1);

        }

    }

    //Remove duplicate Numbers using faker api iterate through the loop and add to the list then add list to the set

    public static void removeDuplicateNumbersUsingFakerApi() {
        List<Integer> list = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i <= 10; i++) {
            int i1 = faker.number().numberBetween(10, 20);
            list.add(i1);
            System.out.println("print elements in the list: " + i1);
        }

        Set<Integer> set = new HashSet<>(list);
        //System.out.println("Removed duplicate elements from list:"+set);
        for (int i : set) {
            System.out.println("Removed duplicate elements from list:" + i);
        }
    }





    //corejava programs

    /**
     * Counting number of words in given string
     * **/

    public static void countWordsInString(){
        String s = "My name is Prashanthi";
        String words[] = s.split(" ");
        System.out.println("Number of words in a given string: " +words.length);
    }

    /**
     * first non repeating character in a given String.
     * Create a HashMap object to store each character as a key and its occurence as value
     * iterate through the loop to check each character occurence
     * then again iterate through the loop to check  firs non-repeating character equal to 1
     **/

    public static char FirstNonRepeatingCharacter(String s) {
        Map<Character, Integer> char_count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_count.containsKey(c)) {
                char_count.put(c, char_count.get(c) + 1);
            } else {
                char_count.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_count.get(c) == 1)

                return c;
        }
        return '_';
    }

    /**
     * Second nonrepeating character in a string
     **/

    public static char secondNonRepeatingCharacter(String s) {
        Map<Character, Integer> hashCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashCount.containsKey(c)) {
                hashCount.put(c, hashCount.get(c) + 1);
            } else {
                hashCount.put(c, 1);
            }
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashCount.get(c) == 1) {
                count++;
                if (count == 2) {
                    return c;
                }
            }

        }
        return '_';
    }


    /**
     * Write a Java Program to find the longest consecutive occurrence of integers in a given array.
     * intilize arr and decalre count and max to 0 value
     * iterate through loop check the condition if(arr[i]+1==arr[i+1])
     * count++
     * else reset count=0
     * then max=Math(max,count+1)
     **/

    public static void longestConsectiveOccurence() {
        int[] arr = {100, 4, 22, 5, 6, 7, 8, 33, 11};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count + 1);
        }
        System.out.println(max);
    }

    /**
     * display the consecutive integers and how many there are
     **/
    public static void longestConsectiveOccurenceAndCount() {
        int[] arr = {12, 1, 5, 3, 7, 8, 9, 10, 6, 33, 22};
        int count = 1;
        int max = 0;
        String currentSequence = "";
        String longestSequence = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                if (currentSequence.isEmpty()) {
                    currentSequence = arr[i] + " " + arr[i + 1];
                } else {
                    currentSequence += " " + arr[i + 1];
                }
                count++;

            } else {
                if (count > max) {
                    max = count;
                    longestSequence = currentSequence;
                }
                count = 1;
                currentSequence = "";
            }
        }
        if (count > max) {
            max = count;
            longestSequence = currentSequence;
        }
        System.out.println("Longest Consecutive Sequence Length: " + max);
        System.out.println("Longest Consecutive Sequence: " + longestSequence);
    }

    /**
     * maximum consecutive ones in a given array.
     **/

    public static void findConsecutiveOnes() {
        int[] nums = {0, 1, 1, 0, 0, 0, 1, 1, 1};
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }

    /**
     * first and last position of a target value in array
     * Declare a array int[] array = {1,4,3,2,5,6,6}
     * intilize the variables firstIndex=-1,  lastIndex=-1 for example int target=8 since if we didnt find the target value it gives the output -1 for both the values
     * iterate the forloop each value
     * check the condition if(array[i]==target && firstIndex==-1) then set the value firsIndex=i
     * check another condition for lastIndex if(array[i]==target && firstIndex!=-1) then set the value of lastIndex=i
     **/
    public static void firstAndLastOccurenceOfTargetExample() {
        int[] array = {1, 4, 1, 2, 3, 4, 4};
        int firstIndex = -1;
        int lastIndex = -1;
        int target = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target && firstIndex == -1) {
                firstIndex = i;
            }
            if (array[i] == target && firstIndex != -1) {
                lastIndex = i;
            }
        }
        System.out.println("FirstIndex is: " + firstIndex + " LastIndex is : " + lastIndex);
    }

    /**
     * Shift zeros to the right
     * count keeps track of the next available position for a non-zero element.
     * Initially, it's set to 0, meaning the first non-zero element will go at index 0.
     * The loop iterates through the array from left to right.
     * If the current element is non-zero, we swap it with the element at count.
     * if arr[i] is non-zero:
     * Swap arr[i] with arr[count] (to push non-zero elements to the front).
     * Increment count (next available position for a non-zero element).
     * Finally, we print the modified array.
     * **/

    public static void shiftZerosToRight(){
        int[] arr = {0,1,2,0,0,3,0,4,0,5};
        int count =0; // Position for non-zero elements

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }

        }
        System.out.println("shift all zeros to right:" +Arrays.toString(arr));
    }

    /**
     * Shift all zeros to left
     * **/

    public static void shiftZerosToLeft(){
        int[] arr = {0,1,2,0,0,3,0,4,0,5};
        int count =arr.length-1; // Position for non-zero elements

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count--;
            }

        }
        System.out.println("shift all zeros to left:" +Arrays.toString(arr));
    }


    /**
     * Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
     * <p>
     * Declare String s with a value alphanumeric(a2b3c4)
     * iterate through loop for(int i=0;i<s.length;i++)
     * check the condition if(Character.isAlphabetic(s.charAt(i)))
     * else Character.getNumericValue(s.char(i)) intilize it to local variable a
     * iterate through loop for(int j=1;j<a;j++)
     * print s.charAt(i-1)// since we already print a char before that's why i-1
     * <p>
     * alternative way by using StringBuilder class
     **/

    public static void convertNumToChar() {
        String s = "a3b2c4d1";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                System.out.print(s.charAt(i));
            } else {
                int a = Character.getNumericValue(s.charAt(i));
                for (int j = 1; j < a; j++) {
                    System.out.print(s.charAt(i - 1));
                }
            }
        }

    }


    // bubble sort iterate two loops one loop with i=0;i<n-1;i++ and another with j
    //check the condition if(arr[j]>arr[j+1])
    // then swap the numbers by declaring the variable temp
    // convert array to list and then array to list by using toArray()

    public static void bubbleSort() {
        int arr[] = {8, 5, 2, 1, 3, 4, 7};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println("bubble sort: ");
        Integer[] listArray = list.toArray(new Integer[0]);
        System.out.println("sorted array: " + Arrays.toString(listArray));
    }

    /**
     * Write a Java Program to print the second largest number in a given array.
     **/

    public static void secondLargestElementInArray() {
        int[] arr = {6, 8, 3, 6, 9, 2, 7, 5};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Integer[] listArray = list.toArray(new Integer[0]);
        System.out.println("Sorted array: " + Arrays.toString(listArray));

        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println("second largest element in array: " + arr[i]);
                break;
            }

        }
    }


    // will check the condition n==0 or n==1 it returns 1 else it returns n*factorial(n-1)

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void swapTwoNumbersWithoutThirdVariable() {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    public static void swapTwoNumbersWithThirdVariable() {
        int a = 20, b = 30, c;
        c = a;
        a = b;
        b = c;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    public static void swapTwoStrings() {
        String str1 = "Hello";
        String str2 = "world";
        System.out.println("Before swapping: ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("\nAfter swapping: ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }


    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum += +r;
            n = n / 10;
        }
        System.out.println("sum of number: " + sum);
    }

    // declare a variable first=n while(first>=10) then first=first/10 and last=n%10 and next sum =first+last

    public static void sumOfFirstAndLastNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();
        int first = n;
        while (first >= 10) {
            first = first / 10;
            System.out.println("first number is: " + first);
        }
        int last = n % 10;
        System.out.println("last number is: " + last);

        int sum = first + last;
        System.out.println("sum of first and last number: " + sum);
    }


    // intilize a string s ="madam" and reverse = " " iterate through forloop and add it to reverse variable

    public static void palindromeString() {
        String s = "madams";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("it is palindrome: " + reverse);
        } else {
            System.out.println("It is not palindrome: " + reverse);
        }

    }

    /**
     * Reverse an array for integers
     * declare instance variable start=0; end = arr.length-1 for indexs
     * check the condition if(start<end)
     * swap the arr using temp variable int temp=arr[start], arr[start]=arr[end], arr[end]=temp
     * increment start and decrement end
     * iterate the loop to display
     **/
    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Display original array");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Display reversed array");
        for (int num : arr) {
            System.out.println(num + "");
        }
    }


    /**
     * Reverse array for characters
     **/

    public static void reverseStringForCharacters() {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println("display reversed array:");
        /*for(char num:ch){
            System.out.println(num+" ");
        }*/
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + " ");
        }

    }

    /**
     * count capital letters in a String
     **/

    public static void countCapWordsInString() {
        String s = "What Is Your Name In Your Profile";
        String[] words = s.split("\\s+");
        int count = 0;
        for (String word : words) {
            char c = word.charAt(0);
            if (!word.isEmpty() && Character.isUpperCase(c)) ;
            count++;
            System.out.println("caps character: " + c);
        }
        System.out.println("caps count: " + count);

    }

    //reverse string  in the same order

    public static String reverseString(String actual) {
        String reverse = " ";
        for (int i = actual.length() - 1; i >= 0; i--) {
            reverse = reverse + actual.charAt(i);
        }
        return reverse;
    }

    public static String reverseEachWordInPlace(String input) {
        String[] words = input.split(" ");
        String result = " ";
        for (String word : words) {
            result += reverseString(word) + " ";
        }
        return result.trim();
    }

    /**
     * Count the number of characters in a string
     * enter a string using scanner and method nextline
     * by using length() of String class count the characters
     **/

    public static void countCharactersInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any String");
        String n = scanner.nextLine();
        //int characterCount = n.length(); // with space
        int characterCount = n.replace(" ", "").length(); //without space
        System.out.println("number of characters in String: " + characterCount);
    }


    // same like reverse number but need to declare temp =n

    public static void palindromeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();
        int r, rn = 0;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            rn = rn * 10 + r;
            n = n / 10;
        }
        System.out.println("number is : " + rn);
        if (temp == rn) {
            System.out.println("it is palindrome: " + rn);
        } else {
            System.out.println("it is not palindrome: " + rn);
        }
    }

    public static void sumOfEvenAndOddNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();
        int i = 0, even = 0, odd = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println("it is even: " + i);
                even += i;
            } else {
                System.out.println("it is odd: " + i);
                odd += i;
            }
            i++;
        }
        System.out.println("sum of even number : " + even);
        System.out.println("sum of odd number: " + odd);
    }

    /*declare a number n and intilize i=1 then check using while i <= n when the number less than n entered into loop
    check if i%2==0 means reminder is not equal to 0 then it is odd next incerement i */

    public static void oddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println("it is odd number: " + i);
            }
            i++;
        }
    }


     /*
    declare a number n and intilize i=0 then check using while i <= n when the number less than n entered into loop
check if i%2==0 means reminder is 0 then it is even next incerement i otherwise it is odd number
     */

    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scanner.nextInt();
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println("print even nummbers:" + i);
            }
            i++;
        }

    }

   /* intilize the varaibles i=0,j=1 and count=0,result=0
    while(count<10) then swap the variable i and j using result and then increment count
     */

    public static void fibnocciSeries() {
        int i = 0, j = 1, count = 0;
        int result = 0;
        while (count < 10) {
            result = i + j;
            i = j;
            j = result;
            count++;
        }
        System.out.println("Fibnocci Series: " + result);
    }

    /*
declare value to n using scanner and sum=0 by using for loop intilize value j=2 then i=1 and count=0
then check the condition using while i<=j if i less than j enters in to the loop,
 check if condition j%i==0 then count++ and i++ if (count==2) sum+=sum+j
 */

    public static void sumOfPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int j = 2; j <= n; j++) {
            int i = 1;
            int count = 0;
            while (i <= j) {
                if (j % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 2) {
                System.out.println("It is prime: " + j);
                sum += j;
            }
        }
        System.out.println("sum of prime numbers: " + sum);
    }


    /**
     * enter a number using Scanner and declare a variable i=1 and count=0 check the  condition i<=n and then if n%i==0 count++ and i++
     * then if count =2 then it is prime number
     **/

    public static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = scanner.nextInt();
        int i = 1, count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println("it is prime: " + n);
        } else {
            System.out.println("it is not prime:" + n);
        }
    }


    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = scanner.nextInt();
        int r, rn = 0;
        while (n > 0) {
            r = n % 10;
            rn = rn * 10 + r;
            n = n / 10;
        }
        System.out.println("reverse number: " + rn);
    }


    public static void armStrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = scanner.nextInt();
        int r, arm = 0;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            arm += r * r * r;
            n = n / 10;
        }
        if (temp == arm) {
            System.out.println("it is armstrong: " + arm);
        } else {
            System.out.println("it is not armstrong:" + arm);
        }
    }
}

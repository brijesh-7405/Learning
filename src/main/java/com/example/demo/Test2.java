//package com.example.demo;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.stream.Collectors;
//
//@ComponentScan
//public class Test2 {
//
////    abcdef
////    abcde
////    abcd
////    abc
////    ab
////    a
//    public static void main(String[] args) {
//
//        String s= "Bri";
//        String str = "Hello is Brijeshw";
//        Matcher m = Pattern.compile("$").matcher(str);
//        m.find();
//        int length = m.end();
//        System.out.println(length);
//        System.out.println(Pattern.matches(".*\\Q" + s + "\\E.*", str));
//        System.out.println(str.contains(s));
//        str.getBytes();
//
//        int n=10;
//        int temp=n,temp2=n,temp3;
//
////        for(int i=1;i<=n;i++){
////            for(int j=1;j<=2*n;j++){
////                if(j==temp||j==temp2){
////                    System.out.print("*");
////                }else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////            temp--;
////            temp2++;
////        }
////        temp2=temp2-2;
////        for(int i=1;i<n;i++){
////            temp2--;
////            temp++;
////            for(int j=0;j<2*n;j++){
////                if(j==temp||j==temp2){
////                    System.out.print("*");
////                }else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////
////        }
//        boolean flag=true;
//        for(int i=1;i<=2*n;i++) {
//            if (i <= n) {
//                for (int j = 1; j <= 2 * n; j++) {
//                    if (j == temp || j == temp2) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//                temp--;
//                temp2++;
//            } else {
//                if(flag){
//                    temp2=temp2-2;
//                }
//                flag =false;
//                temp2--;
//                temp++;
//                for (int j = 0; j < 2 * n; j++) {
//                    if (j == temp || j == temp2) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//
////        String x = System.console().readLine();
////        System.out.println("You entered string " + x);
////        String str = "abcdef";
////        char[] ch = str.toCharArray();
////        // i= 0 -> 5
////        // i=0  abcdef
////        //i=1  0-> 4
////        for(int i=0;i<ch.length;i++){
////            for(int j=0;j<ch.length-i;j++) {
////                System.out.print(ch[j]);
////            }
////            System.out.println();
////        }
////
////
//////        int n=10;
//////        for(int i=1;i<=n;i++){
//////            for(int j=1;j<=n;j++){
//////                if(n>999) {
//////                    if (j <= n - i) {
//////                        System.out.print("\t");
//////                    } else {
//////                        System.out.print("\t  " + i + "\t  ");
//////                    }
//////                }else{
//////                    if (j <= n - i) {
//////                        System.out.print("\t");
//////                    } else {
//////                        System.out.print("\t" + i + "\t");
//////                    }
//////                }
//////            }
//////            System.out.println();
//////        }
////
////
////        int n=4;
////        for(int i=1;i<=n;i++){
////            for(int j=1;j<=i;j++){
////                System.out.print(j+"\t");
////            }
////            System.out.println();
////        }
////        for(int i=1;i<=n;i++){
////            for(int j=1;j<=n-i+1;j++){
////                System.out.print(j+"\t");
////            }
////            System.out.println();
////        }
////
////        int n1=4,c=1;
////        for(int i=0;i<=n1;i++){
////            for(int j=0;j<i;j++){
////                System.out.print(c+"\t");
////                c++;
////            }
////            System.out.println();
////        }
////
////        int n2=16;
////        //i=1 , j=1,2,3,4,5-> *
//////      i=6 , j=1,2,3,4,5-> *
////        // j=1,5 -> *
////        for(int i=1;i<=n2;i++){
////            for(int j=1;j<=n2-1;j++){
////                if(i==1 || i==n2 ||j==1 || j==n2-1){
////                    System.out.print("*\t");
////                }else {
////                    System.out.print("\t");
////                }
////            }
////            System.out.println();
////        }
//
////        int[] array = new int[]{1,2,3,4,5,6,7,8};
////        for(int i=0;i<array.length;i++){
////            System.out.println("a["+i+"] : "+array[i]);
////        }
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter index to swap: ");
////        int index = sc.nextInt();
////        System.out.println("Side: " +
////                "\n 1. left \n 2. right");
////        int side = sc.nextInt();
////        System.out.println("Steps for swap: ");
////        int step = sc.nextInt();
////        if(step>0 && step < array.length && step+index < array.length && index-step>=0){
////            int temp = array[index];
////            if(side == 1){
////                array[index] = array[index - step];
////                array[index - step] = temp;
////            }else {
////                array[index] = array[index + step];
////                array[index + step] = temp;
////            }
////            for(int i=0;i<array.length;i++){
////                System.out.println("a["+i+"] : "+array[i]);
////            }
////        }
//
//
////        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
////        int[] array = new int[]{1,2,3,4,5,6,7,8};
////        Collections.rotate(list,3);
////        System.out.println(list);
////        //a=10,b=33,c=1,d=89,e=11
////
////        int[] a1 = new int[]{1,2,3};
////        int[] a2 = new int[]{4};
////
////        int[] mergedArray = new int[a1.length+a2.length];
////        System.arraycopy(a1,0,mergedArray,0,a1.length);
////        System.arraycopy(a2,0,mergedArray,a1.length,a2.length);
////        System.out.println(Arrays.toString(mergedArray));
//
////        String s = new String("Brijesh is hero");
////        char result[] = new char[s.length()];
//////        System.arraycopy(s, 0, result, 0, result.length);
////        String s1 = "brijesh is developer";
////        String s2 = "developer";
////
////// Getting the reference value using hashCode() method
////        int hashcodeS1 = s1.hashCode();
////        int hashcodeS2 = s2.hashCode();
////
////// Getting the reference value using System.identityHashCode() method
////        int identityHashcodeS1 = System.identityHashCode(s1);
////        int identityHashcodeS2 = System.identityHashCode(s2);
////
////        System.out.println("Reference value (hashCode) of s1: " + hashcodeS1);
////        System.out.println("Reference value (hashCode) of s2: " + hashcodeS2);
////        System.out.println("Reference value (identityHashCode) of s1: " + identityHashcodeS1);
////        System.out.println("Reference value (identityHashCode) of s2: " + identityHashcodeS2);
////        System.out.println("Reference value (identityHashCode) of s2: " + (identityHashcodeS1 & identityHashcodeS2));
////
////        System.out.println(Arrays.toString(s1.getBytes()));
////        System.out.println(Arrays.toString(s2.getBytes()));
////        System.out.println(Test2.stringLength(s2));
//
////        CustomString.encode()
//
//
////        String s1 = "Brijesh is a java developer";
//
//// Calculate the length of the byte array required
////        int length = s1.length();
////
////// Create a byte array with the same length as the string
////        byte[] byteArray = new byte[length];
////
////// Iterate over each character in the string
////        for (int i = 0; i < length; i++) {
////            // Get the Unicode code point of the character
////            int codePoint = s1.charAt(i);
////
////            // Since each Unicode code point can be repr-esented in 16 bits (2 bytes),
////            // we extract the two bytes corresponding to the code point
////            byteArray[i] = (byte) (codePoint >> 8);       // High byte
////            byteArray[i + 1] = (byte) (codePoint & 0xFF); // Low byte
////
////            // Increment i by 1 to skip the low byte in the next iteration
////            i++;
////        }
////
////        System.out.println(Arrays.toString(byteArray));
////
////
////
////        int length2 = s2.length();
////
////// Create a byte array with the same length as the string
////        byte[] byteArray2 = new byte[length2];
////
////// Iterate over each character in the string
////        for (int i = 0; i < length2-1; i++) {
////            // Get the Unicode code point of the character
////            int codePoint = s2.charAt(i);
////
////            // Since each Unicode code point can be represented in 16 bits (2 bytes),
////            // we extract the two bytes corresponding to the code point
////            byteArray2[i] = (byte) (codePoint >> 8);       // High byte
////            byteArray2[i + 1] = (byte) (codePoint & 0xFF); // Low byte
////
////            // Increment i by 1 to skip the low byte in the next iteration
////            i++;
////        }
////
////        System.out.println(Arrays.toString(byteArray2));
////        s.contains();
////        s.toCharArray()
//
//
//
//
//
////        Map<String,Integer> sortedMap =  map.entrySet().stream().sorted((i1,i2)->)
//
////        Select Max(salary) from emp  where salary < (Select Max(slary) from emp);
//    }
//
////    public static int stringLength(String str) {
////        int length = 0;
////        // Iterate through the string until you encounter the null terminator
////        while (str[length] != '\0') {
////            length++;
////        }
////        return length;
////    }
////
//
//
////    public static int stringLength(String str) {
////        CustomString cstr = new CustomString(str.getBytes(), (byte) 0);
////        return stringLength(str) >> cstr.coder(); }
//
//
////    String cs  = "Hello";
////
////    public static int length(String str) {
////        return Test2.length(str) >> str;
////    }
//
//
//
//}
//
//
//@Test
//void searchByName_ValidInput_ReturnsContacts() throws IOException {
//    // Mock InitiationRequest
//    InitiationRequest request = new InitiationRequest();
//    request.setRole("FA");
//    request.setFirstName("John");
//    request.setLastName("Doe");
//    request.setFirmName("Acme Inc");
//    // Mock RestClient response
//    SearchResults searchResults = new SearchResults();
//    ResponseEntity<SearchResults> responseEntity = ResponseEntity.ok(searchResults);
//
//    when(restClientMock.post()).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL())).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())
//            .header(anyString(),anyString())).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())
//            .header(anyString(),anyString()) .header(anyString(),anyString())).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())
//            .header(anyString(),anyString()).header(anyString(),anyString()) .header(anyString(),anyString())).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())
//            .header(anyString(),anyString()).header(anyString(),anyString())
//            .header(anyString(),anyString())
//            .body(any())).thenReturn(requestBodyUriSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())
//            .header(anyString(),anyString()).header(anyString(),anyString())
//            .header(anyString(),anyString())
//            .body(any())
//            .retrieve()).thenReturn(responseSpec);
//    when(restClientMock.post().uri(cdmPoperties.getIdentitySearchURL()).accept(any())
//            .header(anyString(),anyString()).header(anyString(),anyString())
//            .header(anyString(),anyString())
//            .body(any())
//            .retrieve().onStatus(any(),any())).thenReturn(responseSpec);
//    when(responseSpec.toEntity(SearchResults.class)).thenReturn(responseEntity);
//
//
//        when(restOperations.postForEntity(anyString(), any(), eq(SearchResults.class))).thenReturn(responseEntity);
//
//
//    // Call the method
//    Contacts contacts = planContactService.searchByName(request);
//
//    // Verify RestClient called with correct parameters
//    verify(restOperations).postForEntity(eq("http://example.com/search"), any(), eq(SearchResults.class));
//
//    // Verify that the method returns a Contacts object populated with the search results
//    assertEquals(searchResults, contacts);
//}

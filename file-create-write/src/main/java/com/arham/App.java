package com.arham;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class App {
//    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;

        String line1;
        String line2;

        br1 = new BufferedReader(new FileReader("/Users/ashafiq/Downloads/file-create-write/file1.txt"));
        br2 = new BufferedReader(new FileReader("/Users/ashafiq/Downloads/file-create-write/file2.txt"));
        bw = new BufferedWriter(new FileWriter("/Users/ashafiq/Downloads/file-create-write/file3.txt"));
//        FileWriter fw = new FileWriter("/Users/ashafiq/Downloads/file-create-write/file3.txt");


        Map<Long, List<String>> map1 = new HashMap<>();
        Map<Long, List<String>> map2 = new HashMap<>();

        line1 = br1.readLine();
        while(line1 != null) {
            List<String> list1 = new ArrayList<>();
            list1 = Arrays.asList(line1.split(","));
            long id1 = Long.parseLong(list1.get(0)); //key
            List<String> values = list1.subList(1, list1.size());
            map1.put(id1, values);
            line1 = br1.readLine();
        }

        line2 = br2.readLine();
        while(line2 != null) {
            List<String> list2 = new ArrayList<>();
            list2 = Arrays.asList(line2.split(","));
            long id2 = Long.parseLong(list2.get(0)); //key
            List<String> values = list2.subList(1, list2.size()); //value
            map2.put(id2, values);
            line2 = br2.readLine();
        }

        Set<Long> keySet = map1.keySet();

        for (Long k: keySet) {
            List<String> values1 = map1.get(k);
            List<String> values2 = map2.get(k);
            String lineWrite = k + values1.toString() + values2.toString();

            bw.append(lineWrite);
            bw.append("\n");
            System.out.println("done");

        }
        bw.close();







//        List<ArrayList<String>> arrayList = new ArrayList<>(); // 2D list
//        List<String> list = new ArrayList<>();

//        while ((line1 = br1.readLine()) != null) {
//            String[] split1 = line1.split(",");
//            String id1 = split1[0];
//            System.out.println(id1);
//            line2 = br2.readLine();
//            while ((line2 = br2.readLine()) != null) {
//                String[] split2 = line2.split(",");
//                String id2 = split2[0];

//                System.out.println(split2[1]);


//                list.add(id2);
//            }
//            System.out.println(list);
//            System.out.println(split1[0]);
//            for (String s: split1) {
//                System.out.println(s.trim());
//            }
//        }





//        System.out.print("Would you like to create a new file [yes/no]? ");
//        String create = input.nextLine();
//        if (create.equalsIgnoreCase("yes")) {
//            System.out.print("Enter file name (such as file.txt): ");
//            String fileName = input.nextLine();
//            CreateFile.createFile(fileName);
//        }

//        CreateFile.createFile("file2.txt");
//        CreateFile.createFile("file3.txt");

//        System.out.print("Would you like to enter details for a user? yes or no: ");
//        String check = input.nextLine();

//        FileWriter fileWriter = new FileWriter("/Users/ashafiq/Downloads/file-create-write/file1.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.close();
//        bufferedWriter.write("\n" + "Hi");

//        String line = null;
//        if (check.equalsIgnoreCase("yes")) {
//            User user = new User();
//
//            System.out.print("Enter id: ");
//            String id = input.nextLine();
//            user.setId(Long.parseLong(id));
//
//            System.out.print("Enter name: ");
//            String name = input.nextLine();
//            user.setName(name);
//
//            System.out.print("Enter age: ");
//            String age = input.nextLine();
//            user.setAge(Integer.parseInt(age));
//
//            System.out.print("Enter profession: ");
//            String profession = input.nextLine();
//            user.setProfession(profession);
//
//            System.out.print("Are you married [yes/no]? ");
//            String maritalStatus = input.next();
//            user.setMaritalStatus(maritalStatus);
//            System.out.println(user.toString());
//
//            line = user.getId() + ", " + user.getName() + ", " + user.getAge() + ", " + user.getProfession() + ", " + user.getMaritalStatus();
//        }
//        System.out.println(line);
//        bufferedWriter.write("hello there");
//        fileWriter.close();


    }
}

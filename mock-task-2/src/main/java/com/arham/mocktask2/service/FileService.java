package com.arham.mocktask2.service;

import com.arham.mocktask2.model.User;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FileService {

    public User getDataById(long id) {
        BufferedReader br = null;
        String line = null;
        List<String> values = new ArrayList<>();
        List<String> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("/Users/ashafiq/Downloads/file-create-write/file3.txt"));
            line = br.readLine();
            while (line != null) {
                list = Arrays.asList(line.split(", "));
//                String[] arr = line.split(",");
                long userId = Long.parseLong(list.get(0));
                if (userId == id) {
                    values = list.subList(1, list.size());
                    break;
                }
                line = br.readLine();
            }
            // if id not found, values.isEmpty true
            User user = new User();
            if (!values.isEmpty()) {
                user.setId(id);
                user.setName(values.get(0));
                user.setAge(Integer.parseInt(values.get(1)));
                user.setProfession(values.get(2));
                user.setMaritalStatus(values.get(3));
                user.setBankName(values.get(4));
                user.setAccountNumber(Long.parseLong(values.get(5)));
                user.setCreditCardStatus(values.get(6));
            }
        return user;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

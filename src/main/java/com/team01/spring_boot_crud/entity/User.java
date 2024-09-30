package com.team01.spring_boot_crud.entity;

import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String fname;
    private String lname;
    private String email;

}

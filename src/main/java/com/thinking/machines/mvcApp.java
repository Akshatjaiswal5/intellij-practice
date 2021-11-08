package com.thinking.machines;
import com.thinking.machines.pojo.*;
import javax.swing.*;

public class mvcApp extends JFrame {

    Student s;

    public mvcApp(){
        s=new Student(1,"Akshat",'M');
        setTitle(s.getName());

        setVisible(true);
        setSize(500,500);
        setLocation(100,100);
    }
}
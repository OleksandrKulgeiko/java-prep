package com.kulgeiko.designpatterns.a_creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
public class DevTeam implements TeamPrototype{

    @Getter
    private List<String> empList;

    public DevTeam(){
        empList = new ArrayList<>();
    }

    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Oleksandr");
        empList.add("Dmitriy");
        empList.add("Vasyl");
        empList.add("Andrii");
    }

    @Override
    public TeamPrototype clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new DevTeam(temp);
    }
}
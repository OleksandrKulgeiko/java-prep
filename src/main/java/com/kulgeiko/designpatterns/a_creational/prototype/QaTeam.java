package com.kulgeiko.designpatterns.a_creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class QaTeam  implements TeamPrototype{

    @Getter
    private List<String> empList;

    public QaTeam(){
        empList = new ArrayList<>();
    }

    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pavlo");
        empList.add("Iryna");
    }

    @Override
    public TeamPrototype clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new QaTeam(temp);
    }
}
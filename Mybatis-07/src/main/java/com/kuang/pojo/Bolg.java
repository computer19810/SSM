package com.kuang.pojo;

import lombok.Data;

import java.util.Date;
import java.util.PriorityQueue;

@Data
public class Bolg {
    private String id;
    private String title;
    private String author;
    private Date CreateTime;
    private int views;
}

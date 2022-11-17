package com.example.producer.entity;

import lombok.Data;

import java.util.List;


@Data
public class DeviceMaster {

    private Integer id;


    private String deviceModel;


    private String deviceMacId;


    private Long deviceCreateTs;


}

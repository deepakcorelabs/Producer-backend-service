package com.example.producer.entity;

import lombok.Data;



@Data
public class ChannelStats {

    private Integer id;


    private Long recordCreateTs;


    private ChannelMaster channelId;


    private DeviceMaster deviceId;


    private Long count;


    private Double totalDuration;


    private String startTime;


    private String endTime;


    private Long startTs;


    private Long endTs;



}

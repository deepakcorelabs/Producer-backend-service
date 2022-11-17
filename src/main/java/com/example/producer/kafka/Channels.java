package com.example.producer.kafka;

import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
public class Channels
{
    private String name;

    private Long count;

    private Long total_duration;

    private List<ChannelsTimes> channelsTimesList;

}

package com.sps.jms.model;

import lombok.*;

import java.io.Serializable;

/**
 * Created by kaktas on 02-Mar-20
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SampleMessage implements Serializable {

    static final long serialVersionUID = 4016243529455584045L;

    private String id;
    private String message;
}

package com.ats.ats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Data;

import java.util.Calendar;

@JsonIgnoreProperties
@Data
@JsonPOJOBuilder
public class Search {

    private String source;
    private String destination;
    private Calendar journeyDate;

}

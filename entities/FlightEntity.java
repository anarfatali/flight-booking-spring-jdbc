package org.spring.springbootstarterjdbctemplate.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("flights")
@Getter
@Setter
public class FlightEntity {

    @Id
    private Long flightId;
    private String destination;
    private String fromm;

}

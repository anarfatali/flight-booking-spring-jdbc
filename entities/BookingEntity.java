package org.spring.springbootstarterjdbctemplate.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("bookingss")
@Getter
@Setter
public class BookingEntity {

    @Id
    private Integer id;
    private String bookerName;
    private String bookerSurname;

}

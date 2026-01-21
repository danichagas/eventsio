package com.eventsio.api.domain.coupon;

import com.eventsio.api.domain.events.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Data valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
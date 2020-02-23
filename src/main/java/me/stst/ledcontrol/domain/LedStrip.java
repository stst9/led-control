package me.stst.ledcontrol.domain;

import javax.persistence.*;

@Entity
@Table(name = "led_strips")
public class LedStrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ls_id",unique = true,nullable = false)
    private int id;

    @Column(name = "ls_name",nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "d_id",nullable = false)
    private Device device;

    @Column(name = "ls_led_count")
    private int led_count;
}

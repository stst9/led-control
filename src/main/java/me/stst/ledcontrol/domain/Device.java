package me.stst.ledcontrol.domain;

import javax.persistence.*;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "d_id",unique = true,nullable = false)
    private int id;

    @Column(name = "d_name",unique = true,nullable = false)
    private String name;
}

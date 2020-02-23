package me.stst.ledcontrol.domain;

import javax.persistence.*;

@Entity
@Table(name = "led_programs")
public class LedProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lp_id")
    private int id;

    @Column(name = "lp_name",unique = true,nullable = false)
    private String name;

    @Column(name = "lp_number",unique = true)
    private int number;
}

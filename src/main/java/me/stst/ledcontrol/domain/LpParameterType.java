package me.stst.ledcontrol.domain;

import javax.persistence.*;

@Entity
@Table(name = "lp_parameter_types")
public class LpParameterType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lppt_id")
    private int id;

    private String name;
}

package org.example.controlle_blanc;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Incident {
    private int reference;
    private Date time;
    private String status;
    private Membre membre;
}

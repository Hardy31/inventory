package org.trk.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Data
//@Builder
@NoArgsConstructor(force = true)
@Entity
@Table(name = "tmc", schema = "public")
public class Position implements Serializable {

    @Id
//    @Column (length = 25)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(nullable = false, length = 100)
    private String code;

    @Column(nullable = false, length = 1000)
    private  String description;

    @Column(length = 50)
    private  String location;

    @Column
    private  String tag;

    public Position(String code, String description, String location, String tag) {
        this.code = code;
        this.description = description;
        this.location = location;
        this.tag = tag;
    }

    public Position(Integer id, String code, String description, String location, String tag) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.location = location;
        this.tag = tag;
    }


    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}

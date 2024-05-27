package org.trk.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
@ToString
@Entity
@Table(name = "tmc", schema = "public")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(nullable = false, length = 100)
    private String code;                    //Инвентарный код

    @Column(nullable = false, length = 1000)
    private  String description;            //Описание, расшифровка позиции

    @Column(name = "components")
    @OneToMany (fetch = FetchType.EAGER)
    @JoinColumn(name = "tmc_id")
    private List<Position> components;            //Компоненты (композиция) составляющие комплект

    @Column(name = "location", length = 50)
    private  String location;               //место нахождения (кабинет, склад, ...

    @Column
    private  String tag;                    // дополнительная информация

}

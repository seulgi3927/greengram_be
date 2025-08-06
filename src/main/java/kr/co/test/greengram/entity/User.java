package kr.co.test.greengram.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = { "uid"}
                )
        }
)
public class User extends UpdateAt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(length = 30)
    private String nickName;

    @Column(nullable = false, length = 50)
    private String uid;

    @Column(length = 100)
    private String pic ;

    @Column(nullable = false, length = 100)
    private String upw;



}

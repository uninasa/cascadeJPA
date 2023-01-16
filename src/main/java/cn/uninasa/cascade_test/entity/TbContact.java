package cn.uninasa.cascade_test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_contact",schema = "public")
public class TbContact {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name="phone")
    private String phone;
    @Column(name="entity_id")
    private Integer entityId;
}

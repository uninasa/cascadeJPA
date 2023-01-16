package cn.uninasa.cascade_test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_entity",schema = "public")
public class EntityMessage{
    @Id
    private Integer id;
    @Column(name = "num")
    private Integer num;
    @Column(name="type")
    private Integer type;
    @Column(name = "prize")
    private String prize;
    @Column(name = "quantity")
    private String quantity;
}

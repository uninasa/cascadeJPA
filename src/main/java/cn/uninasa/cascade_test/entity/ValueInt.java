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
@Table(name = "value_int",schema = "public")
public class ValueInt {
    @Id
    private Integer id;
    @Column(name = "entity_id")
    private String entityId;
    @Column(name="attribute_id")
    private String attributeId;
    @Column(name = "value")
    private String value;
}

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
@Table(name = "value_string",schema = "public")
public class ValueString {
    @Id
    private Integer id;
    @Column(name = "entity_id")
    private Integer entityId;
    @Column(name="attribute_id")
    private Integer attributeId;
    @Column(name = "value")
    private String value;
}

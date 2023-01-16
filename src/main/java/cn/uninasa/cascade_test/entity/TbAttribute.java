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
@Table(name = "tb_attribute",schema = "public")
public class TbAttribute {
    @Id
    private Integer id;
    @Column(name = "attribute_name")
    private String attributeName;
    @Column(name="attribute_record")
    private String attributeRecord;
}

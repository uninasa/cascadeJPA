package cn.uninasa.cascade_test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Data
@SQLDelete(sql = "UPDATE tb_entity SET delete=1 WHERE id=?")
@Where(clause = "delete=0")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_entity",schema = "public")
public class TbEntity {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "delete")
    private Integer delete;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "entity_id",referencedColumnName = "id")
    private List<TbContact> list;
}

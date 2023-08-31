package ku.cs.Kafeine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    @OneToMany(mappedBy = "category")
    List<Menu> menus;
}

package ku.cs.Kafeine.repository;

import ku.cs.Kafeine.entity.OrderItem;
import ku.cs.Kafeine.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository
        extends JpaRepository<OrderItem, OrderItemKey> {
}
